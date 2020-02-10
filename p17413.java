import java.util.*;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class p17413 {
	
    private static void printStack(BufferedWriter bw, Stack<Character> stack) throws IOException {
        while (!stack.isEmpty()) {
            bw.write(stack.pop());
        }
    }

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringBuilder sb = new StringBuilder("");
		boolean flag = false;
		
		Stack<Character> s = new Stack<Character>();

		String str = bf.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '<') {
				flag = true;
				printStack(bw, s);
				bw.write(str.charAt(i));
				
			}
			else if(str.charAt(i) == '>') {
				flag = false;
				bw.write(str.charAt(i));	
			}
			else if(flag) {
				bw.write(str.charAt(i));
			}
			else {
				if(str.charAt(i) == ' ') {
					printStack(bw, s);
					bw.write(str.charAt(i));
				}
				else {
					s.push(str.charAt(i));
				}
			}

			
		}
		
		printStack(bw, s);
		
		bw.flush();
		bw.close();
		bf.close();
		

	}

}
