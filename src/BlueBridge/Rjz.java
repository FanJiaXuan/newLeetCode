package BlueBridge;

import java.util.Scanner;

public class Rjz {
	public static void main(String[] args) {
//		String a = "apple";
//		char aa[] = a.toCharArray();
//		System.out.println(aa.length);
//		System.out.println(a.length());
		Scanner sc = new Scanner(System.in);
//		String s = "app";
//		String b = "cc";
//		s += 's';
//		System.out.println(s);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			String res = new StringBuffer("").toString();
			if(a >= 0){
				while(a != 0){//对余数操作  让它变成目标进制的表示
				//System.out.println("a % b :" + new StringBuffer(Integer.toString(a % b)).toString());
				if(a % b == 10)
					res += 'A';
				else if(a % b == 11)
					res += 'B';
				else if(a % b == 12)
					res += 'C';
				else if(a % b == 13)
					res += 'D';
				else if(a % b == 14)
					res += 'E';
				else if(a % b == 15)
					res += 'F';
				else
					res += new StringBuffer(Integer.toString(a % b)).toString();
				a /= b;
				//System.out.println("a:" + a);
			}
//			System.out.println(new StringBuffer("abc").reverse().toString());
//			System.out.println("res:" + res);
			System.out.println(new StringBuffer(res).reverse().toString());
			}else{
				a *= -1;
					while(a != 0){
					if(a % b == 10)
						res += 'A';
					else if(a % b == 11)
						res += 'B';
					else if(a % b == 12)
						res += 'C';
					else if(a % b == 13)
						res += 'D';
					else if(a % b == 14)
						res += 'E';
					else if(a % b == 15)
						res += 'F';
					else
						res += new StringBuffer(Integer.toString(a % b)).toString();
					
					a /= b;
					//System.out.println("a:" + a);
				}
//				System.out.println(new StringBuffer("abc").reverse().toString());
//				System.out.println("res:" + res);
				System.out.println("-" + new StringBuffer(res).reverse().toString());
			}
		}
	}
}
