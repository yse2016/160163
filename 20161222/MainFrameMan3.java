import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan3{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();
	}
}
class FrameMan implements ActionListener{
	JFrame frame;
	JPanel panel;
	JLabel label;
	//ImageIcon icon;
	JButton button;
	public FrameMan(){
		//System.out.println("ALOHA2!");
		openWindow();
	}
	private void openWindow(){
		frame = new JFrame();
		frame.setLocation(200,200);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		//label = new JLabel("ALOHA!");
		label = new JLabel("Happy new year!");
		button = new JButton("ClickMe!");
		button.addActionListener(this);

		panel.add(label);
		panel.add(button);
		frame.add(panel);

		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		label.setText("hello!");
	}
}