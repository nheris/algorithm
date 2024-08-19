import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {     
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Stack<Character> st = new Stack<>();
		
		int result = 0;
		
		for(int i =0; i<str.length() ;i++) {
			if(str.charAt(i) == '(') {
				st.push('(');
				continue;
			}
			
			if(str.charAt(i) == ')') {
				st.pop();
				
				if(str.charAt(i-1) == '(') {
					result += st.size();
				}else result++;
				
			}
		}
		System.out.println(result);
		
		
	}
}
