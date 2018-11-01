package demo.java.util.Enum;

import java.util.Scanner;

public class ExampleEnum {
	public static void main(String[] args) {
		int choise;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Cửa hàng chúng tôi có:");
			System.out.println("1. IOS.");
			System.out.println("2. Android.");
			System.out.println("3. Exit.");
			System.out.println("Mời bạn chọn loại điện thoại bạn muốn xem:");
			choise = sc.nextInt();
			switch (choise) {
			case 1:
				Phones iphone = Phones.Iphone;
				System.out.println(iphone.getType() + ", " + iphone.getRam() + ", " + iphone.getSystem());
				break;
			case 2:
				Phones android = Phones.Android;
				System.out.println(android.getType() + ", " + android.getRam() + ", " + android.getSystem());
			default:
				break;
			}
		
		} while (choise != 3);
		sc.close();
	}
}
