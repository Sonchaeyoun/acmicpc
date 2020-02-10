import java.util.*;
//import java.math;

public class P11052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n+1];
		int[] d = new int[n+1];
		for(int i = 1; i <= n; i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		
		for(int j = 1; j <= n; j++) {
			for(int k = 1; k <= j; k++) {
				d[j] = Math.max(d[j], d[j-k]+p[k]);
			}
		}
		System.out.println(d[n]);
	}

}
