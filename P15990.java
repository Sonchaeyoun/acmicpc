import java.io.*;

public class P15990 {
	static int T,n,div,limit,ans;
	static int[][] dp;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		div = 1000000009;
        limit = 100000;
        dp = new int[limit+1][4];
        dp[1][1] = dp[2][2] = dp[3][3] = dp[3][1] = dp[3][2] = 1;
        for(int i = 4; i <= limit; i++) {
        	for(int j = 1; j <= 3; j++) {
        		if(j == 1)dp[i][j] = dp[i-1][2] + dp[i-1][3];
        		else if(j==2) dp[i][j] = dp[i-2][1] + dp[i-2][3]; 
        		else dp[i][j] = dp[i-3][1] + dp[i-3][2]; 
        		dp[i][j] %= div;
        	}
        }
        T = Integer.parseInt(br.readLine().trim());
        for(int tc = 1; tc<=T; tc++) {
        	n = Integer.parseInt(br.readLine().trim());
            ans = 0;
            for(int i = 1; i<=3; i++) {
                ans += dp[n][i];
                ans %= div;
            }
            System.out.println(ans);
        }
	}

}
