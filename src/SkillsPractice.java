import java.util.Random;

import javax.swing.JOptionPane;

public class SkillsPractice {
public static void main(String[] args) {

SkillsPractice skills = new SkillsPractice();
          	//skills.skill1();
          	//skills.skill2();
          //	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("how many dimes do you have");

// Tell them how many cents they have (hint multiply by 10)
String cents = JOptionPane.showInputDialog("how many cents do you have");



// Ask the user how tall they are (inches)
String inches = JOptionPane.showInputDialog("how many inches tall are you");



// If they are shorter than 36 inches, tell them to eat their Wheaties
int inch = Integer.parseInt(inches);
if(inch<36) {
	JOptionPane.showMessageDialog(null, "eat your Weaties");
}
}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for (int i = 1; i <= 30; i=i+3) {
	System.out.println(i);
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console
	Random gen = new Random();
	int randl = gen.nextInt(20);
	System.out.println(randl);
// Get another random number that is less than 10 and print it to the console 
int randl1 = gen.nextInt(10);
System.out.println(randl1);
// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, "the difference between your number is"+randl + "-" +randl1 + "=" +(randl - randl1));


}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("what city do you live in?");


// If they answered "San Diego", tell them they live in Americ's Finest City 
if(city.equals("San Diego"))
JOptionPane.showMessageDialog(null, "you live in the finest city");

// Otherwise, tell them to move to San Diego 
else {
	JOptionPane.showMessageDialog(null, "move to San Diego");
}


// Create a variable - cars - and initialize it to the number of cars your family has. 

int cars = 3;
// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
if(cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
}

// If there is 1 car, use a pop-up to display the make/model of the car 
else if(cars == 1) {
	JOptionPane.showMessageDialog(null, "forward focus");
}
	
	
// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
else if(cars > 1) {
	JOptionPane.showMessageDialog(null, "your cars have"+ cars*4+"wheels");
}

}

void skill5() { // In a pop-up, ask the user for the name of their school 



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 

}
}

