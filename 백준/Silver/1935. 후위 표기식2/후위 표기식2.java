import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {   
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String M = br.readLine();
		
		double[] arr = new double[N];
		
		for(int i =0; i<N; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Stack<Double> st = new Stack<>();
		
		
		for(int i =0; i<M.length();i++) {
			
			if('A'<= M.charAt(i) && M.charAt(i)<='Z') {
				
				st.push(arr[M.charAt(i)-'A']);
				
			}else {
				double a = st.pop();
				double b = st.pop();
				
				
				switch(M.charAt(i)){
					case '+' : {
						st.push(b+a);
						continue;
					}
					case '-' : {
						st.push(b-a);
						continue;
					}
					case '*' : {
						st.push(b*a);
						continue;
					}
					case '/' : {
						st.push(b/a);
						continue;
					}
				}
			}

		}
		
		
		System.out.printf("%.2f", st.peek());
	}
}
