package day14;

public class Test03 {

	public Test03() {
		
		MyWin[] win = new MyWin[5];
		for(int i = 0 ; i < 5 ; i++ ) {
			win[i] = new MyWin();
			win[i].setLocation((i % 3)*(i / 2) * 350, ((i / 2)+1) * 350);
		}
		
		int[] sec ={1, 2, 3, 4, 5};
		for(int i = 0 ; ; i++) {
			win[(i % 5)].panel.setBackground(new MyEvent().getColor());
			try {
				Thread.sleep(sec[(i % 5)] * 100);
			} catch (InterruptedException e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
