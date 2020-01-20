package egggs;

import java.util.Scanner;

public class Tool {
	
	
	public static int maxEggs;
	private static Scanner readtool;
	
	
	public static void method() {
		System.out.println("Изберете в  съдът с който ще готвите: джезге , канче , тенджера");
		readtool = new Scanner(System.in);
		 String Tool;
		 Tool = readtool.nextLine();
		 while (true) 
		 {
			 
			 if (Tool.equals("джезве")) {
				  maxEggs=3;
					break;
				}
			if (Tool.equals("канче")) {
			  maxEggs=6;
			  break;
			}
			if (Tool.equals("тенджера")) {
				  maxEggs=14;
				  break;
				}
			Tool = readtool.nextLine();
		}
		
		
		
		
	}
	
	
}
