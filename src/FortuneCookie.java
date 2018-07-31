import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();




}
public void showButton() {
	JFrame frame = new JFrame();
    System.out.println("Button clicked");
frame.setVisible(true);
frame.setSize(100, 100);
JButton button = new JButton();
frame.add(button);
button.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	int i = new Random().nextInt(5);
	if(i==0) {
		JOptionPane.showMessageDialog(null, "you will die in agony");
	}

	else if(i==1) {
		JOptionPane.showMessageDialog(null, "nature will slap you in the face using something very disturbing");
	}
	else if(i==2) {
		JOptionPane.showMessageDialog(null, "your food will cause explosive diarrhea");
	}
	else if(i==3) {
		JOptionPane.showMessageDialog(null, "you will be forced to eat others' dust and/or excrement");
	}
	else if(i==4) {
		JOptionPane.showMessageDialog(null, "Bugs are annoying. especially the huge one soon to give a painful kiss(aka: a bite)");
	}

}


}
