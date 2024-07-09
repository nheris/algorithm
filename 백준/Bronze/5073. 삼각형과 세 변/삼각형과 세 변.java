import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
	
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if (a == b && b == c) {
                if (a == 0)
                    break;
                sb.append("Equilateral").append('\n');
            } else if (a + b <= c || b + c <= a || c + a <= b) {
            	sb.append("Invalid").append('\n');
            } else if (a != b && b != c && c != a) {
            	sb.append("Scalene").append('\n');
            } else {
            	sb.append("Isosceles").append('\n');
            }
			
		
		} 
		
		System.out.println(sb.toString());
	}
}