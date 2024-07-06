import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		br.close();
		
		int i=1;
		int max=1;
		
		if(num ==1)
			System.out.println(1);
		else {
			while(num>max) {	//1. (num)13>7
				max+=(6*i);	// 1. max= 19
				if(num<=max)//1. 
					System.out.println(i+1);
				i++;
			}
		}
		
		
	}
}