class JBT2
{
	JBT2()
	{
		this("JBT3");
		System.out.println("contructor without parameter");
	}
	JBT2(String str)
	{
		System.out.println("contructor with parameter: " + str);
	}
	public static void main(String args[])
	{
		JBT2 obj = new JBT2();
	}
} 