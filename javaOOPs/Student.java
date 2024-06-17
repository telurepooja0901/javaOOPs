package javaOOPs;

public class Student
{
	int studentId;
	String studentName;
	int studentAge;
	String studentDepartment;
	String studentYear;
	
	public static String departmentName;
	
	public Student()
	{
		studentId = 101;
		studentName = "Amol";
		studentAge = 21;
		studentDepartment = "CS";
		studentYear = "2nd Year";
	}
	
	public Student(int studentId, String studentName, int studentAge, String studentDepartment, String studentYear)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentDepartment = studentDepartment;
		this.studentYear = studentYear;
		
	}
	
	static
	{
		departmentName = "Computer Science";
	}
	
	public void getStudent()
	{
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(studentAge);
		System.out.println(studentDepartment);
		System.out.println(studentYear);

	}
	
	public static void getstudentDepartment()
	{
		System.out.println(departmentName);
	}
}
