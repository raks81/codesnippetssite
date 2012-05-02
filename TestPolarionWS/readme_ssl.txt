If the ticketing system uses ssl then the certificate needs to be added to the keystore of the 
JRE that runs the program:

jre\lib\security>..\..\bin\keytool.exe -import -alias polarion -keystore cacerts -storepass changeit -file cert_file.der


