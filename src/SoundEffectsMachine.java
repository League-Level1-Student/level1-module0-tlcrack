import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton but1 = new JButton("boom boom");
	JButton but2 = new JButton("splash");
public static void main(String[] args) {
	SoundEffectsMachine sem = new SoundEffectsMachine();
	sem.button1();
	sem.button2();
	sem.frame.pack();
	
}
public void button1() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(150, 150);
	panel.add(but1);
	but1.addActionListener(this);
	
	
}

public void button2() {
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(150, 150);
	 panel.add(but2);
	 frame.add(panel);
	but2.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==but1) {
			playSound("blasts.wav");
	}
	if(e.getSource()==but2) {
		playSound("splash.wav");
}
	
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}


}
