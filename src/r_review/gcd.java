package r_review;

public class gcd {
	public int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
	
}
