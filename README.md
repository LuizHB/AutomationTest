# AutomationTest

![Badge](http://img.shields.io/static/v1?label=STATUS&message=UPDATING&color=BRIGHTGREEN&style=for-the-badge)

![JAVA](http://img.shields.io/static/v1?label=Java-jdk&message=v17.0.2&color=blue)


Project based in Java + Selenium using automation methods. The project runs in a website with a project plan. The website used is http://automationpractice.com/index.php

A sample with the methods without using the project plan can be found in [AutomationSample.java](/src/test/java/AutomationSample.java)

The main method of the project plan is found in [LoginTest.java](/src/test/java/test/LoginTest.java)

Second method is found in [ShoppingTest.java](/src/test/java/test/ShoppingTest.java)

## List of tests (main method):
- Successful login
- Unsuccessful login tests:
    - Blank email
    - Blank password
    - Wrong email
    - Wrong password
- Recovery of forgotten password
- Account creation

## Extra tests:
- Successful purchase with bank wire

## Tests to do:
- [ ] Successful purchase with check
- [ ] New clothes and categories
