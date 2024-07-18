import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken()); //10
		int M = Integer.parseInt(st.nextToken()); //10
		
		boolean [][] arr = new boolean[N][M];
		
		//배열넣기
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				if(str.charAt(j)=='W') arr[i][j] = true; //W = ture
				else arr[i][j] = false;
			}
		}
		
		//판별
		int min = 64;
		
		for(int i=0;i<=N-8;i++) { //0~2
			for(int j=0;j<=M-8;j++) { //0~2 까지 최소 시작점.
				
				int count = 0;
				//처음 시작 색
				boolean first = arr[i][j];
				
				for(int k=i; k<i+8;k++) {
					for(int a=j; a<j+8;a++) {
						
						if(arr[k][a] != first) {
							count++;
						}
						
						first = !first;
					}
					first = !first;//다음줄
				}
				
				min=Math.min(min,Math.min(count, 64-count));
				
			}
		}
		
		System.out.println(min);
	}
}