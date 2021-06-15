package arrays3;
import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of players:");
		int n=in.nextInt();
		String y;
		players []score=new players[n+1];
		String e=in.nextLine();
		for(int i=0;i<n;i++) {
			y="yes";
			score[i]=new players();
			System.out.println("Enter the name of player "+(i+1)+":");
			score[i].name=in.nextLine();
			while(y.equalsIgnoreCase("yes")) {
				System.out.println("Enter 'o' for 1s | 't' for 2s | 'th' for 3s | 'f' for 4s | 'fi' for 5s | 's' for 6s");
				String r=in.nextLine();
				switch(r) {
				case "o":
					System.out.print("Enter the number of 1s:");
					score[i].ones=in.nextInt();	
					score[i].rank+=score[i].ones*1;
					break;
				case "t":
					System.out.print("Enter the number of 2s:");
					score[i].twos=in.nextInt();
					score[i].rank+=score[i].twos*2;
					break;
				case "th":
					System.out.print("Enter the number of 3s:");
					score[i].threes=in.nextInt();
					score[i].rank+=score[i].threes*3;
					break;
				case "f":
					System.out.print("Enter the number of 4s:");
					score[i].fours=in.nextInt();
					score[i].rank+=score[i].fours*4;
					break;
				case "fi":
					System.out.print("Enter the number of 5s:");
					score[i].fives=in.nextInt();
					score[i].rank+=score[i].fives*5;
					break;
				case "s":
					System.out.print("Enter the number of 6s:");
					score[i].sixes=in.nextInt();
					score[i].rank+=score[i].sixes*6;
					break;
				}
				String u=in.nextLine();
				System.out.println("Would you like enter more runs?\nEnter 'yes' or 'no'");
				y=in.nextLine();
			}
		}
		int t1,t2,t3,t4,t5,t6,tr;
		String tn;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(score[i].rank<score[j].rank) {
					tn=score[i].name;
					tr=score[i].rank;
					t1=score[i].ones;
					t2=score[i].twos;
					t3=score[i].threes;
					t4=score[i].fours;
					t5=score[i].fives;
					t6=score[i].sixes;
					score[i].name=score[j].name;
					score[i].ones=score[j].ones;
					score[i].twos=score[j].twos;
					score[i].threes=score[j].threes;
					score[i].fours=score[j].fours;
					score[i].fives=score[j].fives;
					score[i].sixes=score[j].sixes;
					score[i].rank=score[j].rank;
					score[j].name=tn;
					score[j].ones=t1;
					score[j].twos=t2;
					score[j].threes=t3;
					score[j].fours=t4;
					score[j].fives=t5;
					score[j].sixes=t6;
					score[j].rank=tr;
				}
			}
		}
		players[]top_5=new players[5];
		for(int i=0;i<5;i++) {
			top_5[i]=new players();
			top_5[i].name=score[i].name;
			top_5[i].rank=score[i].rank;
		}
		
		//insert a player
		y="yes";
		System.out.println("Please enter the new player's details.\nPlayer's name:");
		e=in.nextLine();
		score[n].name=in.nextLine();
		while(y.equalsIgnoreCase("yes")) {
			System.out.println("Enter 'o' for 1s | 't' for 2s | 'th' for 3s | 'f' for 4s | 'fi' for 5s | 's' for 6s");
			String r=in.nextLine();
			switch(r) {
			case "o":
				System.out.print("Enter the number of 1s:");
				score[n].ones=in.nextInt();	
				score[n].rank+=score[n].ones*1;
				break;
			case "t":
				System.out.print("Enter the number of 2s:");
				score[n].twos=in.nextInt();
				score[n].rank+=score[n].twos*2;
				break;
			case "th":
				System.out.print("Enter the number of 3s:");
				score[n].threes=in.nextInt();
				score[n].rank+=score[n].threes*3;
				break;
			case "f":
				System.out.print("Enter the number of 4s:");
				score[n].fours=in.nextInt();
				score[n].rank+=score[n].fours*4;
				break;
			case "fi":
				System.out.print("Enter the number of 5s:");
				score[n].fives=in.nextInt();
				score[n].rank+=score[n].fives*5;
				break;
			case "s":
				System.out.print("Enter the number of 6s:");
				score[n].sixes=in.nextInt();
				score[n].rank+=score[n].sixes*6;
				break;
			}
			String u=in.nextLine();
			System.out.println("Would you like enter more runs?\nEnter 'yes' or 'no'");
			y=in.nextLine();
		}
		
		//display scorecard
		
		for(int i=0;i<5;i++) {
			System.out.println("__________________________________________");
			System.out.println("|"+top_5[i].name+"\t|"+top_5[i].rank+"\t|");
			System.out.println("__________________________________________");
		}
		
		//delete player
		
		
		in.close();
	}

}

class players{
	String name;
	int ones;
	int twos;
	int threes;
	int fours;
	int fives;
	int sixes;
	int rank;
	
}

