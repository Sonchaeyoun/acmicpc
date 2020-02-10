import java.util.*;

public class P11727 {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int[] d = new int[n+1];

	public static void main(String[] args) {
		System.out.println(topDown(n));
	}
	
	public static int topDown(int n) {
		if(n == 0 || n == 1) return 1;
		if(d[n] > 0) return d[n];
		
		d[n] = topDown(n-1) + topDown(n-2) * 2;
		d[n] %= 10007;
		return d[n];
	}

}
