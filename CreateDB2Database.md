# Introduction #

Steps to create a new DB2 Database from scratch


# Details #
Step 1: Create users and groups

```
groupadd db2i1grp
groupadd db2fcgrp
groupadd db2asgrp

useradd -g db2i1grp -m -d /home.local/db2inst1 db2inst1
useradd -g db2fcgrp -m -d /home.local/db2fc db2fc
useradd -g db2asgrp -m -d /home.local/db2as db2as
```

Step 2: Create DB admin server
```
/opt/ibm/db2/V9.7/instance/dascrt -u db2as
```

Step 3: Create instance
```
/opt/ibm/db2/V9.7/instance/db2icrt -u db2fc db2inst1
```

Step 4: Add this to the /etc/services
```
db2c_db2inst1	50000/tcp
```

Step 5: Apply license
```
db2licm -a db2ese_u.lic
db2licm -l
```

Step 6: Set DB2 Registry
```
db2set DB2COMM=TCPIP
db2set DB2_PARALLEL_IO=*:7
```

Step 7: Update DBM CFG
```
UPDATE DBM CFG USING
    DFT_MON_BUFPOOL ON
    DFT_MON_LOCK ON
    DFT_MON_SORT ON
    DFT_MON_STMT ON
    DFT_MON_TABLE ON
    DFT_MON_TIMESTAMP ON
    DFT_MON_UOW ON
    HEALTH_MON OFF

    INSTANCE_MEMORY 2097152

    SVCENAME db2c_db2inst1

    MAX_QUERYDEGREE ANY
    INTRA_PARALLEL NO
;
```

Step 8: Start Database
```
db2start
```

Step 9: Create Database
```
CREATE DATABASE MYDB
    AUTOMATIC STORAGE NO
    ON /opt/data/db2db/db2inst1
    USING CODESET UTF-8 TERRITORY DE
    COLLATE USING SYSTEM_923_DE
    PAGESIZE 8 K
    DFT_EXTENT_SZ 32
    RESTRICTIVE
    CATALOG TABLESPACE
        MANAGED BY DATABASE USING
        (
            FILE '/opt/data/db2db/db2inst1/MYDB/syscatspace' 8192
        )
        EXTENTSIZE 4 PREFETCHSIZE 4
        NO FILE SYSTEM CACHING
        AUTORESIZE YES INCREASESIZE 96 M MAXSIZE NONE        
    USER TABLESPACE
        MANAGED BY DATABASE USING
        (
            FILE '/opt/data/db2db/db2inst1/MYDB/userspace1' 8192
        )
        EXTENTSIZE 32 PREFETCHSIZE 32
        NO FILE SYSTEM CACHING
        AUTORESIZE YES INCREASESIZE 96 M MAXSIZE NONE            
    TEMPORARY TABLESPACE
        MANAGED BY SYSTEM USING
        (
            '/opt/data/db2db/db2inst1/MYDB/tempspace1'
        )
        EXTENTSIZE 32 PREFETCHSIZE 32
        NO FILE SYSTEM CACHING
;

```


Step 10: Update DB Config

```
CONNECT TO MYDB;

UPDATE DB CFG USING
     DFT_QUERYOPT 5
     DFT_DEGREE 1

     SELF_TUNING_MEM ON
     DATABASE_MEMORY AUTOMATIC
     LOCKLIST 4096
     MAXLOCKS 22
     PCKCACHESZ 16384 AUTOMATIC
     SHEAPTHRES_SHR 32768 AUTOMATIC
     SORTHEAP 4096 AUTOMATIC

     DBHEAP 2048 AUTOMATIC
     CATALOGCACHE_SZ 2014
     LOGBUFSZ 256
     UTIL_HEAP_SZ 5000
     STMTHEAP 16384 AUTOMATIC
     APPLHEAPSZ 256 AUTOMATIC
     APPL_MEMORY 10000 AUTOMATIC
     STAT_HEAP_SZ 4384 AUTOMATIC

     LOCKTIMEOUT 120

     CHNGPGS_THRESH 40
     NUM_IOCLEANERS AUTOMATIC
     NUM_IOSERVERS AUTOMATIC

     MAXAPPLS 100 AUTOMATIC
     AVG_APPLS 2 AUTOMATIC

     LOGFILSIZ 16384
     LOGPRIMARY 4
     LOGSECOND 16
     NEWLOGPATH /opt/data/db2log/db2inst1

     SOFTMAX 100

     AUTO_MAINT OFF
         AUTO_DB_BACKUP OFF
         AUTO_TBL_MAINT ON
             AUTO_RUNSTATS ON
                 AUTO_STMT_STATS ON
             AUTO_STATS_PROF OFF
                 AUTO_PROF_UPD OFF
             AUTO_REORG OFF
;

TERMINATE;
```



Step : Create Buffer Pools

```
CONNECT TO MYDB;

ALTER BUFFERPOOL IBMDEFAULTBP
    SIZE 262144 AUTOMATIC
;

CREATE BUFFERPOOL TEMPBP
    SIZE 65536 AUTOMATIC
    PAGESIZE 8 K
;

TERMINATE;
```

Step : Create Table Spaces

```
CONNECT TO MYDB;

ALTER TABLESPACE TEMPSPACE1
    BUFFERPOOL TEMPBP
    PREFETCHSIZE AUTOMATIC
;

ALTER TABLESPACE USERSPACE1
    PREFETCHSIZE AUTOMATIC
;

CREATE LARGE TABLESPACE DATASPACE1
    PAGESIZE 8 K
    MANAGED BY DATABASE USING
        (
            FILE '/opt/data/db2db/db2inst1/MYDB/dataspace1' 6291456
        )
        EXTENTSIZE 112 PREFETCHSIZE AUTOMATIC
        AUTORESIZE YES INCREASESIZE 12 G MAXSIZE NONE            
        BUFFERPOOL IBMDEFAULTBP
        NO FILE SYSTEM CACHING
;

CREATE LARGE TABLESPACE INDEXSPACE1
    PAGESIZE 8 K
    MANAGED BY DATABASE USING
        (
            FILE '/opt/data/db2db/db2inst1/MYDB/indexspace1' 3145728
        )
        EXTENTSIZE 112 PREFETCHSIZE AUTOMATIC
        AUTORESIZE YES INCREASESIZE 6 G MAXSIZE NONE            
        BUFFERPOOL IBMDEFAULTBP
        NO FILE SYSTEM CACHING
;

CREATE LARGE TABLESPACE ADMINSPACE1
    PAGESIZE 8 K
    MANAGED BY DATABASE USING
        (
            FILE '/opt/data/db2db/db2inst1/MYDB/adminspace1' 2097152
        )
        EXTENTSIZE 112 PREFETCHSIZE AUTOMATIC
        AUTORESIZE YES INCREASESIZE 2 G MAXSIZE NONE            
        BUFFERPOOL IBMDEFAULTBP
        NO FILE SYSTEM CACHING
;

TERMINATE;
```