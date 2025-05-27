import javax.swing.*;
import java.awt.*;


public class JMenu1{
	public static void main(String[]args){
	JFrame frame = new JFrame("Java Compilation Menu");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
.
frame.setSize(600,700);

	JPanel panel = new JPanel();
	panel.setBackground(Color.GRAY);



	JMenuBar menu = new JMenuBar();

	JMenu file1 = new JMenu("File");
	JMenu file2 = new JMenu("About");
	JMenu file3 = new JMenu("Activities");

	JMenuItem open = new JMenuItem("Open");
	JMenuItem exit = new JMenuItem("Exit");
	JMenuItem Act1 = new JMenuItem("Activity 1");



	file1.add(open);
	file1.add(exit);
	file3.add(Act1);

	menu.add(file1);
	menu.add(file2);
	menu.add(file3);

	frame.add(panel);

	frame.setJMenuBar(menu);

	frame.setVisible(true);

	}

	}










