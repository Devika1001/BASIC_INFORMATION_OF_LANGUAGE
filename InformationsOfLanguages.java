package com.BasicOfJava.dev;
import java.util.*;
/**
 * interface is created.
 * interface is an abstract in java,it is similar to class,it is used to specify that particular behavior that class must be
 * implement .they are similar to protocols.it consist  method signature and constants.
 * interface keyword is used to create interface.
 * 
 * @author dev
 */
interface Information
{
//	method created to get  information of language founded year.
	public int year();
//	method created to get  information of language.
	public void information();
//	method created to know founder of language.
    public void founder();
//  method created to know  Drawbacks of language.
    public  void demarits();
}

/**
 * class created to store basic information of languages.
 * @author dev
 * @version 14.0.1
 * @since  22-11-2020
 */
public class InformationsOfLanguages
{
/**
 * the method is created to basic languages of BCPL B C C++ JAVA.
 * asks to select number from 1 to 5;
 *  1 for BCPL;
 *  2 for B;
 *  3 for C;
 *  4 for C++;
 *  5 for java;
 * @param args is not used.
 */
	public static void main(String[] args) 
	{
//ask for selecting number from 1 to 5 to get information of particular languages
     System.out.println("choose number from 1 to 6 to know the basic information of languages");
//     select 1 for BCPL language
     System.out.println("choose 1 for Bcpl");
//     select 2 for B language
     System.out.println("choose 2 for B");
//     select 3 for c language
     System.out.println("choose 3 for C");
//     select 4 for C++ language
     System.out.println("choose 4 for C++");
//     select 5 for JAVA 
     System.out.println("choose 5 for JAVA");
     
//     Scanner is inbuilt class that will help to collect data from console.
//     scan is variable name in which data is going to store.
     Scanner scan =new Scanner(System.in);
// for loop is used to give chances to user .
     for(int i=0;i<=6;++i)
     {
//       ask to enter your choise.
     System.out.println("enter your choise\n");
//     int is return type of variable
//     choise stores variable reference value.
//     nextInt() is inbuilt method that helps to get data from console.
     int choise =scan.nextInt();
     
//     if condition is used to check given input is  valid choise or not .if valid then it will print information.
     if(choise==1)
     {
    	 System.out.println("you have choosen BCPL language information.");
//    	 object is created of class of BCPLLanguage.
//    	 new is key word that creates the object of particular class.
    	 BCPLLanguage bcpl=new BCPLLanguage();
//    	 object reference bcpl calls method of year().
    	 bcpl.year();
//    	 object reference bcpl calls founder() method.
    	 bcpl.founder();
//    	 object reference bcpl calls information() method.
    	 bcpl.information();
//    	 object reference bcpl calls demarits() method.
    	 bcpl.demarits();
    	 
     }
     
//   if condition is used to check given input is  valid choise or not .if valid then it will print information.

     else  if(choise==2)
     {
    	 System.out.println("you have choosen B language information.");
//    	 object created for class BLanguage.
    	 BLanguage b=new BLanguage();
//    	 object reference b call method year();
    	 b.year();
//    	 object reference b call method founder();
    	 b.founder();
//    	 object reference b call method information();
    	 b.information();
//     	 object reference b call method demarits();
    	 b.demarits();
     }
//   if condition is used to check given input is  valid choise or not .if valid then it will print information.

     else if(choise==3)
     {
    	 System.out.println("you have choosen C language information.");
//    	 object created for c language class.
    	 CLanuage c= new CLanuage();
//    	 object reference c call method year();
    	 c.year();
//    	 object reference c call method founder();
    	 c.founder();
//    	 object reference c call method information();
    	 c.information();
//    	 object reference c call method demarits();
    	 c.demarits();
     }
     
//   if condition is used to check given input is  valid choise or not .if valid then it will print information.

     else if(choise==4)
     {
    	 System.out.println("you have choosen c++ language information.");
//    	 object created for cplusplus language.
    	 CplusplusLanguage cpp=new CplusplusLanguage();
//    	 object reference cpp call method year();
    	 cpp.year();
//    	 object reference cpp call method founder();
    	 cpp.founder();
//    	 object reference cpp call method information();
    	 cpp.information();
//    	 object reference cpp call method demarits();
    	 cpp.demarits();
    	 
     }
     
//   if condition is used to check given input is  valid choise or not .if valid then it will print information.

     else if(choise==5)
     {
    	 System.out.println("you have choosen java language information.");
//    	 object created for class java language.
    	 JavaLanguage java=new JavaLanguage();
//    	 object reference java call method year();
    	 java.year();
//    	 object reference java call method founder();
    	 java.founder();
//    	 object reference java call method information();
    	 java.information();
//    	 object reference java call method demarits();
    	 java.demarits();
     }
//     if no condition is satisfied then else part is executed.
     else 
     {
//    	 it will print invalid option.
    	 System.out.println("you have choosen invalid option");
     }
     
	}
	}
}
/**
 * class cteated for BCPL(BASIC COMBINED PROGRAMMING LANGUAGE).
 * @author dev
 */
class BCPLLanguage implements  Information
{
	/**
	 * in this method the we know that BCPL founded in 1967.
	 * @param int year -in this int is return type of variable, year is variable name.
	 * when ever you declare the method as int then you must have to return value.
	 */

	 public int year()
	{
		 System.out.println("year is 1967\n");
//	     int - return type of variable.year is name of variable & 1965 is integer lateral.
//		 lateral means the value that is assigned to the variable.
		int yr = 1967;
//		return the value of year.
		return(yr);
	}
	 /**
	  * in this method we know the some important feature of BCPL Language.
	  * when ever you declare the method as void then you need not return any value.
	  */
	 public void information()
	{
		 System.out.println("information is \n");
		System.out.println("First language that include {} (flowerbraces)\n"
				+ "it supports word data  type \n"
				+ " first programming language hello world written in this language\n");
	}
	 /*
	  * this method tells the founder of BCPL language.
	  */
	public void founder()
	{
		System.out.println("founder - \n");
		System.out.println("the founder of BCPL is \"MARTIN RICHARD\"");
	}
	/*
	 * this method tells the drawback of BCPL Language.
	 */
   public  void demarits()
	{
	   System.out.println("drawback - \n");
		System.out.println(" BCPL language only supports only one data type(word)");
	}
}

/**
 * class Blanguage created to know the information of BLanguage.
 * @author dev
 */
class BLanguage implements Information
{
/**
 * @Override means if the sub class contain same method,same variable(parameters)or signaSture, 
 * same return type as the method in the supper class 
 * then the method of subclass override the supper class. 
 */
	@Override
	/**
	 * this method is created to know the year of B language.
	 * @param int year - int is return type of variable,year is name variable,1969 is integer lateral.
	 */
	public int year() 
	{
		System.out.println("year is 1969\n");
//		it will print that b language founded in year 1969.
		int yr = 1969;
		
		return yr;
	}

	@Override
	/*
	 * this method give some important information of B language.
	 */
	public void information()
	{
		System.out.println("information is \n");
	  System.out.println("it supports recursion");
	}

	@Override
	/*
	 * this method will tell the founder of B language.
	 */
	public void founder()
	{
		System.out.println("founder - \n");
		System.out.println("the founder of B language is KIMS THOMSON.");
		
	}

	@Override
	/**
	 * this method is used to list the drawbacks of B language.
	 */
	public void demarits() 
	{
		System.out.println("drawback - \n");
       System.out.println("this does not support any data type.");	
	}
	
}
/**
 * class C language is created to store some information of C language.
 * @author dev.
 */
class CLanuage implements Information
{

	@Override
	/**
	 * this method say that the C language founded in 1971.
	 * @param int year - int is return type of variable, year is variable name,1971 is integer lateral.
	 */
	public int year() 
	{
//		int is return type of variable, year is variable name,1971 is integer lateral.
		System.out.println("year is 1971\n");
	    int yr =1971;
		return yr;
	}

	@Override
	/*
	 * this method is used to know the information of C language.
	 */
	public void information()
	{
		System.out.println("information is \n");
		System.out.println("ite supports the userdefined functions\n"
				+ " it contains pre difined data types(inbuilt data types) such as int , float ,char,etc\n"
				+ "it also declares the variable  as local, public ,default\n"
				+ "it is versatile in nature  and fast exicution\n");
	}

	@Override
	/*
	 * this method is used to tell founder of C language.
	 */
	public void founder()
	{
		System.out.println("founder - \n");
      System.out.println(" the founder of C language is \"DENNIES RIETCHIE\"");
		
	}

	@Override
	/*
	 * this method is created to know the draw  back of C language.
	 */
	public void demarits() 
	{
		System.out.println("drawback - \n");
		System.out.println("this will not support the platform independent\n"
				+ "this will not supports polymorphism\n"
				+ "inheritance\n"
				+ "eception handling\n"
				+ "multitreading\n"
				+ "it gives importance to procedure\n  ");
		
	}
	
}
/**
 * class c++ is created to store some information about c++ language.
 * @author dev
 *
 */
class CplusplusLanguage implements Information
{

	@Override
    //	this method tells that c++ is founded in 1985.
	public int year() 
	{
   //		int is return type of variable, year is variable name,1985 is integer lateral.
		System.out.println("year is 1985\n");
		int yr = 1985;
		return yr;
	}

	@Override
	/*
	 * this method is created to collect information of C++ language.
	 */
	public void information() 
	{
		System.out.println("information is \n");
		System.out.println(" it is hybrid language."
				+ " C Language(Strucure oriented language) +Simula(object oriented language)=impure language"
				+ " it supports polimorphism,multithreading,inheritance, eception handling");
		
	}

	@Override
	/*
	 * this method is creadted to tell the founder the  C++ language.
	 */
	public void founder()
	{
		System.out.println("founder - \n");
		System.out.println("the founder of C++ language is \"BJARNE STROSTRACK\" ");
		
	}

	@Override
//	this method tells the drawback of C++ Language.
	public void demarits()
	{
		System.out.println("drawback - \n");
		System.out.println(" it does not provaide the data security.\n"
				+ " plant form dependent\n");
		
	}
	
}
/**
 * class created to collect information about Java language.
 * @author dev
 *
 */
class JavaLanguage implements Information
{

	@Override
	/*
	 * this method declares that java is created in 1995.
	 */
	public int year() 
	{
//		int is return type,year is variable name,1995 is integer lateral.
		System.out.println("year is 1995\n");
		int yr =1995;
		return yr;
	}

	@Override
	/*
	 * this method tells the important information of JAVA language.
	 */
	public void information() 
	{
		System.out.println("information is \n");
		System.out.println(" it is impure object orientad language ,beacuse it supports data types\n"
				+ "it can creat pure object even though it is impure.\n"
				+ "first it is known as c++--,oak,silk, green\n"
				+ "it supports polymorphism,multithreading,exception handling,platform independent,inheritance\n");
		
	}

	@Override
	/*
	 * this method is created to tell the founder of JAVA.
	 */
	public void founder() 
	{
		System.out.println("founder - \n");
		System.out.println("the founder of JAVA is \"JAMES GOSLING\" ");
		
	}

	@Override
	/*
	 * this method is created to tell drawback of JAVA.
	 */
	public void demarits() 
	{
		System.out.println("drawback - \n");
		System.out.println("this is slow proccess");
		
	}
	
}
