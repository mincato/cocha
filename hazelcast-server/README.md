mate-search:
========================
Author: Centaurico  
Technologies: Hazelcast  

System requirements
-------------------

The application this project produces is designed to be run as java standalone. 

All you need to build this project is Java 8.0 (Java SDK 1.8) or later, Maven 3.0 or later.
 
Configure Maven
---------------

If you have not yet done so, you must [Configure Maven]
 
Build and Deploy
-------------------------

_NOTE: The following build command assumes you have configured your Maven user settings. If you have not, you must include Maven setting arguments on the command line.

1. Open a command prompt and navigate to the root directory of this project.
2. Type this command to build the archive:

        mvn clean package

3. This will create `target/hazelcast-server.jar`.
4. Type this command to run the application:
		
		java -jar target/hazelcast-server.jar