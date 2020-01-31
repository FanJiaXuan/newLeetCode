package BlueBridge;

import java.util.Scanner;

public class sum5 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			n = sc.nextInt();
			if(n == 0)
				continue;
			else{
				int sum = 0;
				for(int i = 1; i <= n; i++){
					int temp = sc.nextInt();
					sum += temp;
				}
				System.out.println(sum);
			}
		}
	}
}
