# Readify 'RedPill' Webservice

A java implementation of the Readify webservice outlined by the [Knock! Knock!](https://knockknock.readify.net)
task used for recruitment.

### Prerequisites

- [JDK](http://www.oracle.com/technetwork/java/javase/downloads) (7 or above)
- [Maven](http://maven.apache.org/download.cgi) (3 or above)

### Building

Simply by calling `mvn package` will build the application (NOTE this branch contains the generated
source for the wsdl service - just in case the wsdl changes).

The generated classes are then used in association with the implementation file (the only source code
in this repository) to implement this service.

### Running

Calling `java -jar target/readify-redpill-0.1.0.jar` from the command line will run the application.
The appliction will start the http service on port 8080 which will provide the wsdl endpoint and associated
service at `http://localhost:8080/RedPill.svc?wsdl`.