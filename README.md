## Project Name: BDD Framework with Java and Cucumber 
### Author: Leeroy Ruzvidzo
### Table of contents
- [Overview](#overview)
- [Installation](#installation )
- [Getting Started](#getting started )
- [Usage](#usage)
- [Configuration](#configuration)
- [Running Test](#running test)
- [Examples](#examples)
- [Reporting](#reporting)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [Troubleshooting](#troubleshooting)
- [License](#license)
- [Credits](#credits)

## Overview
- This project utilizes Cucumber, Java, and Maven to implement behavior-driven development (BDD) test scenarios. It enables you to write test cases in a human-readable format and automatically execute them using Cucumber.
## Installation
- Install java and set up the environment variables.
- Install Maven to manage dependencies.
- Clone this repository to your local machine.
## Getting Started
- Clone the project repository to your local machine.
- Navigate to the project root directory.
## Usage 
- You can find the feature files under the 'src/test/resources' directory. These files contain test scenarios written in Gherkin syntax.
- For each scenario, create corresponding step definition classes in the 'src/test/java' directory. These classes should map the Gherkin steps to Java code.
## Configuration
- If you need to adjust any configurations, check the 'cucumber.properties' file located in the 'src/test/resources' directory.
## Running Test
-To run the Cucumber tests: Run via the Cucumber+ Tab ,Run MedicalHistoryTestRunner or  use the following Maven command:
mvn test as a Maven Project
## Examples 
- MedicalHistory.feature -> stepdefinition -> LandingPageStepDefinition -> pageobjects -> LandingPage -> Home_Repository-> TechStudies -> Data_Acquisition -> Forms -> Logout
## Reporting
- After running the tests, the Cucumber report will be generated. You can find it in the 'target/cucumber-reports' directory.
## Dependencies
- Used a number of dependencies from maven repository to get to see the dependencies used please open pom.xml file.
## Contributions
- We welcome contributions! If you'd like to contribute to this project.The project is on GIT please feel free to make your contributions.
## Troubleshooting
- Build a project by running it through the Terminals or Through cucumber runner and read exceptions to debug the code
## License
- This project is licensed under the [MIT License](License).
## Credits
- Maven Repository
- Java Domains
- Selenium Domains
- Cucumber

Happy testing with Cucumber Java Maven Project! If you have any questions or encounter any issues, feel free to reach out by Commenting on my GIT repository.