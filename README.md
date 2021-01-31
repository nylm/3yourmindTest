# Test Automation Framework of 3yourmind web application with Cucumber BDD framework using Selenium and Java
This is the test automation framework developed for web application http://app.3yourmind.com/. 
This automation framework is developed using Selenium, Java, Cucumber, Gherkin, Junit and Maven.

## Project Description

It is a behavior driven development (BDD) approach to write automation test script to test Web applications. 
It enables you to write and execute automated functional/smoke/regression tests. It is cross-platform, open source, free, easily maintainable . 

## Installation

Prerequisites: You need to have following softwares installed on your computer

1) Install JDK 12.0.1 and set path
2) Install Maven and set path
3) IntelliJ
4) IntelliJ Plugins: "Cucumber for Java" and "Gherkin"

```
git clone https://github.com/ylm3/3yourmindTest.git
```

## Writing test cases
1) Create a feature file in the features directory under resources. (it should have the ".feature" extension.)
2) Write test scenario(s)/steps with Gherkin Language in that feature file.
3) Locate web elements in related page class in Pages directory.
4) Create a Java class in Stepdefinitions directory and automate steps.



## Execute test cases in the framework

Installation: In order to start using the project you need to clone the project to your local repo.

First way -> Navigate to your project directory from terminal and run following commands 

```
mvn clean verify
```

Second way -> Open the Project in IntelliJ and run CukesRunner class.


## Notes :

1) Data Driven Testing (DDT) can be implemented by using Scenario Outline and Examples keywords in features.
2) In order to run specific test case, you can change tags in CukesRunner or you can override default tags with Maven following commands
```
 mvn verify -Dcucumber.options="--tags @login"
 ```
3) You can find test reports in Target folder (cucumber-html-reports / default-html-reports)


In order to open .html report file in terminal, run following commands 

```
open -a "Google Chrome" overview-features.html 
```
