
/* Shoenfelt, Liyah- COP3330 0V01 and Ali, Osman- COP3330 0V02 */
import java.util.*;

public class Project2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Person[] array = new Person[100];
        int input;
        int i = -1;
        String name, dept, status, rank;
        int ID, hours;
        double gpa;

        while(true){
            System.out.println("1. Enter the information of a faculty member");
            System.out.println("2. Enter the information of a student");
            System.out.println("3. Print tution invoice");
            System.out.println("4. print facutly information");
            System.out.println("5. Enter the information of a staff member");
            System.out.println("6. Print the infomation of a staff member");
            System.out.println("7. Exit program");
            System.out.println();
            System.out.println("Please enter your selection:");

            input = scan.nextInt();
            scan.nextLine();
           

            if(input == 1){
                i++;
                array[i] = new Faculty();
                System.out.println("Enter faculty info: ");
                System.out.print("Name: ");
                name = scan.nextLine();
                array[i].setName(name);
                System.out.print("ID (please note: IDs are in number form): ");
                ID = scan.nextInt();
                scan.nextLine();
                array[i].setID(ID);
                System.out.print("Department: ");
                dept = scan.nextLine();
                if (dept.equalsIgnoreCase("Sciences") || dept.equalsIgnoreCase("Mathematics") || dept.equalsIgnoreCase("Engineering")){
                    ((Faculty)array[i]).setDepartment(dept);
                }
                else{
                    System.out.println("Invalid selection. Try again.");
                    dept = scan.nextLine();


                }
                System.out.println("Rank: ");
                rank = scan.nextLine();
                if(rank.equalsIgnoreCase("Professor") || rank.equalsIgnoreCase("Adjunct")){
                  ((Faculty)array[i]).setRank(rank);
                  System.out.println("Faculty Information Saved");
                    continue;
                }
                else{
                    System.out.println("Invalid selection. Try again.");
                    rank = scan.nextLine();

                }
                
                //put function to print that the operation was succesful for each if statement, and then make it so that the actul contents of the variables are matching project requirements
                
    

            }
            if (input == 2){
                i++;
                array[i] = new Student();
                System.out.println("Name: ");
                name = scan.nextLine();
                array[i].setName(name);
                System.out.println("ID (please note: IDs are in number form): ");
                ID = scan.nextInt();
                array[i].setID(ID);
                System.out.println("GPA: ");
                gpa = scan.nextDouble();
                scan.nextLine();
                ((Student) array[i]).setGpa(gpa);
                System.out.println("Credit Hours: ");
                hours = scan.nextInt();
                scan.nextLine();
                ((Student) array[i]).setCreditHours(hours);

                System.out.println("Student Information Saved");
                continue;

            }
            if(input == 3){
                int choice;
                if (i < 0){
                    System.out.println("No info to print.");
                    continue;
                }
                System.out.println("Please enter the ID of the student: ");
                choice = scan.nextInt();
                for (int x = 0; x < 100; x++){
                    if (choice == array[x].getID()){
                        array[x].print(); //flag 1 for print student
                        break;
                    }
                }
                continue;
              
            }
            if (input == 4){
                int choice;
                if (i < 0){
                    System.out.println("No info to print.");
                    continue;
                }
                System.out.println("Please enter the ID of the faculty member: ");
                
                choice = scan.nextInt();
                for ( int x = 0; x < 100; x++){
                    if (choice == array[x].getID()){
                        array[x].print();
                        break;
                    }
                }
                continue;
            }
            if(input == 5){
              i++;
              array[i] = new Staff();
              System.out.println("Name: ");
              name = scan.nextLine();
              array[i].setName(name);
              System.out.println("ID (please note: IDs are in number form): ");
              ID = scan.nextInt();
              array[i].setID(ID);
              scan.nextLine();
              System.out.println("Department: ");
              dept = scan.nextLine();
              if (dept.equalsIgnoreCase("Sciences") || dept.equalsIgnoreCase("Mathematics") || dept.equalsIgnoreCase("Engineering")){
                 ((Staff) array[i]).setDepartment(dept);
                }
              else{
                 System.out.println("Invalid selection. Try again.");
                 dept = scan.nextLine();
                }
                System.out.println("Status (P for Part-Time, F for Full-Time): ");
                status = scan.nextLine();
                if (status.equalsIgnoreCase("P") || status.equalsIgnoreCase("F")){
                    ((Staff) array[i]).setStatus(status);
                    System.out.println("Staff Information Saved");
                    continue;
                }
                else{
                    System.out.println("Invalid selection. Try again.");
                    status = scan.nextLine();
                }
             System.out.println("Staff Information Saved");
            }

            if(input == 6){
                int choice;
                if (i < 0){
                    System.out.println("No info to print.");
                    continue;
                }
                System.out.println("Please enter the ID of the staff member (Note: IDs are in number form): ");
                
                choice = scan.nextInt();
                for ( int x = 0; x < 100; x++){
                    if (choice == array[x].getID()){
                        array[x].print();
                        break;
                    }
                }
                continue;
            }
            if(input == 7){
                System.out.println("Goodbye!");
                break;
            }
            else{
                System.out.println("Invalid selection. Please try again.");
            }
        }

    }
    static abstract class Person{
        protected String name;
        protected int ID;

        public void setName(String personName){
            this.name = personName;
        }
        
        public void setID(int personID){
            this.ID = personID;
        }

        public String getName(){
            return name;
        }

        public int getID(){
            return ID;
        }

        abstract void print();

    }

    static class Student extends Person{
        private double gpa;
        private int creditHours;
        private double total;
        
        
        public void setGpa(double studentGPA){
            this.gpa = studentGPA;
        }

        public void setCreditHours(int studentCreditHours){
            this.creditHours = studentCreditHours;
        }
        public double getGpa(){
            return gpa;
        }
        public int getCreditHours(){
            return creditHours;
        }
        
        @Override
        public void print(){
            System.out.println("-----------------------------------------------");
            System.out.println("Name: " + getName() + "\t\t\t ID:" + getID());
            System.out.println("Credit hours: " + creditHours + "($236.45/hour)");
            System.out.println("Fees: $52");
            total = (236.45 * creditHours + 52);
            if (gpa >= 3.85){
                total *= 0.75;
                System.out.println("Total Invoice: $" + Math.round(total) + "(discount applied)");
                System.out.println("-----------------------------------------------");
            }
            else{
                System.out.print("Total Invoice: $" + Math.round(total) + "(no discount applied)");
                System.out.println("-----------------------------------------------");
            }
        }
    }

    static abstract class Employee extends Person{
        protected String department;

        public void setDepartment(String departmentInput) {
            this.department = departmentInput.toLowerCase();
        }
        public String getDepartment(){
            return department;
        }
        abstract void print();
        

    }

    static class Faculty extends Employee{
        private String rank;
        Faculty(){
            super();
            rank = "";

        }

        public void setRank(String rankInput){
            rank = rankInput;
        }
        public String getRank(){
            return rank;
        }
            @Override
        public void print(){
            System.out.println("-----------------------------------------------");
            System.out.println("Name: " + getName() + "\t\t\t ID:" + getID());
            System.out.println(getDepartment() + " department, " + rank);
            System.out.println("-----------------------------------------------");
            
        }
    }
    static class Staff extends Employee{
      private String status;

      public void setStatus(String statusInput){
        status = statusInput;
      }
      public String getStatus(){
        return status;
      }
      @Override
        public void print(){
            System.out.println("-----------------------------------------------");
            System.out.println("Name: " + getName() + "\t\t\t ID:" + getID());
            System.out.println(getDepartment() + " department, " + status);
            System.out.println("-----------------------------------------------");
        }
    }
}
