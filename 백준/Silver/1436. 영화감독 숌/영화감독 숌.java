import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
	
		br.close();
		
		int count = 1;
		int num = 666;
		//666 1666 2666 .. 5666 6660 ~ 6669 7666 8666 9666

		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
				
		System.out.println(num);
		
		
	}
}