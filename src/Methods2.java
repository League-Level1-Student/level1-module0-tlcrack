import javax.swing.JOptionPane;

public class Methods2 {
public static void main(String[] args) {
	String freind = JOptionPane.showInputDialog("Who are you?");
	
	 whichPresent(freind);
}

static String whichPresent(String friendName) {
if(friendName.equals("Ian")) {
	System.out.println("I bet you want thingamabobbers!");
}
if(friendName.equals("Peter")) {
	System.out.println("I bet you want levers to keep you triggered!");
}
return friendName;
	}
}
