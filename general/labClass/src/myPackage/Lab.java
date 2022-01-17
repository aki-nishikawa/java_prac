package myPackage;

import java.util.List;
import java.util.ArrayList;

public class Lab{

	private String name;
	private ArrayList<Student> listStudents = new ArrayList<Student>();

	public Lab(String name)
	{
		this.name = name;
	}

	public void regesterNewStudent(Student student)
	{
		listStudents.add(student);
	}
	
	public void show()
	{
		System.out.println(this.name);
		for (var s : listStudents)
		{
			s.show();
		}
	}
}