import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long num = Long.parseLong(br.readLine());
		br.close();
		
		System.out.println(num*4);
		
	}
}