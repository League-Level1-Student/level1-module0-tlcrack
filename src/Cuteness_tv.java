import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_tv implements ActionListener {
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JButton but1 = new JButton();
	JButton but2 = new JButton();
	JButton but3 = new JButton();
public static void main(String[] args) {
	
	Cuteness_tv ctv = new Cuteness_tv();
	ctv.setframe();
	ctv.button1();
	ctv.button2();
	ctv.button3();
	
}
public void setframe(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(150, 150);
	frame.add(pan);
}
public void button1() {
	
	
	but1.setText("duck");
	
	pan.add(but1);
	but1.addActionListener(this);
}
public void button2() {
	
	but2.setText("frog");
	pan.add(but2);
	but2.addActionListener(this);
}
public void button3() {
	
	but3.setText("unicorn");
	pan.add(but3);
	but3.addActionListener(this);
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==but1) {
		showDucks();
	}
	if(e.getSource()==but2) {
		showFrog();
	}
	if(e.getSource()==but3) {
		showFluffyUnicorns();
	}
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}

}
