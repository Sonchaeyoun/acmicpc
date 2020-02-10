package BJ;

import java.util.*;

public class P2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] data = new int[T];
		for(int i = 0 ; i< T; i++) {
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		
		for(int i = 0 ; i < T; i++) {
			System.out.println(data[i]);
		}

	}

}
