# NagwaTask
UI Automation Testing for Nagwa Education Website : https://www.nagwa.com/

#### *Description*

 UI Automation script build with java selenium


#### *Test Data and Test Classes *

- All Test data inisde  "config.properties" file.
- PageObjects PackageIncludes all Pages starts with NameOfPage_mainfunctionality_page , inisde every class includes its own methods 
- Utilities Package includes 2 java classes first one is :PropertiesConfig.java configuration and handling config.properties file.
-config.properties file contains all test data in project
- ObjectRepo: Identify all element locators inside the project 
- BaseTests Package includes configuration for test runs and priorties.

#### *Getting Started*

- Within your IDE import this project by clone the project url, before that you need to signin with GitHub.
- IntelliJ first fork the project to you repositories (File >> New >> Project from Version Control >> GitHub (Login) >> Select the project >> Clone )
- Eclipse (File >> import >> Git >> Projects from Git >> Clone URI >> Copy the URI >> Next >> Next >> Check "Clone submodules" >> Next >> Next >> Finish)

#### *Prerequisites*

- JDK 14
- Lastest Eclipse or IntelliJ IDE.
- Lastest Chrome WebDriver.
- Latest Chrome Browser.

### *Tests*

To Run the code go to BaseTests Package then select TestRuns file and run it .

#### *Technology Used* 

Java, TestNG, Selenium, MavenFramework Used: Page Object Model
