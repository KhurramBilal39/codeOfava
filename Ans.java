//Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class
class Parent1
{
	void methodP()
	{
		System.out.println("This is Parent class");
	}
}
class Child1 extends Parent1
{
	void methodC()
	{
		System.out.println("This is Child class");
	}
}
class Ans
{
	public static void main(String args[])
	{
		Parent1 pp = new Parent1();
		Child1 cc = new Child1();
		pp.methodP();
		cc.methodC();
		cc.methodP();
	}
}