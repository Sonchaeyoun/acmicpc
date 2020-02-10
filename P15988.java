import java.io.*;
public class P15988 {
	static int T, limit, n;
	static long[] d;
	static long div = 1000000009L;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		div = 1000000009;
		
		limit = 1000000;
		
		d = new long[limit+1];
		
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		for(int i = 4; i <= limit; i++) {
			d[i] = ((d[i-1]%div)+(d[i-2]%div)+(d[i-3]%div))%div;
		}
		
		T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(d[n]));
			bw.write("\n");
			bw.flush();
		}
		
		

	}

}
