package BJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class P1002 {
	static int[] arr = new int[6];

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < t; i++) {
			String r = br.readLine();
			StringTokenizer st = new StringTokenizer(r, " ");
			int j = 0;
			while(st.hasMoreTokens()) {
				arr[j] = Integer.parseInt(st.nextToken());
				j++;
			}
			double d = Math.sqrt(Math.pow(arr[0]-arr[3],2) + Math.pow(arr[1]-arr[4],2));
			if(d == 0) {
				if(arr[2] != arr[5]) {
					System.out.println(0);
					continue;
				}
				else if(arr[2] == arr[5]) {
					System.out.println(-1);
					continue;
				}
				
			}
			
			else {
				if((d < (arr[2] + arr[5])) && (d > Math.abs(arr[2]-arr[5]))) {
					System.out.println(2);
				}
				else if(d == (arr[2] + arr[5]) || d == Math.abs(arr[2]-arr[5])) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				
			}
			
		}

	}

}
