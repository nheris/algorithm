import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //72
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 2; i <= Math.sqrt(N); i++){  //2~8
			while (N % i ==0) {
				sb.append(i).append('\n');//2 2 2 3 3
				N /= i;//36 18 9 3 1
			}
		}
		
		if (N != 1) {
			sb.append(N);
		}
		
		System.out.println(sb);
		
	}
}