import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		int count =0;
		int tmp = 0;
		
		ArrayList list = new ArrayList<>();
		
		for(int i = N; i <= B; i++){
			tmp = 0;
			for(int j = 1; j <= i; j++){
	            if(i % j == 0) tmp++;
	            if(tmp > 2) continue;
			}
			if(tmp == 2) list.add(i);
		}
		
		if(list.size()==0) {
			System.out.println("-1");
		}
		else {
			
			for(Object a:list) {
				count+=(Integer)a;
			}
			System.out.println(count);//합
			System.out.println(list.get(0));//최솟값
		}
	}
}