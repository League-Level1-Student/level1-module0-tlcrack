import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener {
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JButton but1 = new JButton();
public static void main(String[] args) {
	Cuteness
	button1();
	
	
	
}
public void button1() {
	
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(150, 150);
	frame.setTitle("surprise");
	
	frame.add(but1);
	but1.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


}
