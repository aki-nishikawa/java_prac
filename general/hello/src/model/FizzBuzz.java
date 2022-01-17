package model;
public class FizzBuzz{
	private int limit;

	public FizzBuzz(int n)
	{
		this.limit = n;
	}

	public void out()
	{
		for(int i = 0; i < this.limit; i++)
		{
			if(i % 15 == 0){
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
		}
	}

}