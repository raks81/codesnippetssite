# Introduction #
Recently I was working on a DB2 stored procedure that required some string to be converted to HEX and stored in DB as HEX. The column where the data was supposed to put was of type VARCHAR. After a lot googling, I was able to write this stored procedure.
The key here was the way 'X' is used to denote that the string following is a HEX and also how apostrophe(') needs to be escaped in DB2. The code below is just a snippet of the actual stored procedure.

# Details #
```
CREATE PROCEDURE PLAY.INSERT_RATE (....                                                
              IN IN_DELTA_TABLE_PRKY VARCHAR(254),
              OUT OUT_RATE_ID INTEGER
             )

--Build the HEX value that nees to be stored
.........

SET IN_DELTA_TABLE_PRKY = (select (IN_DELTA_TABLE_PRKY || HEX(TRIM(CHAR(RATE_IDENTIFIER)))) from sysibm.sysdummy1);

SET V_SQL = 'INSERT INTO PLAY.DELTACTB (PRKY, GPVN, TACC, TANA, POLN) VALUES (x'''||IN_DELTA_TABLE_PRKY||''',?,?,?,?)';
PREPARE S_SQL FROM V_SQL;
EXECUTE S_SQL using GROUP_POLICY_VERSION, TACC_CODE, RATE_TABLE_NAME, IN_POLICY_NUM;

--SET THE OUT PARAMETER
SET OUT_RATE_ID = RATE_IDENTIFIER;

.................

```