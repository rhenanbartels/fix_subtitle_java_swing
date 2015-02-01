import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Insets;
import java.io.File;

public class FixSubtitle extends JFrame {
	private static JFrame gui;
	private static JButton load;
	private static JButton fix;
	private static JTextField fileName;
	private static JTextField offset;
	private static JLabel nameLabel;
	private static JLabel offsetLabel;
	
	public static void main(String[] args){
		gui = new JFrame();
		
		//Fix button.
		fix = new JButton("Fix");
		fix.setLayout(null);		
		fix.setSize(60, 20);
		fix.setLocation(135, 90);
		fix.setEnabled(false);
		gui.add(fix);
		
		//Fix button.
		load = new JButton();
		//Get icon image path
		String absolutePath = new File("src").getAbsolutePath();
		System.out.println(absolutePath + File.separator + "text70.png");
		load.setIcon(new ImageIcon(absolutePath + File.separator + "text70.png"));
		load.setLayout(null);
		load.setMargin(new Insets(0, 0, 0, 0));
		load.setBorder(null);		
		load.setSize(20, 20);
		load.setLocation(295, 12);
		gui.add(load);
		
		//File Name JLabel.
		nameLabel = new JLabel("File Name:");
		nameLabel.setLayout(null);
		nameLabel.setSize(80, 10);
		nameLabel.setLocation(8, 15);
		gui.add(nameLabel);
		
		//Offset JLabel.
		offsetLabel = new JLabel("Offset:");
		offsetLabel.setLayout(null);
		offsetLabel.setSize(60, 10);
		offsetLabel.setLocation(8, 52);
		gui.add(offsetLabel);
		
		//File Name JTextField.
		fileName = new JTextField();
		fileName.setLayout(null);
		fileName.setSize(200, 20);
		fileName.setLocation(90, 12);
		gui.add(fileName);
		
		//File Name JTextField.
		offset = new JTextField();
		offset.setLayout(null);
		offset.setSize(50, 20);
		offset.setLocation(90, 50);
		gui.add(offset);
		
		gui.setLayout(null);
		gui.setSize(350, 125);
		gui.setTitle("Fix Subtitle");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);
		
	}

}