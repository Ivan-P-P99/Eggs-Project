package egggs;

import java.util.Scanner;

public class cooking {
	static Scanner howLong;
	
	public static void method() {
		System.out.println("Колко минути ще се варят яйцата");
		
		howLong= new Scanner(System.in);
		int cookingTime = howLong.nextInt();
		
		if (cookingTime>=3) {
			System.out.println("Вашите яйца са рохкави, жълтъкът и белтъка са течни");
		}
		else if (cookingTime>3 && cookingTime<=5) {
			System.out.println("Вашите яйца са леко рохкави, жълтъкът е течнен");
		}
		else if(cookingTime>5) {
			System.out.println("Вашите яйца са твърдо сварени");	
		}
		
		
		
	}

}
