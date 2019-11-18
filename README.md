# CarAlarmSystem-Template
A template for the CarAlarmSystem exercise used in Testing and Verification at Aalborg University

The template provides all students with the same interface and the same testing framework, allowing for the exchange of tests between students.  
Furthermore, the template adds all the necessary boilerplate code and a few test examples, to get everyone started without any prior Java knowledge.

**How to: setup**
1. Clone the repository
2. Open IntelliJ or your favorite editor
3. In IntelliJ, press File -> Open... and locate the repo
4. Open it and wait for Gradle to finish building. This is oftentimes indicated in the bottom of the GUI, and can take a little while
5. Run the project to check that everything works. Default shortcut is Shift + Alt + F10.

Good luck!

----

Testing framework: JUnit 4.12  
Java version: 1.8

The project contains:  
**An interface, ICarAlarmSystem**  
This shouldn't be changed as that would break the compatibility with other students' tests.

**A class for CarAlarmSystem**  
The student should add all the functionality of the CarAlarmSystem in this class.  
Make sure to properly read the documentation, and do really consider following a Test Driven Development (TDD) approach here!

**A class for CarAlarmSystemTest**  
This is where the magic happens!  
Some helper functions and two initial tests have already been written. The test that opens the door and expects the program to change the state to an open door will initially fail.  
In a good TDD-manner, you should always write a test that fails and describes some of your expected behavior before implementing it. testOpenDoor is one of these tests.