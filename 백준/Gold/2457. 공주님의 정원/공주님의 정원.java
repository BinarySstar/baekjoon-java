/* 2457 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.ArrayList;

class Date implements Comparable<Date>{
	int month, day;
    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(Date o) {  // 날짜를 오름차순으로 정렬, 달이 같다면 일을 비교(음수가 나오면 해당 객체가 먼저 옴)
        if(this.month == o.month) { 
            return this.day - o.day;
        }
        return this.month - o.month;
    }

    public void update(int month, int day) {
        this.month = month;
        this.day = day;
    }
}

class Flower implements Comparable<Flower> {
	Date start;
	Date end;
	
	public Flower(int startMonth, int startDay, int endMonth, int endDay) {
		start = new Date(startMonth, startDay);
		end = new Date(endMonth, endDay);
	}
	
	@Override
    public int compareTo(Flower o) {  // 꽃 지는날 기준으로 내림차순
        return o.end.compareTo(this.end);
    }

}

public class Main {
	public void solution() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Flower> f = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sm = Integer.parseInt(st.nextToken());
			int sd = Integer.parseInt(st.nextToken());
			int em = Integer.parseInt(st.nextToken());
			int ed = Integer.parseInt(st.nextToken());
			f.add(new Flower(sm, sd, em, ed));
		}
		
		Collections.sort(f);
        Date startDate = new Date(3, 1);
        Date endDate = new Date(11, 30);
        int count = 0;
        
		while(!f.isEmpty()) {
			int i;
			for(i = 0; i < f.size(); i++) {
				Flower fr = f.get(i);
				// 현재날짜 >= 꽃이 피는 날 -> 반복문 종료
				if(startDate.compareTo(fr.start) >= 0 && startDate.compareTo(fr.end) <= 0) {
					break;
				}
			}
			
			// 고를 꽃이 없다면 while 반복문 탈출
			if(i >= f.size()) {
				count = 0;
				break;
			}
			
			Flower object = f.remove(i);
			
			count++;
			startDate.update(object.end.month, object.end.day);
			
			// 현재 날짜가 11월 30일보다 크면
			if(startDate.compareTo(endDate) > 0) {
				break;
			}
		}
		
		// 고를 꽃이 없으면
		if(startDate.compareTo(endDate) <= 0) {
			count = 0;
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}
}


