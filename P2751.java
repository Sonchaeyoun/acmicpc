package BJ;
import java.util.*;
public class P2751 {
	public static void quick(int[] data, int start, int end) {
		if(start >= end) {
			return;
		}
		
		int key = start;
		int i = start+1, j = end, temp;
		
		while(i <= j) {
			while(data[i] <= data[key]) {
				i++;
			}
			while(data[j] >= data[key] && j > start) {
				j--;
			}
			if(i > j) {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		quick(data, start, j-1);
		quick(data, j+1, end);
		 
	}

	public static void main(String[] args) {
		int[] data = new int[1000001];
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			data[i] = sc.nextInt();
		}
		quick(data,0, num-1);
		for(int j = 0; j < num; j++) {
			System.out.print(data[j]+" ");
		}

	}

}
