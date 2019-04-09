package day16;

/*
			Score Å¬·¡½ºÀÇ ÇÑ»ç¶÷ÀÇ µ¥ÀÌÅÍ¸¦ ÀÔ·ÂÇÏ´Âµ¥
			ÀÔ·Â¹ÞÀ» ¶§ Á¤±Ô½Ä °Ë»ç¸¦ ÇØ¼­
			¹Ù¸¥°æ¿ì¸¸ ÀÔ·ÂÇÏ¼¼¿ä...
 */
import java.util.*;
import java.util.regex.*;
public class HW02 {
	Score score;
	Scanner sc;
	String[] item = {"name", "java", "oracle", "jsp", "spring", "web", "js"};
	public HW02() {
		// º¯¼öÁØºñ...
		score = new Score();
		sc = new Scanner(System.in);
		
		// ÀÔ·Â¹Þ°í 
		
		// Á¤±Ô½Ä °Ë»ç
		
		// µ¥ÀÌÅÍ ÀÔ·Â
		setData();
		
		// Ãâ·Â
		System.out.println(score);
		
	}
	
	// score¿¡ µ¥ÀÌÅÍ ÀÔ·ÂÇÏ´Â ÇÔ¼ö
	public void setData() {
		for(int i = 0 ; i < item.length ; i++ ) {
			
			while(true) {
				String str = (i == 0) ? str = "ÇÐ»ý ÀÌ¸§" : item[i] + " Á¡¼ö";
				System.out.print(str + " ÀÔ·Â : ");
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
	
	// Á¤±Ô½Ä °Ë»çÇÏ´Â ÇÔ¼ö
	public boolean testReg(String data, String arg) {
		boolean bool = false;
		String tmp = arg.equals("name") ? "^[°¡-ÆR]{2,10}$" : "^[1-9]{1}[0-9]{1,2}$";
		Pattern pat = Pattern.compile(tmp);
		Matcher mat = pat.matcher(data);
		return mat.matches();
	}
	
	public static void main(String[] args) {
		new HW02();
	}

}
