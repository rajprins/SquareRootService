# SquareRootService
Basic example of an annotation based WebService

**To deploy:**
mvn clean install tomcat:run-war
Look for "Running war on http://xxx" and
"Setting the server's publish address to be /yyy"
in console output; WSDL browser address will be
concatenation of the two: http://xxx/yyy?wsdl


**Note:**
http://localhost:8080/SquareRootService/squareroot
http://localhost:8080/SquareRootService/squareroot?wsdl