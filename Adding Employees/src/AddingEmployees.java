// This program will add employees with the help of OOP. (Jade Park - 8/2/2021)
// This class includes the main method and uses objects of type Employee.


import java.util.Scanner;

public class AddingEmployees {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      String firstName;
      String lastName;
      String fullName;
      String hiringDate;
      String terminateDate;
      int unscheduledDays;
      int scheduledDays;
      String lastReview;
      
      System.out.println("Welcome to Starr! Please provide the following details on these employees: ");
      
      System.out.print("\nEmployee 1's first name: ");
      firstName = input.next();

      System.out.print("Employee 1's last name: ");
      lastName = input.next();
      
      System.out.print("Employee 1's date of hire (FORMAT: MM/DD/YYYY): ");
      hiringDate = input.next();
         
      System.out.print("Employee 1's number of unscheduled vacation days left: ");
      unscheduledDays = input.nextInt();
      
      System.out.print("Employee 1's number of scheduled vacation days: ");
      scheduledDays = input.nextInt();
      
      System.out.print("Employee 1's termination date (FORMAT: MM/DD/YYYY): ");
      terminateDate = input.next();
      
      System.out.print("Employee 1's last annual review (FORMAT: MM/DD/YYYY): ");
      lastReview = input.next();
      
      fullName = firstName + " " + lastName;
      OldEmployee emp1 = new OldEmployee(firstName, lastName, fullName, hiringDate, terminateDate, unscheduledDays, scheduledDays, lastReview); // creates first employee object
      
      System.out.println(emp1);
      
      
      // employee 2
      System.out.print("\nEmployee 2's first name: ");
      firstName = input.next();

      System.out.print("Employee 2's last name: ");
      lastName = input.next();
      
      System.out.print("Employee 2's date of hire (FORMAT: MM/DD/YYYY): ");
      hiringDate = input.next();
         
      System.out.print("Employee 2's number of unscheduled vacation days left: ");
      unscheduledDays = input.nextInt();
      
      System.out.print("Employee 2's number of scheduled vacation days: ");
      scheduledDays = input.nextInt();
      
      System.out.print("Employee 2's termination date (FORMAT: MM/DD/YYYY): ");
      terminateDate = input.next();
      
      System.out.print("Employee 2's last annual review (FORMAT: MM/DD/YYYY): ");
      lastReview = input.next();
      
      fullName = firstName + " " + lastName;
      OldEmployee emp2 = new OldEmployee(firstName, lastName, fullName, hiringDate, terminateDate, unscheduledDays, scheduledDays, lastReview); // creates first employee object
      
      System.out.println(emp2);

      /*
      Employee emp2 = new Employee(); // creates second employee object
     
      
      System.out.print("\nEmployee 2's first name: ");
      emp2.setFirstName(input.next());

      System.out.print("Employee 2's last name: ");
      emp2.setLastName(input.next());
      
      flag = true;
      do { // start of loop
      
         System.out.print("Employee 2's date of hire (FORMAT: MM/DD/YYYY): ");
         emp2.setDateOfHire(input.next());
      
         if (emp2.getDateOfHire().length() != 10) {
            System.out.println("INVALID INPUT! Ensure your input format matches MM/DD/YYYY.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop
      
      System.out.print("Employee 2's number of unscheduled vacation days left: ");
      emp2.setUnscheduledDates(input.nextInt());
      
      System.out.print("Employee 2's number of scheduled vacation days: ");
      emp2.setScheduledDates(input.nextInt());

      
      
      Employee emp3 = new Employee(); // creates third employee object
      
      System.out.print("\nEmployee 3's first name: ");
      emp3.setFirstName(input.next());

      System.out.print("Employee 3's last name: ");
      emp3.setLastName(input.next());
      
      flag = true;
      do { // start of loop
      
         System.out.print("Employee 3's date of hire (FORMAT: MM/DD/YYYY): ");
         emp3.setDateOfHire(input.next());
      
         if (emp3.getDateOfHire().length() != 10) {
            System.out.println("INVALID INPUT! Ensure your input format matches MM/DD/YYYY.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop
      
      System.out.print("Employee 3's number of unscheduled vacation days left: ");
      emp3.setUnscheduledDates(input.nextInt());
      
      System.out.print("Employee 3's number of scheduled vacation days: ");
      emp3.setScheduledDates(input.nextInt());
      
      
      
      
      // schedules vacation days for each of the 3 employees
      
      flag = true;
      do { // start of do-while loop that ensures the request is do-able

         System.out.print("\nHow many vacations days would you like to schedule for Employee 1? ");
         emp1.setVacationDaysRequested(input.nextInt());
      
         if (emp1.getVacationDaysRequested() > emp1.getUnscheduledDates()) {
            System.out.println("INVALID INPUT! Ensure the employee's unscheduled vacation dates are greater than the requested amount.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop
      
      
      
      flag = true;
      do { // start of loop
            
         System.out.print("How many vacations days would you like to schedule for Employee 2? ");
         emp2.setVacationDaysRequested(input.nextInt());
         
         if (emp2.getVacationDaysRequested() > emp2.getUnscheduledDates()) {
            System.out.println("INVALID INPUT! Ensure the employee's unscheduled vacation dates are greater than the requested amount.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop
      
      
      flag = true;
      do { // start of loop
         System.out.print("How many vacations days would you like to schedule for Employee 3? ");
         emp3.setVacationDaysRequested(input.nextInt());
      
         if (emp3.getVacationDaysRequested() > emp3.getUnscheduledDates()) {
            System.out.println("INVALID INPUT! Ensure the employee's unscheduled vacation dates are greater than the requested amount.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop
      
      
      // schedules the vacation days by calling the function
      for (int i = 0; i < emp1.getVacationDaysRequested(); i++) {
         emp1.scheduleVacationDay();
      }
      
      for (int i = 0; i < emp2.getVacationDaysRequested(); i++) {
         emp2.scheduleVacationDay();
      }
      
      for (int i = 0; i < emp3.getVacationDaysRequested(); i++) {
         emp3.scheduleVacationDay();
      }
     
      
      
      // cancels at least 1 vacation day for each of the 3 employees if applicable
      
      flag = true;
      do { // start of do-while loop that ensures the request is do-able
         System.out.print("\nHow many vacation days would you like to cancel for Employee 1? ");
         emp1.setCancelledDaysRequested(input.nextInt());
      
         if (emp1.getCancelledDaysRequested() > emp1.getScheduledDates()) {
            System.out.println("INVALID INPUT! Ensure the employee's scheduled vacation dates are greater than the requested amount.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop


      flag = true;
      do { // start of loop
         System.out.print("How many vacation days would you like to cancel for Employee 2? ");
         emp2.setCancelledDaysRequested(input.nextInt());
      
         if (emp2.getCancelledDaysRequested() > emp2.getScheduledDates()) {
            System.out.println("INVALID INPUT! Ensure the employee's scheduled vacation dates are greater than the requested amount.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop

      
      flag = true;
      do { // start of loop
         System.out.print("How many vacation days would you like to cancel for Employee 3? ");
         emp3.setCancelledDaysRequested(input.nextInt());
      
         if (emp3.getCancelledDaysRequested() > emp3.getScheduledDates()) {
            System.out.println("INVALID INPUT! Ensure the employee's scheduled vacation dates are greater than the requested amount.");
            flag = true;
         } else {
            flag = false;
         }
      
      } while (flag == true); // end of loop

      
      // cancels the vacation day(s) by calling the function
      for (int i = 0; i < emp1.getCancelledDaysRequested(); i++) {
         emp1.cancelVacationDay();
      }
      
      for (int i = 0; i < emp2.getCancelledDaysRequested(); i++) {
         emp2.cancelVacationDay();
      }
      
      for (int i = 0; i < emp3.getCancelledDaysRequested(); i++) {
         emp3.cancelVacationDay();
      }

      
      
      // terminates an employee

      System.out.print("\nWhich employee would you like to terminate? (1-3): ");
      int terminatedEmployee = input.nextInt();
      
      // sets the termination date with the help of a few methods
      if (terminatedEmployee == 1) {
         System.out.print("What's the termination month? (FORMAT: MM/DD/YYYY): ");
         emp1.setTerminationDate(input.next());
         emp1.terminateEmployee(emp1.getTerminationDate());
         
      } else if (terminatedEmployee == 2) {
         System.out.print("What's the termination month? (FORMAT: MM/DD/YYYY): ");
         emp2.setTerminationDate(input.next());
         emp2.terminateEmployee(emp2.getTerminationDate());
         
      } else if (terminatedEmployee == 3) {
         System.out.print("What's the termination month? (FORMAT: MM/DD/YYYY): ");
         emp3.setTerminationDate(input.next());
         emp3.terminateEmployee(emp3.getTerminationDate());
      }
      
      
      // output all 3 employees at the end
      emp1.setFullName(emp1.getFirstName(), emp1.getLastName());
      emp2.setFullName(emp2.getFirstName(), emp2.getLastName());
      emp3.setFullName(emp3.getFirstName(), emp3.getLastName());
      
      Employee.toStringMethod(emp1.getFullName(), emp1.getDateOfHire(), emp2.getFullName(), emp2.getDateOfHire(), emp3.getFullName(), emp3.getDateOfHire(), terminatedEmployee, emp1.getTerminationDate(), emp2.getTerminationDate(), emp3.getTerminationDate());
      
      */
   }
}

