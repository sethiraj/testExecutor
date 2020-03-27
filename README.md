# testExecutor

This is Spring boot based framework for executing Cucumber (BDD) files as a spring-boot service

# Setup

- Ensure the features files are placed @src/main/resources/features
- Ensure your model classes are placed under com.framework.executor.model package
- Ensure any utility classes are placed under com.framework.executor package
- Ensure the step defintions are placed under com.framework.executor.stepdefintions package

# Execution through Spring-boot

Use mvn spring-boot:run

# Deploy to tomcat to trigger tests via API

Use maven to create war with command 
- mvn install

To have our WAR file deployed and running in Tomcat, we need to complete the following steps:

- Download Apache Tomcat and unpackage it into a tomcat folder
- Copy our WAR file from target/test-executor.war to the tomcat/webapps/ folder
- From a terminal navigate to tomcat/bin folder and execute
- catalina.bat run (on Windows)
- catalina.sh run (on Unix-based systems)
- Execute http://localhost:8080/test-executor/api/v1/trigger to trigger the BDD tests
