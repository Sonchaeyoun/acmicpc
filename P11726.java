import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P11726 {
	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int[] d = new int[n+1];

	public static void main(String[] args){
		System.out.print(num(n));
	}
	
	public static int num(int n) {
		if(n == 0 || n== 1) return 1;
		if(d[n] > 0) return d[n];
		d[n] = num(n-2) + num(n-1);
		d[n] %= 10007;
		
		return d[n];
	}

}
