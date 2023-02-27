# Gradle_Selenium_TestNG_Demo
This is a Gradle project using Selenium with TestNG. This framework is also generating Allure Report.

1. Run the tests using the below command  
```
gradle clean test
```

2. TestNG generate Reports under ***GradleReports*** folder  

3. Add below-mentioned plugin and dependency to the ***build.gradle*** to generate the Allure Report
```
plugins {
    id 'io.qameta.allure' version '2.11.0'
}
```

```
dependencies {
    implementation 'io.qameta.allure:allure-testng:2.19.0'
}
```

4. To generate the Allure Report, use the below command after completion of test execution  
```
allure serve build/allure-results
```
