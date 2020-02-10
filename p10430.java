import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class p10430 {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input);
		
		int[] arr = new int[3];
		
		for(int i = 0 ; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int first = (arr[0]+arr[1])%arr[2];
		int second = (arr[0]%arr[2]+arr[1]%arr[2])%arr[2];
		int third = (arr[0]*arr[1])%arr[2];
		int fourth = (arr[0]%arr[2]*arr[1]%arr[2])%arr[2];
		
		int[] res = {first, second, third, fourth};
		
		for(int j = 0; j < 4; j++) {
			bw.write(String.valueOf(res[j])+"\n");
		}
		
		bw.flush();
		bw.close();
		

	}

}
