import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken()); //숫자
		int any = Integer.parseInt(st.nextToken()); //진법
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		while(num !=0) {
			if(num%any >= 10) {
				sb.append((char)(num%any+55));
			}
			else {
				sb.append(num%any);
			}
			num /= any;
		}
		
		System.out.println(sb.reverse().toString());
	}
}