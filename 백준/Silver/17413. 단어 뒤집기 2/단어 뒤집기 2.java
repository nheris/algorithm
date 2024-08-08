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
		StringBuilder sb = new StringBuilder();
		
		boolean check = false;
		
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i<str.length() ;i++) {
			//' ', <, 마지막철자 기점 pop
			if(str.charAt(i) == '<') {
				while(!st.isEmpty()) {
					sb.append(st.pop());
				}
				check = true;
			}else if(str.charAt(i) == '>') {
				check = false;
				sb.append('>');
				continue;
			}
			
			
			if(check == true) {
				sb.append(str.charAt(i));
			}else if(check == false) {
				
				//' ', <, 마지막철자 기점 pop
				if(str.charAt(i) == ' ') {
					while(!st.isEmpty()) {
						sb.append(st.pop());
					}
					sb.append(' ');
				}else {
					
					st.add(str.charAt(i));
				}
			}
			//' ', <, 마지막철자 기점 pop
			if(i == str.length()-1 ) {
				while(!st.isEmpty()) {
					sb.append(st.pop());
				}
			}
		}
		
		
		
		System.out.println(sb);
		
	}
}
