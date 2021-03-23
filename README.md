Windows setup:
1. have java development kit installed https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
2. have some java IDE, I am using intelliJ https://www.jetbrains.com/idea/download/#section=windows
3. make sure you have firefox browser installed https://www.mozilla.org/pl/firefox/new/ , if you had to install it you have to restart the computer
4. open the test project in the IDE with "open project from version control" option
5. In the project tab on the left side in the IDE, click right mouse button on a TestRunner and press run "TestRunner" (X_task/src/main/java/cucumberRunners)

Mac setup:
1. have java development kit installed https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
2. have some java IDE, I am using intelliJ https://www.jetbrains.com/idea/download/#section=windows
3. make sure you have firefox browser installed https://www.mozilla.org/pl/firefox/new/ , if you had to install it you have to restart the computer
4. open the test project in the IDE with "open project from version control" option
5. make sure you are on the project tab on the left side menu, go to X_task/src/main/resources, on the resources folder icon press right mouse button and click open terminal, at the bottom of the page terminal should open, now execute command "chmod +x geckodriverMac"
6. Click right mouse button on a TestRunnerMac and press run "TestRunnerMac" (src/main/java/cucumberRunners)

Linux setup should work the same way as Mac setup but without step 5, unfortunately I don't have an access to Linux device to test it


The lists of the tests are in .feature files, these are a cucumber testing framework files.
Cucumber is used to manage test cases, test reports and make it easy to understand what the test does for even non technical people. (X_task/src/main/features)

Tests that are automated have a tag "@automated" above their description.
I have automated 4 test cases, I tryed to choose test cases that have as many different website actions as possible, I have automated filling in text fields, checking url, clicking on a check box, clicking buttons, testing error messages also I have created a tests for both positive and negative tests.

I have found 2 bugs during creation of the tests on the website - 
1. on a demo page you can click on the pictures that are at the top of the titles "Watch Videos", "Book a Meeting", "Group Live Demo" but I think non of them has a proper redirection or action assigned so I havent done tests for them.
2. on  a demo page when you click on a schedule now button a popup appeares and on this popup the button at the bottom has a "watch videos" text but I think it should be more like schedule now or book a meeting  
