import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {     
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[num]; //원본
		int[] arr2 = new int[num]; //정렬
		HashMap<Integer, Integer> map = new HashMap<>(); //중복제거순서
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i<num;i++) {
			arr1[i] = arr2[i] =Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr2);
		
		int rank = 0;
		
		for(int a: arr2) {
			if(!map.containsKey(a)) {
				map.put(a, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a: arr1) {
			sb.append(map.get(a)).append(' ');
		}
		
		System.out.println(sb);
		
	}
	
}
