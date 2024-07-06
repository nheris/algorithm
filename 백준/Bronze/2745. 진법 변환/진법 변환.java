import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken(); //숫자
		int num = Integer.parseInt(st.nextToken()); //진법
		
		br.close();
		
		int tem = 0;//승
		int total =0;
		
		for(int i=str.length()-1; i>=0; i--) {
			char cha = str.charAt(i);
			if(65<=cha && cha<='Z')
				cha -= 55; 
			else cha -= '0';

			total += (cha * Math.pow(num,tem++));
		}
		
		System.out.println(total);
	}
}