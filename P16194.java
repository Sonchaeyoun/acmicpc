import java.util.*;

public class P16194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n+1];
		int[] d = new int[n+1];
		for(int i = 1; i <= n; i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		
		for(int m = 1; m <= n ; m++) {
			d[m] = 1000*10000;
		}
		d[0] = 0;
		
		for(int j = 1; j <= n; j++) {
			for(int k = 1; k <= j; k++) {
				d[j] = Math.min(d[j], d[j-k]+p[k]);
			}
		}
		System.out.println(d[n]);

	}

}
