import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class P2609 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		System.out.println(gcd(n1, n2));
		System.out.println(gcd(n1, n2)*(n1/gcd(n1, n2)) * (n2/gcd(n1, n2)));

	}
	
	public static int gcd(int num1, int num2) {
		if(num2 == 0) {
			return num1;
		}
		else {
			return gcd(num2, num1%num2);
		}
	}

}
