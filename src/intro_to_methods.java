import javax.swing.JOptionPane;

public class intro_to_methods {
public static void main(String[] args) {
String Bob = "Tate";
	String name1 = "Tate";
	String name2 = "Ian";
	String echo = "Tate's great!";
	String word = "Duuuude! ";
	int num = 7;
	String theBest = "Tate";
	int num1 = 234;
	int num2 = 649;
weRock();
	rocker(Bob);
	truth( name1, name2);
	echo(echo);
	repeat(word,num);
	GetTheBest(theBest);
	sum(num1,num2);
	givenNumber();
}
static void weRock(){
System.out.println("The League Rocks");
}
static void rocker(String name) {
	System.out.println(name + " rocks");
}
static void truth(String eds, String kh){
	if(eds.equals("Tate")) {
		System.out.println(eds + " is awesome!");
	}
	if(kh.equals("Ian")) {
		System.out.println(kh + " is sir sucks a lot!");
	}
}
static void echo(String repeat){
	System.out.println(repeat + repeat);
}

static void repeat(String word, int num) {
	for(int i = 0; i<num;i++) {
System.out.println(word);	}
}
static void GetTheBest(String Best) {
	System.out.println(Best);
}
static void sum(int num1, int num2) {
int sum = add(num1,num2);
System.out.println(sum);
}
private static int add(int num1, int num2) {
	// TODO Auto-generated method stub
	return num1 + num2;
}
static void givenNumber() {
	String oddOrNot = JOptionPane.showInputDialog("integer, please.");
int in = Integer.parseInt(oddOrNot);
if(in%2==0) {
	System.out.println("It is even!");
}
else {
	System.out.println("It is odd!");
}
}

}
