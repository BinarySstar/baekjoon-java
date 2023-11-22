import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		Integer [] arr = new Integer[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, Comparator.reverseOrder());
		
		int result = 0;
		
		for (int i = 0; i < K; i++) {
            result += arr[i];
        }
		
        System.out.println(result - ((K - 1) * K / 2));
		
	}
	
	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
