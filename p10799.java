import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class p10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int result = 0;
		boolean first = false;
		
		String str = bf.readLine();
		
		Stack<Integer> stack = new Stack<Integer>();
		//Stack<Character> cStack = new Stack<Character>();
		
		/*for(int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}*/
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				stack.push(i);
				first = true;
			}
			
			else if(str.charAt(i) == ')') {
				if(first == true && i-stack.peek() == 1) {
					stack.pop();
					result += stack.size();
				}
				else if(first == true && i-stack.peek() != 1) {
					result += 1;
					stack.pop();
				}
				else {
					first = false;
					stack.push(i);
				}
			}
		}
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}

}
