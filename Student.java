//Package
package week1.day1;

	//Create class by name Student
	public class Student {
	
		//Declaring Global Variable
		public String sName = "Shelby";
		public short rollNo = 18708;

	//Create Main method
	public static void main(String[] args) {
		
		System.out.println("College Details");
		
	//Create a object
		Student getStudentRecord = new Student();
		
	//Calling the method
		getStudentRecord.printGivenCollegeName("BHC Student Details");
		getStudentRecord.college();
		int studentMark = getStudentRecord.getCsMark();
		System.out.println(studentMark);
	
	}
	
	// Create method with 'Public' Access modifier
	
		public void college() {
			  byte year = 3;
			  int collegeRegNo = 345216789;
			  long studMobileNo = 9500003228L;
			  float markEC = 45.82F;
			  double studentFees= 45000.7654;
			  char section = 'c';
			  System.out.println(sName);
			  System.out.println(rollNo);
			  System.out.println(year);
			  System.out.println(collegeRegNo);
			  System.out.println(studMobileNo);
			  System.out.println(markEC);
			  System.out.println(studentFees);
}
		// Create method with 'Private' Access modifier
		private int getCsMark(){
			int csMark = 87;
			return csMark;					
		}
		
		// Create method with 'package' Access modifier
		void printGivenCollegeName(String cname) {
			System.out.println(cname);
			//Declaring local variable
			String schoolName = "HCC";
			System.out.println(schoolName);
		}
}
