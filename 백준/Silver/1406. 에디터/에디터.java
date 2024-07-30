import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {     
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();//뺀거
		
		//문자 스택 넣기
		for(int i = 0; i<str.length() ;i++) {
			stack1.push(str.charAt(i));
		}
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			String order = br.readLine();
			
			if(order.charAt(0) == 'L' && !stack1.empty()) {
				stack2.push(stack1.pop());
			}else if(order.charAt(0) == 'D' && !stack2.empty()) {
				stack1.push(stack2.pop());
			}else if(order.charAt(0) == 'B' && !stack1.empty()) {
				stack1.pop();
			}else if(order.charAt(0) == 'P'){
				stack1.push(order.charAt(2));
			}
			
		}
	
		//남은거 다넣기
		int a = stack2.size();
		while(a-- > 0) {
			stack1.push(stack2.pop());
		}
		StringBuilder sb = new StringBuilder();
		for(char c: stack1) {
			sb.append(c);
		}
		System.out.println(sb);
	}
}
