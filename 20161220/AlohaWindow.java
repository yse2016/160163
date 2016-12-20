	import java.awt.*;
	import javax.swing.*;

	public class AlohaWindow {
		public static void main(String[] args) {
			JFrame frame = new JFrame();
			frame.setSize(400,200);
			frame.setTitle("アイ");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout( new FlowLayout() );
			JLabel label = new JLabel("HELLO");
			Container ctnr = frame.getContentPane();
			ctnr.add(label);
			JButton button = new JButton("Click Me!");
			Container ctnr2 = frame.getContentPane();
			ctnr2.add(button);
			frame.setVisible(true);
		}
	}