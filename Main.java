public class Main {
	public static void main(String[] args)
	{
		charWeg c = new charWeg();
		c.printTest();

		String tekst =
			"Dit is een tekst met \" en ** en ??" + 
			"en allerlei andere niet wenselijke tekens zoals ® etc. 			";
		System.out.println(tekst);
	}
}