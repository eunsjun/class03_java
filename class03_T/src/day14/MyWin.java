package day14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyWin extends JFrame{
	JButton btn;
	JPanel panel;
	public MyWin() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBackground(Color.BLUE);
		btn = new JButton("Click Me!");
		
		// ��ư�� �̺�Ʈ �ֱ�
		
		btn.addActionListener(new ActionListener() {
			// ���� ���� Ŭ����
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.ORANGE);
			}
		});
		/*
		 * btn.addActionListener(new MyEvent(this));
		 */
		 /* 
		   btn.addActionListener(new btnEvent());
		 */		
		
		// �����쿡 ��ư�� �ǳ� �ֱ�
		this.add(btn, "South");
		this.add(panel, "Center");
		setSize(300, 300);
		this.setResizable(false);
		setVisible(true);
	}

	/*
	 * public static void main(String[] args) { new MyWin(); }
	 */
	class btnEvent implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			panel.setBackground(Color.ORANGE);
		}
		
	}

}


class MyEvent implements ActionListener{
	MyWin win;
	
	public MyEvent() {
		
	}
	public MyEvent(MyWin win) {
		this.win = win;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		win.panel.setBackground(getColor());
	}
	
	public Color getColor() {
		int red = (int)(Math.random()*256);
		int blue = (int)(Math.random()*256);
		int green = (int)(Math.random()*256);
		
		return new Color(red, green, blue);
	}
}