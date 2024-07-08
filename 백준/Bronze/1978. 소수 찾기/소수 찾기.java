import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int count =0;
		int tmp = 0;
		
		for(int i = 0; i < N; i++){
			
			int B = Integer.parseInt(st.nextToken());
			tmp = 0;
			for(int j = 1; j <= B; j++){
	            if(B % j == 0) tmp++;
	            
			}
			if(tmp == 2) count++;
		}
	
		System.out.println(count);
	}
}