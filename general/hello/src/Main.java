import model.*;

public class Main {

	public static void main(String[] args)
	{
		HelloWorld h = new HelloWorld();
		h.hello();
		int a = 3, b = 5;
		h.add(a, b);

		Person p = new Person(20, "nishikawa");
		p.printName();
		p.printAge();

		int n = 100;
		FizzBuzz f = new FizzBuzz(n);
		f.out();
	}

}
