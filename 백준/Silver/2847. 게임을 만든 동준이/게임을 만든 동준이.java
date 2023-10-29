/* 2847 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int [] scores = new int[N];
		int count = 0;
		for(int i = 0; i < N; i++) {
			int s = Integer.parseInt(br.readLine());
			scores[i] = s;
		}
		
		for (int j = N-1; j > 0; j--) {
			while(scores[j] <= scores[j-1] && (j-1) >= 0) {
				if(scores[j] <= scores[j-1] && (j-1) >= 0) {
					count++;
					scores[j-1]--;
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
