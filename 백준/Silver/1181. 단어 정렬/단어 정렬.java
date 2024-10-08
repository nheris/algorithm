import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		int N = Integer.parseInt(br.readLine());
		
		String[] arr = new String[N];
		
		for(int i = 0; i<N ;i++) {
			arr[i]= br.readLine();
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			if(o1.length() == o2.length()) return o1.compareTo(o2);
			else return o1.length() - o2.length();
		});
		
		//중복 빼고
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0]).append('\n');
		for(int i = 1; i<N; i++) {
			if(!arr[i-1].equals(arr[i])) {
				sb.append(arr[i]).append('\n');
			}
			
		}
		System.out.println(sb);
		
	}
}