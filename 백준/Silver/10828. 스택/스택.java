import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {     
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i<N ;i++) {
			String str = br.readLine();
			if(str.contains("push")) st.push(Integer.parseInt(str.substring(5)));
			else if(str.equals("pop")) System.out.println(st.empty() ? "-1" : st.pop());
			else if(str.equals("size")) System.out.println(st.size());
			else if(str.equals("empty"))  System.out.println(st.empty() ? "1" : "0");
			else  System.out.println(st.empty() ? "-1" : st.peek());
		}
		
		
	}
	
}
