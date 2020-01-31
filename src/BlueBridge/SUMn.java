package BlueBridge;

import java.util.*;

public class SUMn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int res = 0;
			for(int i = 1; i <= n; i++){
				res += i;
			}
			System.out.println(res);
			System.out.println();
		}
		sc.close();
	}
}
