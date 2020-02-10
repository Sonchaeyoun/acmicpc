package BJ;

import java.util.*;

public class P2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[3];
		
		data[0] = Integer.parseInt(sc.next());
		data[1] = Integer.parseInt(sc.next());
		data[2] = Integer.parseInt(sc.next());
		
		Arrays.sort(data);
		
		for(int i = 0; i < 3; i++) {
			System.out.print(data[i] + " ");
		}
	}

}
