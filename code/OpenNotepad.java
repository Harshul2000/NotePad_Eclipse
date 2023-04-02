import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class OpenNotepad extends JFrame implements ActionListener {

	// constructor
	OpenNotepad() {

		setBounds(200, 100, 700, 500);

		JButton b1 = new JButton("Notepad");
		b1.setBounds(300, 200, 100, 30);
		b1.addActionListener(this);

		add(b1);

		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {

		new OpenNotepad();// object
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			Runtime.getRuntime().exec("Notepad");
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}

	}

}