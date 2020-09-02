## Proyecto de iniciación a la Integración Continua

Este es un proyecto base, para trabajar con los pipelines de jenkins. 

###Objetivo   

El objetivo es crear un ciclo de Integración Continua básico, trabajando con buenas prácticas.
 

###Usage: 
mvn clean compile --> Build the project. 
mvn clean install --> Executes unit tests and integration tests.
mvn clean test --> Executes unit test. 
mvn clean sonar:sonar --> Executes sonar in the project
mvn clean integration-test --> Executes unit and integration tests.
mvn clean install -Pcoverage --> Executes unit tests and integration tests and generates an unit, integration and merged tests coverage report in target/site/jacoco-merged-test-report
mvn clean install -Pacceptance-test --> Launch only acceptance test with cucumber runner. No reports generated.
mvn deploy -X -DskipTests -Ddockerfile.skip --> Deploy the artifact in Nexus