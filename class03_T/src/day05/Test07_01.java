package day05;

public class Test07_01 {
/*
 * 알파벳 'A' ~ 'Z' 출력하는데
 * 	'I', 'L', 'O' 는 소문자로 출력하세요. 
 */
	public static void main(String[] args) {
		char ch ;
		
		for(int i = 'A'; i < 'Z' + 1 ; i++) {
			ch = (char) i;
			
			switch (ch){
			case 'I':
				ch = 'i';
				break;
			case 'L':
				ch = 'l';
				break;
			case 'O':
				ch = 'o';
				break;
			}
			/*
			if(ch == 'I') {
				
			} else if(ch == 'L') {
				
			} else if(ch == 'O') {
				
			} else {}
			
			*/
			if(ch == 'Z') {
				System.out.print(ch);
			} else {
				System.out.print(ch + ", ");
			}
		}
	}

}
