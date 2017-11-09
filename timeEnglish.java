import java.util.Scanner;
public class timeEnglish {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour;
		do{
			System.out.print("Enter hour(between 1 and 12):");
			hour = in.nextInt();
		}while(hour>12||hour<0);
		System.out.print("Enter minutes:");
		int min = in.nextInt();
		System.out.println(getTimeName(hour,min));
	}
	public static String getTimeName(int hours, int minutes){
		String timeName="";
		String hourName;
		if(minutes >= 60){
			hours++;
			minutes -= 60;
		}
		if(hours == 1) hourName = "one";
		else if(hours == 2) hourName = "two";
		else if(hours == 3) hourName = "three";
		else if(hours == 4) hourName = "four";
		else if(hours == 5) hourName = "five";
		else if(hours == 6) hourName = "six";
		else if(hours == 7) hourName = "seven";
		else if(hours == 8) hourName = "eight";
		else if(hours == 9) hourName = "nine";
		else if(hours == 10) hourName = "ten";
		else if(hours == 11) hourName = "eleven";
		else hourName = "twelve";
		if(minutes==0)timeName = hourName+" o'clock";
		else if(minutes==30)timeName = "half past "+hourName;
		else if(minutes==45)timeName = "a quarter to "+hourName;
		else timeName = minutes+" minutes past "+hourName;
		return timeName;
	}

}
