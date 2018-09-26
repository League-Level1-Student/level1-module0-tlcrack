import java.util.Random;

import javax.swing.JOptionPane;

public class Methods2 {
public static void main(String[] args) {
	String freind = JOptionPane.showInputDialog("Who are you?");
	 whichPresent(freind);
	 
	 String food = JOptionPane.showInputDialog("Do pigs eat bannanas?");
	doPigsEat(food);
	
	int thingie = getMyLuckyNumber();
	JOptionPane.showMessageDialog(null, "Your lucky number is " + thingie);


int mom3 = eggsMomWants();
int dad3 = eggsDadWants();
int b3 = eggsBabyWants();
int eggs = 0;
eggs += mom3;
eggs += dad3;
eggs += b3;
JOptionPane.showMessageDialog(null, "I'll go get " + eggs + " eggs.");
int age = 11;
age = getAverageHeight(age);
JOptionPane.showMessageDialog(null, "You're probably " + age + " inches tall.");

}

static String whichPresent(String friendName) {
if(friendName.equalsIgnoreCase("Ian")) {
	System.out.println("I bet you want thingamabobbers!");
}
if(friendName.equalsIgnoreCase("Peter")) {
	System.out.println("I bet you want levers to keep you triggered!");
}
return friendName;
	}


static boolean doPigsEat(String food) {

    if(food.equalsIgnoreCase("yes")) {

           return true;
}
           else {return false;}

}

static int getMyLuckyNumber() {
Random r = new Random();
int i = r.nextInt(100);
return i;


}

static int eggsMomWants() {

String mom1 = JOptionPane.showInputDialog("How many eggs does mom want?");
int mom2 = Integer.parseInt(mom1);
return mom2;
}



static int eggsDadWants() {
	String dad1 = JOptionPane.showInputDialog("How many eggs does dad want?");
int dad2 = Integer.parseInt(dad1);
return dad2;
}



static int eggsBabyWants() {
String b1 = JOptionPane.showInputDialog("How many eggs does baby want?");
int b2 = Integer.parseInt(b1);
return b2;
}

static int getAverageHeight(int age) {

    if (age > 100) {

          age = 66;

    } 

    if (age > 50) {

           age = 72;

    }

    if (age < 11) {

           age = 60;

    }
	return age;
}

}
