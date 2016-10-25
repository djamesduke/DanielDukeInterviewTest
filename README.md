# DanielDukeInterviewTest

This project showcases my ClearScore Interview Test response.

Notes:<br>

  <p>In addition to the below comments, I have left comments on all three tests which should help you understand my approach.

*Test 1: Cookies*
  <p>I learnt lots about how to import JUnit and Selenium 3.0, and the foibles that involves (e.g. having to export the gecko.exe into my $PATH etc).
  <p>Unfortunately, even after being able to launch a FF window, the .get method still failed to input text into the address bar.
  <p>A developer friend of mine helped me, and committed to this project. We replaced FireFoxDriver with HtmlUnitDriver, so that the tests run headless (increasing their speed). The obvious downside to headless tests is a) no visual cues when they fail and b) they're harder to debug!
  <p>I ran the first test against ClearScore and received JS errors (see below for stacktrace). To verify that this was not an issue with the test, I created a second test, using www.rightmove.co.uk as the example, but also received errors. I then created a third test to run against Google. The Google test seems to pass after adding the below override method.
  <p>I added an override method as per the following stackOverflow article http://stackoverflow.com/questions/8745061/is-it-possible-to-ignore-javascript-exceptions-when-working-with-webdriver-html
  
*Test 2: API test for failed login* 
  <p>I used RESTAssure to create an API test for a failed login. 
  <p>I also tested this manually using POSTman
  
*Test 3: ClearScore calculator*
  <p>I tried to approach these tests in the same way that I approached Test1, e.g. use WebDriver to find elements on the page, then assert that they were the correct value as per the Interview spec. 
  <p>This proved a challenge, and after speaking with a couple of developers, I was left a little stumped. I'd like to see how this test can be written!
  
Additional Questions:

1. How would you integrate the tests you have written into a continuous integration environment?
<p>I'll use Jenkins as the CI env in this example as that's what we use at Rightmove 
    * Create a Jenkins job for the test suite 
    * Configure the job to run against every commit.
    * Concentrate on reducing the speed of the test suite to allow for the fastest feedback possible

2. How would you make your API test simulate being as realistic a user as possible?
    * For multiple requests, you could stagger the requests which would simulate user interaction
    * Not quite sure how you would do this for a single API request test

3. How would you approach running the same tests across mobile devices and different browsers?
    * WebDriver has the functionality to 
    * Librarys within WebDriver to change the
    * JS tests and change the viewport (dimension sizes of screen)
    
    
 
