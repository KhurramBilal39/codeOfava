class MainB
{
	String name;
	long seatno;
	A1(String name, long seatno)
	{
		this.name = name;
		this.seatno = seatno;
	}
}
class a1
{
	public static void main(String args[])
	{
		A1 aa = new A1("Ahmer",18252044);
		System.out.println("Name: "+ aa.name);
		System.out.println(" Seatno: "+ aa.seatno);
	}
}
