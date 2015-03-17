#Home for simple(and complex) shell scripts.

# Introduction #

This page will be a place holder for shell that I create/come across and find helpful.


# Details #
```
for file in $(find . -iname "*.ZIP"); do 
 unzip -l $file|grep -f tofind.txt > /dev/null ; 
 res=$? ;
 if [ $res -eq 0 ] ; then 
  echo $file ; 
 fi ; 
done
```

## Passwordless login in Linux systems ##
```
user@local-host$ ssh-keygen
user@local-host$ ssh-copy-id -i ~/.ssh/id_rsa.pub remote-host
user@local-host$ ssh remote-host
```

## ssh alias creation ##
Add the below to this file `~/.ssh/config`

```
Host alias1
  HostName hostname
  User username

Host alias2
  HostName hosname2
  User username

```

## Check if list of patterns are in a file ##

```
for line in `cat hosts.txt`; do   if [ `grep $line output.txt|wc -l` -eq 0 ] ; then echo $line; fi done
```

## Clean file based on pattern ##
```
for line in `cat output.txt`; do if [[ "$line" = *serialNumber* ]] ; then echo $line >> filtered.txt; fi done
```