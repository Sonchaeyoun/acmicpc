import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class p17298 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		String eles = bf.readLine();
		StringTokenizer st = new StringTokenizer(eles);
		Stack<Integer> stack = new Stack<Integer>();
		int[] a = new int[n];
		
		StringBuilder sb = new StringBuilder("");
		int[] NGE = new int[n];
		
		int k = 0;
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			//bw.write("add");
		}
		
		stack.push(0);
		
		int now = 1;
		
		while(k < n) {
			if((a[stack.peek()] < a[now]) && (now < n)) {
				NGE[k] = a[now];
				stack.pop();
				if((now-k) == 1) {
					now++;
					stack.push(now);
				}
				k++;
				
			}
			
			else {
				stack.push(now);
				now++;
			}
			
			if(now == n) {
				NGE[k] = -1;
				k++;
				if(k < n) {
					now = k+1;
				}
			}
			
		}
		
		
		for(int j = 0; j < n; j++) {
			bw.write(String.valueOf(NGE[j]));
			if(j != n-1) {
				bw.write(" ");
			}
		}
		bw.flush();
		bw.close();
		
		
	}

}
