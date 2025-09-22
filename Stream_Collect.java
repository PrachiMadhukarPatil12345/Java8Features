package java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Student
{
	String StudentName;
	int marks;
	public Student(String studentName, int marks) {
		super();
		StudentName = studentName;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", marks=" + marks + "]";
	}
	
}
public class Stream_Collect
{

	public static void main(String[] args)
	{

		 Student s1 = new Student("Prachi", 100);
		 Student s2 = new Student("Smitaa", 70);
		 Student s3 = new Student("Priti", 100);
		 Student s4 = new Student("Raam", 60);
		 Student s5 = new Student("Siyaa", 100);
		 Student s6 = new Student("Siyaa", 100);
		 Student s7 = new Student("Siyaa", 78);
		 
	List<Student> myls =  Arrays.asList(s1,s2,s3,s5);
//		myls.stream().filter(m -> m.marks>80).map(m -> m.StudentName + " ") .forEach(u ->System.out.println(u) );
//		 
		 
		 
				 myls.stream().map( m -> m + " MyMap").forEach(k -> System.out.println(k) ); //collect your objects
			//collect.forEach(f -> System.out.println(f) );
			System.out.println( "=============================");
		 
			List<Student> collect = myls.stream()
					.collect(Collectors.toList() );
			collect.forEach(f -> System.out.println(f) );
			
			System.out.println( "=============================");
			
			Set<Student> collect2 = myls.stream()
					.collect(Collectors.toSet() );
			collect2.forEach(f -> System.out.println(f) );
		 
			System.out.println( "============================="); 
			
			/*
			 * Map<Student> collect3 = myls.stream() .collect(Collectors.toMap() );
			 * collect.forEach(f -> System.out.println(f) );
			 */
	}

}
