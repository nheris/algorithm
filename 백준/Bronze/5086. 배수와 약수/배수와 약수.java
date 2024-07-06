import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (true) {
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if(N==0 && B==0) {
				break;
			}
			
			if(B%N==0) sb.append("factor"+'\n');
			else if(N%B==0) sb.append("multiple"+'\n');
			else sb.append("neither"+'\n');
			
		}

		br.close();

		System.out.println(sb.toString());
	}
}