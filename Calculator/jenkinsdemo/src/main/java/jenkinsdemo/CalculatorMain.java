package jenkinsdemo;


public class CalculatorMain
{
	public static void main(String args[])
	{
		System.out.println("Calculator Operations......");
 
		Calculator c1 = new Calculator();
		c1.add(10, 20);
		c1.sub(10, 20);
		c1.mul(10, 20);
		c1.add(15, 25);
	}
}
