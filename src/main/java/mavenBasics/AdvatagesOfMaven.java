package mavenBasics;

public class AdvatagesOfMaven {//Questions:-
	/* java file provides only two folders but Maven provides 5 folders.otherwise we have to creat all these folders.
	**what is maven :-provides proper projecs templetes and pom.xml file  . 
	//In selenium we were adding jars by creating path ,but henceforth we shall not add jars .
	//we shall  use pom.xml file by attaching dependecy in it to add jars.for that you have to search on google dependency of that project.
	//e.g.selenium maven dependency,selenium TestNG dependency, etc.
	//already existing packages can delete or keep it as per your wish.
	//In src test java we shall keep only test cases ;all other necessary things we add in Resource Package 
	//In src main java=Resource Package:- Base Class to launch browser=file :-data.properties file(.properties must be extention as
	//properties is class in java)to at one line change we can launch code from one browser to other.
	//once you make the framework ,you have to only change Xpath and test cases
	//we only once creat base class
	//TestCases like login,signup, etc.(same test  cases as in manual testing)
	**what is Page Object Model:-this is design pattern ;inside we will create page object for each file i.e we will separate 
	 * xpath in this file
	 * Update project =:if you have added any new dependency and even then there is no 'import' option then=click right on project-maven-update project-click 
	 * on force update-okay	 
	 * 
	 * 
	 *
	 * add more test as homework
	
	Steps followed to make framework:-
	 1)Created maven(template) project-src test java,src main java,pom.xml file ,
    2)added the selenium dependency and the TestNG dependency in pom.xml file
  3)Created base class-inside src\main\java-Resource package-Base class
4)Created data.properties-inside src\main\java-Resource package- data.properties
5)Created one test case=src\test\java test cases=login test case
6)login testcase file	steps
 * extend base class
 * called browserlaunch methods
 * enter url
 * 7)create pageobjectmodel package=arc\main\java=pageobjectmodel=LoginPageObject
 * LoginPageObject
 *         xpath of all login page  
 *         created method for all elements
 * 8)LogintestcasefileSteps=
 *      created object of login page objects
 *       passed driver as paremeter
 *       created constructor
 *9) LoginPageObject=
 *       this.driver=driver2
 *      
 *            
 * Modification=
 * 1)We have added beforeMethod for Browser launch and url navigation in baseclass
   2)if in future chrome version changes, our srips will fails as we give path of already downloded version.therefore,to avoid script fail in future
    we shall use WebDriverManager(automatically run in updated version) 
   3)if we want to give our project to other person ,path should be dynamic.
   4)we kept url in data.file
   5)TestCaseData class to keep hard data
	*/
	
	
	
	
	
	
	
	//To see report of how many Test pass and fail=right click on project-:refresh-:New folder will appear with name test-output-:open this file -:
	//1)right click index.html-:showin-:chrome option
	//2)double click on index.html-:copy path and paste on chrome-:Click on switch Retro theme-:then show result
	
	//how to run only failed test cases?=:test output folder -: testNG-failed.xml -:open and run-:this will run only failed test cases.
	
	
	
	
	
	
	
	
	
	//exception=1)null pointer exception,this.driver is null.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}