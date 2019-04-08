package day14;

/*
	문제 1]
		java, oracle, jsp, sprint, web, js, 평균, 총점
		평균을 구하는 함수, 총점을 구하는 함수로 처리하고
		과목의 개인별 점수를 저장할 VO 클래스를 만들고
		
		우리반 학생 전체의 점수를 배열로 만들어서 관리하세요.
		
		발생할 수 있는 예외에 대한 처리를 해 주세요...
		1. 배열의 갯수를 벗어난 경우
		2. 10 이하의 점수가 나는 경우
		3. 평균을 계산하는데 0 으로 나누는 경우
 */
public class HW01 {
	Class03[] score;
	String[] name = {"강찬규", "강태훈", "김상우", "김태헌", "김태형",
					"김형준", "김환진", "박정헌", "박형진", "서병주",
					"안다예", "양희준", "전영수", "조원용", "허준석" };
	
	public HW01() {
		score = new Class03[15];
		setData();
		toPrint();
	}
	// 데이터 입력함수
	public void setData() {
		for(int i = 0 ; i < score.length ; i++ ) {
			int[] no = createScore();
			try {
				score[i] = new Class03(name[i]);
				score[i].setJava(no[0]);
				score[i].setOracle(no[1]);
				score[i].setJsp(no[2]);
				score[i].setSpring(no[3]);
				score[i].setWeb(no[4]);
				score[i].setJs(no[5]);
				score[i].setTotal();
				score[i].setAvg();
			} catch (NullPointerException e) {
				System.out.println("이름이 입력되지 않아 프로그램을 종료합니다.");
			} catch (IllegalArgumentException e) {
				System.out.println("점수가 입력되지 않았거나 모자랍니다. 프로그램을 종료합니다.");
			} catch(ArithmeticException e) {
				System.out.println("평균을 구하는데 0 으로 나누는 계산식입니다. 프로그램을 종료합니다.");
			}
		}
	}
	// 점수 발생 함수
	public int[] createScore() {
		int[] no = new int[6];
		for(int j = 0 ; j < no.length ; j++ ) {
			no[j] = (int)(Math.random()*90 + 11);
		}
		
		return no;
	}
	
	public void toPrint() throws NullPointerException, IllegalArgumentException, ArithmeticException {
		System.out.printf("**%6s***%4s***%6s***%3s***%6s***%3s***%3s***%5s***%5s**\r\n", "******", "****", "******", "***", "******", "***", "***", "*****", "*****");
		System.out.printf("| %5s | %4s | %6s | %3s | %6s | %3s | %3s | %5s | %4s  |\r\n", "name", "java", "oracle", "jsp", "spring", "web", "js", "total", "avg");
		System.out.printf("==%6s===%4s===%6s===%3s===%6s===%3s===%3s===%5s===%5s==\r\n", "======", "====", "======", "===", "======", "===", "===", "=====", "=====");
		for(Class03 stud : score) {
			System.out.printf("| %3s | %3d  | %4d   | %3d | %4d   | %3d | %3d | %4d  | %5.2f |\r\n", stud.getName(), stud.getJava(), stud.getOracle(), stud.getJsp(), stud.getSpring(), stud.getWeb(), stud.getJs(), stud.getTotal(), stud.getAvg());
			System.out.printf("--%6s---%4s---%6s---%3s---%6s---%3s---%3s---%5s---%5s--\r\n", "------", "----", "------", "---", "------", "---", "---", "-----", "-----");
		}
		System.out.printf("**%6s***%4s***%6s***%3s***%6s***%3s***%3s***%5s***%5s**\r\n", "******", "****", "******", "***", "******", "***", "***", "*****", "*****");
	}
	
	public static void main(String[] args) {
		new HW01();
	}

}
