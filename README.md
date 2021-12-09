# mega-sorting-names

The components in this Java Project:
- src
	- FileHandler.java (Class)
	- Main.java (Class)
	- PeopleName.java (Class)
- test
	- FileHandlerTest (JUnit)
	- PeopleNameTest (JUnit)
	
Additional components:
- README.md (detailing the instruction to run the project and the project scope)
- test0-sorted.txt (entailing the result of the running FileHandlerTest output).
- testcase.txt (the sample test based on the sample case provided in the Technical Specification.pdf).
- testcase-bla-sorted.txt (sample empty textfile).
- testcase-sorted.txt (a sample sorted result in txtfile).

---------------------------------------------------------------------------------------------------------------------

The program is built in Java version 16. The IDE used in building the program is Intellij IDE (v. 2021.3). 
The task is:
- takes as a parameter a string that represents a text file containing a list of names.
- Orders the names by the last name followed by first name
- Creates a new text file called <input file name>-sorted.txt with the list of sorted names.

## Running the program by opening the project in your selected IDE (preferrably Intellij).
Go to `Add Configuration...` >  Click on the **+** button on the top left corner > Select the `Application`.

In the **Application** section, 
Name the Application accordingly > Under **Build and run**, Select the `Main` class to run on with **Program arguments** to be `.\\<textfile-name>` **IMPORTANT: PLEASE GIVE A CORRECT PATH FOR A VALID TEXTFILE FILE** > Click *OK*.

Once the **Application** has been created, please click on the **PLAY** button (right next to the `Add Configuration...` (which should now be changed to the name of the application.) and then it will build and run the program.

## Running JUnit test
If the `Add Configuration...` is still around, you can refer to the previous section. To add a configuration.

Else, 
Click on the `<name-project>` you assigned previously, it will trigger a dropdown menu. Click on the **Edit Configurations...** > Click on the **+** button on the top left corner > Select `JUnit`.

In the **JUNIT** section,
Name the JUnit accordingly, > Under **Build and run**, You would notice a red-highlighted textbar (in Intellij) and select the test to run. 

At this stage, there are two available tests:
- FileHandlerTest
- PeopleNameTest

Please select any of them > Click **OK**

------------------------------------------------------------------------------------------------------------------
Example testcase (testcase.txt):
BAKER, THEODORE
SMITH, ANDREW
KENT, MADISON
SMITH, FREDRICK

Expected Output (testcase-sorted.txt):
BAKER, THEODORE
KENT, MADISON
SMITH, ANDREW
SMITH, FREDRICK
