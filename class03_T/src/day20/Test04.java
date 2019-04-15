package day20;

import java.util.*;
import etc.*;
public class Test04 {
	// 전체 그룹을 관리하는 맵
	HashMap groupMap = new HashMap();
	Scanner sc;
	public Test04() {
		sc = new Scanner(System.in);
		ArrayList list = new Friends().getList();
		for(int i = 0 ; i < list.size(); i++ ) {
			ArrayList l = (ArrayList)list.get(i);
			
			setFriend((String)l.get(0), (String)l.get(1), (String)l.get(2));
		}
		
		while(true) {
			System.out.println("조회할 그룹을 입력하세요! : (종료 : quit)");
			String str = sc.next();
			if(str.equals("quit")) {
				break;
			}
			if(!groupMap.containsKey(str)) {
				continue;
			}
			
			System.out.println("조회할 이름을 입력하세요! : ( 이전 : prev )");
			String str1 = sc.next();
			if(str1.equals("prev")) {
				continue;
			}
			if(!((HashMap) groupMap.get(str)).containsKey(str1)) {
				System.out.println("등록되지 않은 친구입니다.");
				continue;
			}
			getOne(str, str1);
		}
	}
	
	// 새로운 그룹을 만드는 함수
	public void makeGroup(String name) {
		// 그룹 이름을 알려주면 그 그룹을 만들어주는 함수
		if(!groupMap.containsKey(name)) {
			// 해당 이름의 키값이 존재하지 않으면
			// 해당 그룹이 없다는 말이므로
			// name 을 키값으로 가지는 HashMap을 만들어서 넣어준다.
			groupMap.put(name, new HashMap());
		}
	}
	
	// 친구 등록 함수
	public void setFriend(String group, String name, String tel) {
		/* 	등록할 친구가 
			등록될 그룹과 이름, 전화번호를 입력하면 등록해주는 함수
			
			그런데 
			등록할 그룹이 없다면???
			등록되지 않을 것이므로
			그때는 그룹을 만들고 입력을 해야 할 것이다.
		*/
		makeGroup(group);
		
		// 1. 친구를 등록할 그룹을 먼저 맵에서 알아내야 될 것이다.
		HashMap tmpMap = (HashMap) groupMap.get(group);
		// 2. 찾아낸 맵에 친구를 등록한다.
		tmpMap.put(name, tel);
	}
	
	// 한사람 데이터 조회하는 함수
	public void getOne(String group, String name) {
		// 할일
		// 1. 꺼낼 그룹을 알아내고
		HashMap tmpMap = (HashMap) groupMap.get(group);
		// 2. 꺼낸 맵에서 친구 정보를 조회한다.
		String tel = (String) tmpMap.get(name);
		
		System.out.println("*** 조회 데이터 ***\n\t이름 : " + name + "\n\tTel : " + tel);
	}
	
	// 모든 사람 꺼내는 함수 ==> 숙제
	public void getAll() {
		
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}



