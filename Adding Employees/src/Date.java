// This program will add employees with the help of OOP. (Jade Park - 8/2/2021)
// This class represents a date.

class Date {

   private String date;
   private int month;
   private int day;
   private int year;
   
   // method getDate
   public String getDate() {
		return date;
	}
	
   
   // method setDate
   public void setTerminationDate(int month, int day, int year) {
		date = month + "/" + day + "/" + year;
	}
   
}