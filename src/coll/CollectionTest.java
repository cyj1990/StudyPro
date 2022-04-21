package coll;

import java.util.LinkedList;


public abstract class CollectionTest  {
	
	public static void main(String[] args) {
		
		
		
		LinkedList<Student> list = new LinkedList<Student>();
		Student s1 = new Student(1,"444");
		Student s2 = new Student(2,"555");
		Student s3 = new Student(3,"666");
		
		
		list.add(s1);
		list.add(s2);
		list.add(s2);
		list.add(s3);
		
		list.get(0);
		list.get(1);
		list.get(2);
		
		System.out.println( list.get(0).getAge()  );
		System.out.println( list.get(1).getAge()  );
		System.out.println( list.get(2).getAge()  );
		
		
		
		
		
		
	}
	
	
	
	
}
