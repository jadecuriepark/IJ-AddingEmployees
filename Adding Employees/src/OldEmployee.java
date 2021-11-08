// This program will add employees with the help of OOP. (Jade Park - 8/2/2021)
// This class represents an employee.

class OldEmployee {
   
   // declaring attributes
   private String employeeFirstName;
   private String employeeLastName;
   private String employeeFullName = employeeFirstName + " " + employeeLastName;
   private String dateOfHire;
   private static String terminationDate;
   private static int unscheduledVacationDaysLeft;
   private static int scheduledVacationDays;
   private String lastAnnualReview;
   
   private static int vacationDaysRequested;
   private static int cancelledDaysRequested;
   
   // default constructor
   public OldEmployee() {
      employeeFirstName = "";
      employeeLastName = "";
      employeeFullName = "";
      dateOfHire = "";
      terminationDate = "";
      unscheduledVacationDaysLeft = 0;
      scheduledVacationDays = 0;
      lastAnnualReview = "";
   }
   
   // overloaded constructor
   public OldEmployee(String firstName, String lastName, String fullName, String hireDate, String terminateDate, int unscheduledDays, int scheduledDays, String review) {
      employeeFirstName = firstName;
      employeeLastName = lastName;
      employeeFullName = fullName;
      dateOfHire = hireDate;
      terminationDate = terminateDate;
      unscheduledVacationDaysLeft = unscheduledDays;
      scheduledVacationDays = scheduledDays;
      String lastAnnualReview = review;
   }
   
   
   // getter and setter methods
   public String getFirstName() {
		return employeeFirstName;
	}
   
	public void setFirstName(String firstName) {
		employeeFirstName = firstName;
	}
   
   
   public String getLastName() {
		return employeeLastName;
	}
   
	public void setLastName(String lastName) {
		employeeLastName = lastName;
	}
   
   
   public String getFullName() {
		return employeeFullName;
	}
   
	public void setFullName(String firstName, String lastName) {
		employeeFullName = firstName + " " + lastName;
	}
   
   
   public String getDateOfHire() {
		return dateOfHire;
	}
   
	public void setDateOfHire(String date) {
		dateOfHire = date;
	}
   
   
   public String getTerminationDate() {
		return terminationDate;
	}
   
	public void setTerminationDate(String date) {
		terminationDate = date;
	}
   
   
   public int getUnscheduledDates() {
		return unscheduledVacationDaysLeft;
	}
   
	public void setUnscheduledDates(int days) {
		unscheduledVacationDaysLeft = days;
	}

   
   public int getScheduledDates() {
		return scheduledVacationDays;
	}
   
	public void setScheduledDates(int days) {
		scheduledVacationDays = days;
	}
   
   
   public int getVacationDaysRequested() {
		return vacationDaysRequested;
	}
   
	public void setVacationDaysRequested(int days) {
		vacationDaysRequested = days;
	}
   
   
   public int getCancelledDaysRequested() {
		return cancelledDaysRequested;
	}
   
	public void setCancelledDaysRequested(int days) {
		cancelledDaysRequested = days;
	}
   

   
   
   // method scheduleVacationDay
   public static void scheduleVacationDay() {
      unscheduledVacationDaysLeft -= 1;
      scheduledVacationDays += 1;
   }
   
   // method cancelVacationDay
   public static void cancelVacationDay() {
      unscheduledVacationDaysLeft += 1;
      scheduledVacationDays -= 1;
   }
   
   // method terminateEmployee
   public static void terminateEmployee(String date) {
      terminationDate = date;
   }
   
   // method toString that formats output to the user
   public String toString() {

      
      String str = "";
      str += "Here is the data you've provided:";
      str += "\nFirst Name: " + employeeFirstName;
      str += "\nLast Name: " + employeeLastName;
      str += "\nFull Name: " + employeeFullName;
      str += "\nDate of Hire: " + dateOfHire;
      str += "\nTermination Date: " + terminationDate;
      str += "\nUnscheduled Vacation Days Left: " + unscheduledVacationDaysLeft;
      str += "\nScheduled Vacation Days Left: " + scheduledVacationDays;
      str += "\nLast Annual Review: " + lastAnnualReview;
      
      return str;
   }

   
}
