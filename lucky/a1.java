/*
アイ　ウェンビン
160163
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class a1{
	public static void main(String[] args) {
		Iontman man = new Iontman();
	}
}

class Iontman implements ActionListener{
	ImageIcon img;
	ImageIcon img2;
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	JButton button2;
	int num = 0;

		public Iontman(){
			frame = new JFrame("Iontman");
			frame.setLocation(400, 400);
			frame.setSize(1200,800);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			img = new ImageIcon("11534113_815865.jpg");
			img2 = new ImageIcon("ting.JPG");
			label = new JLabel(img);
			panel = new JPanel();
			button = new JButton("ClickMe!");
			button.addActionListener(this);

			panel.add(label);
			panel.add(button);
			frame.add(panel);

			frame.setVisible(true);
		}
		public void actionPerformed(ActionEvent e){
			if(num%2==0){
				label.setIcon(img2);
			} else {
				label.setIcon(img);
			}
			num++;
		}
	}