package BlueBridge;

import java.util.Scanner;

public class sum6 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			int temp = sc.nextInt();
			int sum = 0;
			for(int j = 1; j <= temp; j++){
				int temp2 = sc.nextInt();
				sum += temp2;
			}
			System.out.println(sum);
			if(i != n)
				System.out.println();
		}
			
		
	}
}
