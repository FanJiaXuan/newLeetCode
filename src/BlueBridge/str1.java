package BlueBridge;

import java.util.Scanner;

public class str1 {
	public static void main(String[] args) {
//		String s = "apple banana";
//		System.out.println(s.substring(1, 4));
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//sc.nextLine();
		while(n-- > 0){
			String temp = sc.next();
			//System.out.println("×Ö·û´®³¤¶ÈÊÇ:" + temp.length());
			System.out.println("6" + temp.substring(6, 11));
		}
	}
}
