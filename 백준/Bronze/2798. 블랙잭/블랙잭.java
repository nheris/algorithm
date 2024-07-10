import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = Integer.parseInt(st.nextToken()); //카드 개수
        int sum = Integer.parseInt(st.nextToken()); //힙
        
        int[] arr = new int[num];
        
        st = new StringTokenizer(br.readLine());
        
        int max=0;
        
        for(int i=0;i<num;i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0;i<num-2;i++) {
        	for(int j=i+1;j<num-1;j++) {
        		for(int k=j+1;k<num;k++) {
        			if(max<arr[i]+arr[j]+arr[k] && arr[i]+arr[j]+arr[k]<=sum) {
        				max = arr[i]+arr[j]+arr[k];
        			}
        		}
        	}
        }
        
        System.out.println(max);
	}
}