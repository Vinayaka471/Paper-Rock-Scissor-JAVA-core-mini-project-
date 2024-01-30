package sample1.java;
import java.util.Random;
import java.util.Scanner;

public class PRS {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("*******************************************");
	System.out.println("*   Rock Paper Scissor   *");
	System.out.println("*******************************************");
	int a=10;
	int h=0;
	int A=0;
	int no=0;
	while(a>0) {
		display();
		System.out.println("Enter your option");
		String c=s.next();
		Random r=new Random(); 
		if(no>5) {
			System.out.println("Final Score:");
			System.out.println("Human:"+h+" |AI:"+A);
			System.exit(0);
		}
		if(c.equals("R")) {
			int comp=10+r.nextInt(3)+1;
			if(comp==11) {
				System.out.println("You: Rock");
				System.out.println("AI: Rock");
				System.out.println("Game is draw");
				no=no+1;
				h=h+1;
				A=A+1;
				System.out.println("Human:"+h+" |AI:"+A);
				
			}
			if(comp==12) {
				System.out.println("You: Rock");
				System.out.println("AI: Paper");
				System.out.println("A is win ");
				no=no+1;
				h=h+0;
				A=A+1;
				System.out.println("Human:"+h+" |AI:"+A);
			}
			if(comp==13) {
				System.out.println("You: Rock");
				System.out.println("AI: Scisor");
				System.out.println("h is Win");
				no=no+1;
				h=h+1;
				A=A+0;
				System.out.println("Human:"+h+" |AI:"+A);
			}
			
		}
		if(c.equals("P")) {
			
			int comp=20+r.nextInt(3)+1;
			if(comp==21) {
				System.out.println("You: Paper");
				System.out.println("AI: Rock");
				System.out.println("You is Win");
				no=no+1;
				h=h+1;
				A=A+0;
				System.out.println("Human:"+h+" |AI:"+A);
				
			}
			if(comp==22) {
				System.out.println("You: Paper");
				System.out.println("AI: Scissor");
				System.out.println("AI is win ");
				no=no+1;
				h=h+0;
				A=A+1;
				System.out.println("Human:"+h+" |AI:"+A);
			}
			if(comp==23) {
				System.out.println("You: Paper");
				System.out.println("AI: paper");
				System.out.println("game is draw");
				no=no+1;
				h=h+1;
				A=A+1;
				System.out.println("Human:"+h+" |AI:"+A);
			}
			
		}
		if(c.equals("S")) {
			
			int comp=30+r.nextInt(3)+1;
			if(comp==31) {
				System.out.println("You: Scissor");
				System.out.println("AI: Scissor");
				System.out.println("game is draw");
				no=no+1;
				h=h+1;
				A=A+1;
				System.out.println("Human:"+h+" |AI:"+A);
				
			}
			if(comp==32) {
				System.out.println("You: Scissor");
				System.out.println("AI: Paper");
				System.out.println("you is win ");
				no=no+1;
				h=h+1;
				A=A+0;
				System.out.println("Human:"+h+" |AI:"+A);
				
			}
			if(comp==33) {
				System.out.println("You: Scissor");
				System.out.println("AI: Rock");
				System.out.println("AI is win");
				no=no+1;
				h=h+0;
				A=A+1;
				System.out.println("Human:"+h+" |AI:"+A);
			}
			
		}
		
		
	}
	
}
public static void display() {
	System.out.println("1. Rock:R");
	System.out.println("2. Paper:P");
	System.out.println("3. Scissor:S");
	System.out.println("________________________________________________________");
}
}