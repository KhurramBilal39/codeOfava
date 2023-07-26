class JBT3
{
 	public static void main(String args[])
	{
		JBT3 obj = new JBT3();
		obj.methodTwo();
		
	}
	void methodOne()
	{
		System.out.println("Inside method One");
	}
	void methodTwo()
	{
		System.out.println("Inside method Two");
		this.methodOne();
	}
}
