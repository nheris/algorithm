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
		
		int[][] arr = new int[N][2];
		
		StringTokenizer st;
		
		//배열넣기
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		br.close();
		
//		Arrays.sort(arr, new Comparator<int []>() {
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				if(o1[0] == o2[0]) return o1[1] - o2[1]; //차이가 음수면 첫 번째 요소가 앞에
//				else return o1[0] - o2[0];
//				
//			}
//		});
		
		Arrays.sort(arr,(o1,o2) -> {
			if(o1[0]==o2[0]) return o1[1] - o2[1];
			else return o1[0] - o2[0];
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<N;i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append("\n");
			
		}
		System.out.println(sb);
	}
}