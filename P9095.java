import java.util.*;

public class P9095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] d = new int[n+1];
			System.out.println(topDown(n, d));
		}
	}
	
	public static int topDown(int n, int[] d) {
		if(n == 0) return 1;
		if(n == 1) return 1;
		if(d[n] > 0) return d[n];
		if(n == 2) d[n] = topDown(n-1,d) + topDown(n-2, d);
		else d[n] = topDown(n-1,d) + topDown(n-2, d) + topDown(n-3, d);
		return d[n];
	}
}
