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
		
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < N; i++) {
			sb.append(check(br.readLine())).append('\n');
		}
		
		
		System.out.println(sb);
		
	}
	
	static String check(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else if(stack.size() == 0) return "NO";
			else stack.pop();
		}
		if(stack.empty()) return "YES";
		else return "NO";

	}
	
}
