class Parent
{
  public String name = "Parent";

  public Parent() {};
  public void doStuff()
  {
     System.out.println(name);
  }
}

class Child extends Parent
{
  public String name = "Child";
  public Child()
  {
    doStuff();
  }
}
class Main9
{
	public static void main(String args[])
	{
		Child cc = new Child();
	}
}