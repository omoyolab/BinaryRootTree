import java.util.*;
/**
 * FA2019_BinarySearchTreeDemo_Omoyola.
 *
 * @author Abimbola Omoyola
 * @version 11/20/2019
 */
public class FA2019_BinarySearchTreeDemo_Omoyola
{
   public static void main(String [] args)
   {
       
        int userInput;
        String fName,lName,className, fecthed_id;
        Scanner keyboard = new Scanner(System.in);
        BinarySearchTree_Omoyola binaryTree = new BinarySearchTree_Omoyola();
        Student_Omoyola std, fetchedStudent, inputStudent,aStudent;
        Class aClass;
            
       do{
        
              System.out.println(
                    " MENU – BINARY SEARCH TREE – ABIMBOLA OMOYOLA \n"+
                    " 1. Insert Student \n" +
                    " 2. Fetch \n"+
                    " 3. Verify Encapsulation \n" +
                    " 4. Update \n"+
                    " 5. Delete \n" +
                    " 6. Show all \n"+
                    " 0. Exit \n"  
                    );
                    userInput = keyboard.nextInt();
                    keyboard.nextLine();
                switch(userInput){
                  
                   case 1:
                   // Insert Student
                   System.out.println("Enter Student's First Name");
                   fName = keyboard.nextLine();
                   System.out.println("Enter Student's Last Name");
                   lName = keyboard.nextLine();
                   System.out.println("Enter Student's Class Name");
                   className = keyboard.nextLine();
                   
                   aClass = new Class(className);
                   std = new Student_Omoyola(lName,fName,aClass);
                   
                    binaryTree.insert(std);
                   System.out.println(std.toString());
                  
                   break;
                   
                   case 2:
                   // Fetch Student
                   try{
                        System.out.println("Enter the Student ID Number");
                        fecthed_id = keyboard.nextLine();
                        fetchedStudent = binaryTree.fetch(fecthed_id);
                        // Display found STUDENT
                        System.out.println(fetchedStudent.toString());
                     }catch(NullPointerException e){
                       System.out.println("********* Student Cannot be Found ********");  
                    }
                   break;
                   
                   case 3:
                   //Verify Encapsulation
                   // Ask for information from keyboard to create student as inputStudent
                   System.out.println("Enter Student's First Name");
                   fName = keyboard.nextLine();
                   System.out.println("Enter Student's Last Name");
                   lName = keyboard.nextLine();
                   System.out.println("Enter Student's Class Name");
                   className = keyboard.nextLine();
                   
                   aClass = new Class(className);
                   inputStudent = new Student_Omoyola(lName,fName,aClass);
                   
                   //Insert InputStudent
                   binaryTree.insert(inputStudent);
                   System.out.println("****Inserted InputStudent******");
                   System.out.println(inputStudent.toString());
                   
                   //Read the student id of Inputstudent to store into varibale id
                   String id = inputStudent.getKey();
                   
                   // Change last Name of InputStudent
                   System.out.println("Enter a new last name");
                   String newName = keyboard.nextLine();
                   inputStudent.setName(newName);
                   
                   // Fetch from Binary tree a student with stored id
                   fetchedStudent = binaryTree.fetch(id);
                   
                    // Compare both
                    if(fetchedStudent.getName().equals(inputStudent.getName()))
                    {
                    System.out.println("Binary Tree not encapsulasted");
                    }else {
                    System.out.println("Binary Tree is encapsulasted");
                    }
                    
                    // Display Fetched Student
                    System.out.println("**********Fectched Student**************");
                    System.out.println(fetchedStudent.toString());
                    // Display temp
                    System.out.println("*****************Edited Student******************");
                    System.out.println(inputStudent.toString());
                   break;
                   
                   case 4:
                   //Update Student
                   //-Ask for the information of one student from the keyboard to create aStudent
                   System.out.println("Enter Student's First Name");
                   fName = keyboard.nextLine();
                   System.out.println("Enter Student's Last Name");
                   lName = keyboard.nextLine();
                   System.out.println("Enter Student's Class Name");
                   className = keyboard.nextLine();
                   
                   aClass = new Class(className);
                   aStudent = new Student_Omoyola(lName,fName,aClass);
                   
                   //Insert InputStudent
                   binaryTree.insert(aStudent);
                   System.out.println("****Inserted InputStudent******");
                   System.out.println(aStudent.toString());
                   
                   System.out.println("Enter a new Last name for student");
                   String fn = keyboard.nextLine();
                   aStudent.setfName(fn);
                   
                   
                   break;
                   
                   case 5:
                   //Delete Student
                   System.out.println("Enter Student id you want to delete");
                    binaryTree.delete(keyboard.nextLine());
                   break;
                   
                   case 6:
                   //Show All Student
                   binaryTree.showAll();
                   
                   break;
  
                  }
    
        }while(userInput != 0);

            System.out.println("Thank you.. Application is now terminated!");
   }
}
