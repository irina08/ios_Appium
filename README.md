# ios_Appium

Those tests run perfect on simulator iPhone X 12.0.  
For running test on Android we need to modify some files: config.properties,  
and modify AppStart.java file, and setup environment for Android Simulator.

### How to run project
1.  You need to clone this repo to your local machine.  
In the terminal change the current working directory to the location where 
you want the cloned directory to be made.  
Use command: git clone https://github.com/irina08/ios_Appium or download folder

2.  You need to have in your testing environment already installed  
XCode, Appium, Java, Maven, simulator according properties in the config.properties file.  

In this project I use PageObject Pattern with Page Factory.  
For assertion library - TestNG.   
[Appium Installation](https://appium.io/)

3.  Provide or change properties in the config.properties file.  
4.  Run tests: mvn clean install 

### Test Cases:
Login Page:  
Login with valid API Key and check it redirect to home page.  
Login with empty API Key and check no items to show.  
Login with invalid API Key and check no items to shows.

Home Page:   
Validate elements on Home Page.  

Wireless New Stadium Page:  
Validate elements on Wireless New Stadium Screen Page.  

Wireless Other Desktop Page:  
Validate elements on Wireless Other Desktop Page.

Wireless AP 1 Page:   
Validate elements on Wireless AP 1 Page.

AP Page:  
Validate elements on AP Page.

If our app has thousand of clients, we need to test app not only with simulator,  
but with real devices too. We need to test all positive functional users scenarios,  
negative functional users scenarios, UI testing. Also we need to do performance  
testing (stress and load) and security testing. 
