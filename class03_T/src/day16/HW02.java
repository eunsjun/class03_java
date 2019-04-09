package day16;

/*
			Score Ŭ������ �ѻ���� �����͸� �Է��ϴµ�
			�Է¹��� �� ���Խ� �˻縦 �ؼ�
			�ٸ���츸 �Է��ϼ���...
 */
import java.util.*;
import java.util.regex.*;
public class HW02 {
	Score score;
	Scanner sc;
	String[] item = {"name", "java", "oracle", "jsp", "spring", "web", "js"};
	public HW02() {
		// �����غ�...
		score = new Score();
		sc = new Scanner(System.in);
		
		// �Է¹ް� 
		
		// ���Խ� �˻�
		
		// ������ �Է�
		setData();
		
		// ���
		System.out.println(score);
		
	}
	
	// score�� ������ �Է��ϴ� �Լ�
	public void setData() {
		for(int i = 0 ; i < item.length ; i++ ) {
			
			while(true) {
				String str = (i == 0) ? str = "�л� �̸�" : item[i] + " ����";
				System.out.print(str + " �Է� : ");
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
	
	// ���Խ� �˻��ϴ� �Լ�
	public boolean testReg(String data, String arg) {
		boolean bool = false;
		String tmp = arg.equals("name") ? "^[��-�R]{2,10}$" : "^[1-9]{1}[0-9]{1,2}$";
		Pattern pat = Pattern.compile(tmp);
		Matcher mat = pat.matcher(data);
		return mat.matches();
	}
	
	public static void main(String[] args) {
		new HW02();
	}

}
