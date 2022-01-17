package myPackage;
public class Student {

	private String name, major;
	private int age;

	public Student(String name, int age, String major)
	{
		this.name = name;
		this.age = age;
		this.major = major;
	}

	public void show()
	{
		System.out.println(name + age + major);
	}

}
