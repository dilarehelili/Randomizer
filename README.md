
## Randomizer - is a RESTful webservice that generates random address.

Tools and frameworks: 
1) Java 11
2) Spring Boot 2.4.0
3) Maven 3
4) Tomcat
5) JUnit 5


### Endpoints: 

GET /randomizer/address - to get random address

#### Response body example: 

{
    "house": "180",
    "street": "1866 Fifth Avenue",
    "postalCode": 18176,
    "city": "Ontario",
    "county": "Niagara",
    "state": "California",
    "stateCode": "CA",
    "country": "Mexico",
    "countryCode": "MEX"
}

### Application Port: 
By default this application runs on port 8080. To run on a different port, change property value of server.port on application.properties file. 
Logging: 

### Mock data

Mock data stored in src/main/resources/data.

### Unit Testing: 
There are 7 test cases. To run tess, execute maven goal test. 

### Start the Application: 
To run tests, execute ./mvnw spring-boot:run in the terminal.

### Application URL: 
http://localhost:8080/randomizer/address 

### Stop the Application: 
Press Control + C in the terminal to terminate execution.