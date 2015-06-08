import java.util.*;

public class HorseRace{
	public static void main(String[]args){
		int distance;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Distance (30 or greater): ");
		distance = scan.nextInt();
		while (distance<10){
			System.out.print("Enter Distance (30 or greater): ");
			distance = scan.nextInt();
		}
		System.out.println();
		ArrayList<Integer> time = new ArrayList<Integer>();
		for(int d=0; d<5; d++){
			time.add((int)(Math.random()*10)+1);
			//time.add(8);
		}
		int max = Collections.max(time);
		Horse h1 = new Horse("Red Horse","grrr",time.get(0),distance);
		Horse h2 = new Horse("Mucho Horse","boomboom",time.get(1),distance);
		Horse h3 = new Horse("Sea Horse","plop plop",time.get(2),distance);
		Horse h4 = new Horse("Beki Horse","keeeriii",time.get(3),distance);
		Horse h5 = new Horse("Petrang Horse","mehehehe",time.get(4),distance);
		Alert alert = new Alert();
		
		alert.start();
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();	
	}
}