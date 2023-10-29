/* 2864 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	public void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String A = st.nextToken();
		String B = st.nextToken();
		
		/* 최솟값 구하기 : 6을 모두 5로 전환 */
		String minA = A.replace('6', '5');
		String minB = B.replace('6', '5');
		int min = Integer.parseInt(minA) + Integer.parseInt(minB);
		
		/* 최댓값 구하기 : 5를 모두 6으로 전환 */
		String maxA = A.replace('5', '6');
		String maxB = B.replace('5', '6');
		int max = Integer.parseInt(maxA) + Integer.parseInt(maxB);
		
		sb.append(min).append(" ").append(max);
		System.out.println(sb);
		
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
