# DanielDukeInterviewTest

This project showcases my ClearScore Interview Test response.

Notes:
Test 1: Cookies
  I learnt lots about how to import JUnit and Selenium 3.0, and the foibles that involves (e.g. having to export the gecko.exe into my $PATH etc)
  Unfortunately, even after being able to launch a FF window, the .get method still failed to input text into the address bar.
  A developer friend of mine helped me, and committed to this project. We replaced FireFoxDriver with HtmlUnitDriver, so that the tests run headless (increasing their speed)
  I ran the first test and received JS errors. To verify that this was not an issue with the test, I created a second test, using www.rightmove.co.uk as the example, but also received errors.
  
  The first test I added (openClearScoreHomepageAndVerifyTheCookieBarCanBeClickedAndIsThenDismissed) tests;
    Going to clearscore.com
    Locates cookie bar
    Clicks 'No problem'
    That the bar then isn't visible
    
  The second test is to check that the correct cookie (CS_ACCEPT_COOKIES) has been set if the user accepts the policy
  
  The final test is to check that CS_ACCEPT_COOKIES is not set if the user clicks 'More info'
  
Test 2: API test for failed login
  I am not able to write the test but I understand the approach.
  Using RESTAssured, I would send a failed log in request, then intercept the response and assert that a 403 was being thrown.
  This could also be tested using tools such as POSTMan or RESTConsole
  
Test 3: ClearScore calculator
  

Additional Questions:

1. How would you integrate the tests you have written into a continuous integration environment?


2. How would you make your API test simulate being as realistic a user as possible?


3. How would you approach running the same tests across mobile devices and different browsers?
    * WebDriver has the functionality to 
    * Librarys
    * JS tests and change the viewport (dimension sizes of screen)
