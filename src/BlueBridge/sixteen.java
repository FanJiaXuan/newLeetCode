package BlueBridge;

import java.util.Scanner;

public class sixteen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String a = sc.next();
			String b = sc.next();
			long f = Long.parseLong(a.replaceAll("\\+", ""), 16);
			long s = Long.parseLong(b.replaceAll("\\+", ""), 16);
			long res = f + s;
			if(res < 0){
				System.out.println("-" + Long.toHexString(-1 * res).toUpperCase());
			}else{
				System.out.println(Long.toHexString(res).toUpperCase());
			}
		}
	}
}
