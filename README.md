# JpetStore Automation Example
Automated tests for http://przyklady.javastart.pl/jpetstore/. Java, Selenium, Maven, TestNG, Page Object Pattern, Allure are used.
## Getting Started
1. Get a copy of the project to your local machine.
2. Change the locations for browsers drivers in configuration.properties file (path to file src/main/resources), if you have different. Configuration.properties file has example locations.
3. Set local browser in configuration.properties file to run tests. You can set **CHROME**, **FIREFOX**, **IE**.
```
local.browser=CHROME
```
## Running the tests
1. Go to the directory where it is located pom.xml file.
2. Run command line and write:
```
mvn clean test
```