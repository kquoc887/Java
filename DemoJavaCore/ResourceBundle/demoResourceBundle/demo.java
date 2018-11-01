package demoResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		int choise;
		Scanner sc = new Scanner(System.in);
		ResourceBundle myBundle;
		do {
			System.out.println("1. English");
			System.out.println("2. Vietnamese");
			System.out.println("3. Germany");
			System.out.println("4. Exit");
			System.out.println("Please choose your leangue:");
			choise = sc.nextInt();
			switch (choise) {
			case 1: 
				myBundle = ResourceBundle.getBundle("demoResourceBundle.MessageBundle", Locale.US);
				System.out.println("Message in" + Locale.US + ": " + myBundle.getString("hello"));
				break;
			case 2:
				Locale.setDefault(new Locale("vi", "VN"));
				myBundle = ResourceBundle.getBundle("demoResourceBundle.MessageBundle");
				System.out.println("Message in" + Locale.getDefault()+ ": " + myBundle.getString("hello"));
				break;
			case 3:
				Locale.setDefault(new Locale("de", "GM"));
				myBundle = ResourceBundle.getBundle("demoResourceBundle.MessageBundle");
				System.out.println("Message in" + Locale.getDefault()+ ": " + myBundle.getString("hello"));
				break;
			}
		} while (choise != 4);
		sc.close();
	}
}
