/* 1931 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;

class Meetings{
	private int beginTime;
	private int endTime;
	
	public Meetings(int beginTime, int endTime){
		this.beginTime = beginTime;
		this.endTime = endTime;
	}
	
	public int getBeginTime() {
		return beginTime;
	}
	
	public int getEndTime() {
		return endTime;
	}
	
}

public class Main {
	public void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Meetings[] mt = new Meetings[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int beginTime = Integer.parseInt(st.nextToken());
			int endTime = Integer.parseInt(st.nextToken());
			mt[i] = new Meetings(beginTime, endTime);
		}
		
		/* What I Learned : Comparator */
		/* What I Learned : sort() 매개변수 */
		Arrays.sort(mt, Comparator.comparingInt(Meetings::getEndTime)
							.thenComparingInt(Meetings::getBeginTime));
		
		int count = 0;
		int earliest = 0; // 다음 회의가 시작할 수 있는 가장 빠른 시간
		
		for(int j = 0; j < N; j++) {
			if(earliest <= mt[j].getBeginTime()) {
				earliest = mt[j].getEndTime();
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
