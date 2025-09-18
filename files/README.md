# Basic Cucumber Project

This is a simple Cucumber project using Java, Maven, and JUnit.

## Structure

```
.
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── Login.java
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           ├── StepDefinitions.java
│       │           └── RunCucumberTest.java
│       └── resources
│           └── features
│               └── login.feature
```

## How to Run

1. Install Maven.
2. Run tests with:  
   `mvn test`
```