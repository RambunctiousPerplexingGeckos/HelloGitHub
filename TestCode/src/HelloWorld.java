import java.util.*;
@SuppressWarnings("unused")
//commit saves a version
//push puts them into the actual repository
public class HelloWorld {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		boolean done = false;
		while (!done) {
		System.out.println("Hello, world!");
		if (i.nextLine().equalsIgnoreCase("STOP")){
			done = true;
			}
		}
		i.close();
	}
}
