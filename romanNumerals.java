import java.util.Scanner;
public class romanNumerals {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = in.nextInt();
		String romanNum;
		if(n==10)romanNum = "X";
		else if(n==100)romanNum = "C";
		else romanNum=romanDigit(n%10,"I","V","X");
		if(n>10&&n<100){
			n=n/10;
			romanNum=romanDigit(n%10,"X","L","C")+romanNum;
		}
		System.out.println(romanNum);
	}
	public static String romanDigit(int n, String one, String five, String ten){
		String romanDigit="";
		if(n==9)return one+ten;
		if(n>=5){
			romanDigit+=five;
			for(int i=0;i<n-5;i++) romanDigit+=one;
		}else if(n==4){
			romanDigit=one+five;
		}else{
			for(int i=0;i<n;i++)romanDigit+=one;
		}
		return romanDigit;
	}

}
