package day16;

/*
			Score 클래스의 한사람의 데이터를 입력하는데
			입력받을 때 정규식 검사를 해서
			바른경우만 입력하세요...
 */
import java.util.*;
import java.util.regex.*;
public class HW02 {
	Score score;
	Scanner sc;
	String[] item = {"name", "java", "oracle", "jsp", "spring", "web", "js"};
	public HW02() {
		// 변수준비...
		score = new Score();
		sc = new Scanner(System.in);
		
		// 입력받고 
		
		// 정규식 검사
		
		// 데이터 입력
		setData();
		
		// 출력
		System.out.println(score);
		
	}
	
	// score에 데이터 입력하는 함수
	public void setData() {
		for(int i = 0 ; i < item.length ; i++ ) {
			
			while(true) {
				String str = (i == 0) ? str = "학생 이름" : item[i] + " 점수";
				System.out.print(str + " 입력 : ");
				String tmp = sc.nextLine();
				if(i > 0 && Integer.parseInt(tmp) > 100) {
					continue;
				}
				if(testReg(tmp, item[i])) {
					switch(item[i]) {
					case "name":
						score.setName(tmp);
						break;
					case "java":
						score.setJava(Integer.parseInt(tmp));
						break;
					case "oracle":
						score.setOracle(Integer.parseInt(tmp));
						break;
					case "jsp":
						score.setJsp(Integer.parseInt(tmp));
						break;
					case "spring":
						score.setSpring(Integer.parseInt(tmp));
						break;
					case "web":
						score.setWeb(Integer.parseInt(tmp));
						break;
					case "js":
						score.setJs(Integer.parseInt(tmp));
						break;
					}
					
					break;
				} else continue;
				
			}
		}
		score.setTotal();
		score.setAvg();
	}
	
	// 정규식 검사하는 함수
	public boolean testReg(String data, String arg) {
		boolean bool = false;
		String tmp = arg.equals("name") ? "^[가-힣]{2,10}$" : "^[1-9]{1}[0-9]{1,2}$";
		Pattern pat = Pattern.compile(tmp);
		Matcher mat = pat.matcher(data);
		return mat.matches();
	}
	
	public static void main(String[] args) {
		new HW02();
	}

}
