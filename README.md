# Readify 'RedPill' Webservice

A java implementation of the Readify webservice outlined by the [Knock! Knock!](https://knockknock.readify.net)
task used for recruitment.

### Prerequisites

[JDK](http://www.oracle.com/technetwork/java/javase/downloads) (7 or above)
[Maven](http://maven.apache.org/download.cgi) (3 or above)

### Building

Simply by calling `mvn package` the application should generate the webservice interfaces provided
by the Knock! Knock! applications wsdl definition. (This is done using java's `wsimport` commamand line
generator on the `"http://knockknock.readify.net/RedPill.svc?wsdl"` endpoint).

The generated classes are then used in association with the implementation file (the only source code
in this repository) to implement this service.

Alternativly you can check out the 'wsdl-source' branch if you wish to compile the service from previously
generated wsdl source files.

### Running

Calling `java -jar target/readify-redpill-0.1.0.jar` from the command line will run the application.
The appliction will start the http service on port 8080 which will provide the wsdl endpoint and associated
service at `http://localhost:8080/RedPill.svc?wsdl`.