import myPackage.*;

public class Main {

	public static void main(String[] args)
	{
		Lab lab = new Lab("westlab");
		lab.show();

		Student s = new Student("nishikawa", 22, "ML");
		lab.regesterNewStudent(s);
		lab.show();
	}

}
