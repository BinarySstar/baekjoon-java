/* 2720 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public void solution() throws Exception{
		int[] coins = {25, 10, 5, 1};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		int T = Integer.parseInt(br.readLine());
		int[] money = new int[T];
		int count = 0;
		for(int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			money[i] = C;
			for(int coin : coins) {
				count += (int)money[i] / coin;
				sb.append(count).append(" ");
				count = 0;
				money[i] %= coin;
			}
			sb.append("\n");
		}
		System.out.println(sb);
		
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}