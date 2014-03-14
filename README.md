Google-App-Engine-with-maven
============================

Project templates for Google App Engine using maven  
More info:  
https://developers.google.com/appengine/docs/java/tools/maven

**maven**
Download and install maven:  
http://maven.apache.org/  


Templates
---------
**testapp** *skeleton-archetype*  
Empty skeleton with very minimal depedencies  
**build**
perform these commands:  
```
mvn clean install
mvn -pl myproject-ear appengine:devserver
```
Your dev server will be running at `http://localhost:8080/`
