public class PhoneTester {

	public static void main(String[] args) {
		
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Starlight");
		Iphone iphone10 = new Iphone("10", 100, "AT&T", "Reflection");
		
		s9.displayInfo();
		System.out.println(s9.ring()) ;
		System.out.println(s9.unlockPhone());

		
		iphone10.displayInfo();
		System.out.println(iphone10.ring());
		System.out.println(iphone10.unlockPhone());

	}

}