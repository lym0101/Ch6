import java.util.Scanner;

public class PPAP {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.print("Type the value for Obj A: ");
		String a = in.next();
		in.nextLine();
		System.out.print("Type the value for Obj B: ");
		String b = in.next();
		in.nextLine();
		
		System.out.println(ppap(phrase));
	}
	
	public static String ppap (String s) {
		String a = s.substring(9, s.indexOf(","));
		String b = s.substring(9+a.length()+11);
		
		
		return "Uh! " + b + a;
	}
}
