package IListDemo;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int studId;
	String studName;
	int studAge;
	
	public Student(int studId, String studName, int studAge) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studAge=" + studAge + "]";
	}
    	
}

public class ArrayListDemo2 {
public static void main(String[] args) {
	
	Student student1 = new Student(1, "Nagesh", 101);
	Student student2 = new Student(2, "Shubham", 102);
	Student student3 = new Student(3, "Abhi", 103);

	ArrayList<Student> list = new ArrayList<>();
	list.add(student1);
	list.add(student2);
	list.add(student3);
	
	//System.out.println(list);
	Iterator it = list.iterator();
	while (it.hasNext()) {
		System.out.println(it.next()); 
	}
	
	
}
}
