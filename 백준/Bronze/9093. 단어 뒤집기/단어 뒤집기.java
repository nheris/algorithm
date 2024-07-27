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
		
		StringBuilder sb1 = new StringBuilder();//임시
		StringBuilder sb2 = new StringBuilder();//최종
		
		for(int i = 0; i<N ;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			while(st.hasMoreTokens()) {
				
				sb1.append(st.nextToken()).reverse();
				sb2.append(sb1).append(' ');
				sb1.delete(0,sb1.length());
			}
			sb2.append('\n');
		}
		
		System.out.println(sb2);
	}
	
}
