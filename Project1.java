/* Project 1
Liyah Shoenfelt 0V01, Osman Ali 0V02

Compiled on Both Eustis, and Replit
*/

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {   

  static String facultyName;
  static String facultyId;
  static String facultyDepartment;
  static String facultyRankString;

  static String studentName1;
  static String studentId1;
  static float studentGPA1;
  static int studentCredits1;
  static String studentName2;
  static String studentId2;
  static float studentGPA2;
  static int studentCredits2;

  static String staffName;
  static String staffId;
  static String staffDepartment;
  static String staffRole;
  static String d;

 static void inputfaculty(int i,int j){
  Scanner scan = new Scanner(System.in);
 if(j!=0)
 {System.out.println("Do you want to update the faculty information (yes/no");
 
 d=scan.next();}
 if(d=="yes"||d=="YES"||j==0)
 {

 
   
 

  if(i==1){
    System.out.println("Faculty Name:");
    facultyName = scan.nextLine();

    System.out.println("ID:");
    facultyId = scan.nextLine();

    System.out.println("Department:");
    facultyDepartment = scan.nextLine();

    if(facultyDepartment.equalsIgnoreCase("english") || facultyDepartment.equalsIgnoreCase("mathematics") ||  facultyDepartment.equalsIgnoreCase("engineering")) {
    }
    else{
      System.out.println("invalid deparment name. please try again.");
      facultyDepartment = scan.nextLine();

    }

    System.out.println("Rank:");
    facultyRankString = scan.nextLine();
    
    if(facultyRankString.equalsIgnoreCase("professor") || facultyRankString.equalsIgnoreCase("adjunct")) {
    }
    else{
      System.out.println("Invalid role. Please try again.");
      facultyRankString = scan.nextLine();

      
    }
    
    System.out.println("Thanks!!!!!!");
    System.out.println("-----------------------------------------------------------");
  }
  else{
    if (facultyName == null){
      System.out.println("No faculty currently stored. Please enter a faculty member.");
    }
    else {
      System.out.println("-----------------------------------------------------------");
      System.out.println("Faculty Name: "+ facultyName);
      System.out.println("ID: "+ facultyId);
     System.out.println("Department: "+facultyDepartment);
      System.out.println("Rank: "+facultyRankString);
      System.out.println("-----------------------------------------------------------");
    }
  }
 }  
}


static void inputstudent(int i,int j){
 Scanner scan = new Scanner(System.in);
if(j!=0)
 {System.out.println("Do you want to update the student information (yes/no");
  d=scan.next();}
 if(d=="yes"||d=="YES"||j==0)
 {

 if(i == 2){
   System.out.println("Enter student information");
   System.out.println("Student 1 information:");

   System.out.println("Student Name:");
   studentName1 = scan.nextLine();

   System.out.println("ID:");
   studentId1 = scan.nextLine();

   System.out.println("GPA:");
   studentGPA1 = scan.nextFloat();

   System.out.println("Credit hours: ");
   studentCredits1 = scan.nextInt();
   scan.nextLine();
   System.out.println("Student 2 information:");

   System.out.println("Student Name:");
   studentName2 = scan.nextLine();

   System.out.println("ID:");
   studentId2 = scan.nextLine();

   System.out.println("GPA:");
   studentGPA2 = scan.nextFloat();

   System.out.println("Credit hours:");
   studentCredits2 = scan.nextInt();        

   System.out.println("Thanks!");        
  }
 else{
   System.out.println("Which student? 1 for " + studentName1 + " 2 for " + studentName2);
   int choice = scan.nextInt();

   if (choice == 1){
    System.out.println("------------------------------------------");

    System.out.println("\t\t" + studentId1 + "\t\t");

    System.out.println(studentName1);
    System.out.println("GPA: " + studentGPA1);
    System.out.println("Credit hours: " + studentCredits1 + "(236.45/credit hour)");
    System.out.println("fee: $52 ");
    double total1 = (236.45 * studentCredits1 + 52.00);
   
    if(studentGPA1 < 3.85){
      System.out.println("Total payment: $"+ Math.round(total1) + "\t\t(no dicsount applied)");
      System.out.println("------------------------------------------");
    }
    else{
      System.out.println("Total payment (after discount): $"+ Math.round(total1 * 0.85));
      System.out.println("-----------------------------------------------------------");
    }
  }
  else if (choice == 2){
    System.out.println("------------------------------------------");

    System.out.println("\t\t" + studentId2 + "\t\t");
    System.out.println("GPA: " + studentGPA2);
    System.out.println("Credit hours: "+ studentCredits2 +"(236.45/credit hour)");
    System.out.println("fee : $52 ");
    double total2 = 236.45 * studentCredits2 + 52;
    if(studentGPA2 < 3.85){
      System.out.println("Total payment: $" + Math.round(total2) + "\t\t(no dicsount applied)");
      System.out.println("------------------------------------------");
    }
    else{
      System.out.println("Total payment (after discount): $" + Math.round(total2 * 0.85)); 
    }
    System.out.println("------------------------------------------");
  }     
  else {
    System.out.println("Invalid selection!");
  } 
 }}                             
}             
                   
               


static void inputstaff(int i,int j){
  Scanner scan = new Scanner(System.in);
if(j!=0)
 {System.out.println("Do you want to update the staff information (yes/no");
  d=scan.next();}
 if(d=="yes"||d=="YES"||j==0)
 {

  if(i == 5){
    System.out.println("Staff Name:");
    staffName = scan.nextLine();

    System.out.println("ID:");
    staffId = scan.nextLine();

    System.out.println("Department:");
    staffDepartment = scan.nextLine();

    if(staffDepartment.equalsIgnoreCase("english") ||staffDepartment.equals("mathematics") || staffDepartment.equals("engineering")){
  
    }
    else {
      System.out.println("please enter valid department");
      staffDepartment=scan.nextLine();
    }
    System.out.println("Status, Enter P for part time or Enter F for full time:");

    staffRole = scan.nextLine();

    if(staffRole.equalsIgnoreCase("F") || staffRole.equalsIgnoreCase("P")){
      System.out.println("Thanks!");
      System.out.println("-----------------------------------------------------------");
    }

    else{
      System.out.println("please enter valid status");
      staffRole = scan.nextLine();
    }
  }
 else{
   System.out.println("-----------------------------------------------------------");System.out.println(staffName + "\t\t" + staffId);
   
   if (staffRole.equals("p")){
     System.out.println(staffDepartment + "Department, Part Time");
     System.out.println("-----------------------------------------------------------");
    }
    else {
      System.out.println(staffDepartment + "Department, Full Time");
      System.out.println("-----------------------------------------------------------");
    
    }}
 }
}
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int input = 0;
  int count1=0;
  int count2=0;
  int count3=0;
  System.out.println("\tWelcome to Personal Management System\t");
  while(true){
   System.out.println("1. Enter the information of the faculty");
   System.out.println("2. Enter the information of two students");
   System.out.println("3. Print tution invoice");
   System.out.println("4. print facutly information");
   System.out.println("5. Enter the information of staff");
   System.out.println("6. Print the infomation of staff");
   System.out.println("7. Exit program");
   System.out.println();
   System.out.println("Please enter your selection:");

   input = scan.nextInt();

   if(input == 1) {
     
     inputfaculty(input,count1);
     System.out.println();
     System.out.println();
    
    count1=count1+1;} 
   else if(input == 2) {
    
     inputstudent(input,count2);
     System.out.println();
     System.out.println();
    
     count2=count2+1;}
   else if(input==3){
     count2=0;
      inputstudent(input,count2);
      System.out.println();
      System.out.println();
    }
   else if(input==4){
     count1=0;
     inputfaculty(input,count1);
     System.out.println();
     System.out.println();
    }
   else if(input == 5) {
     count3=count3+1;
     inputstaff(input,count3);
     System.out.println();
     System.out.println();
    
    count3=count3+1;
    }
   else if (input == 6){
     count3=0;
     inputstaff(input,count3);
     System.out.println();
     System.out.println();
    }
  else if (input == 7){
    System.out.println("Goodbye!");
    break;
  }
  else{
    System.out.println("Invalid input. Please try again.");
    System.out.println();
    System.out.println();

  }

 }
}
}
