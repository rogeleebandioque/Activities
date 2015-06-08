public class Horse extends Thread{
	//public static Integer horsesIn = 0;
	static Message mes = new Message();
	private String sound;
	private int delay;
	private int time;
	private int distance;
	
	public Horse(String n, String s, Integer t, int dis){
		sound = s;
		time = t;
		distance = dis;
		this.setName(n);
	}

	public String getSound(){
		return sound;
	}

	public void run(){
		try{
			Horse.sleep(time*1000);		
			System.out.println(getName()+" is ready to start and has traveled "+ time + " second/s");
			mes.count++;			
			synchronized(mes){
				mes.wait();
				/*if(mes.count !=5){
					//System.out.println(getName() + " is waiting");
					mes.wait();	
				}else{
					Horse.sleep(1000);
					System.out.println("\n<ALL HORSES IN STARTING LINE>\n");
					for(int i=3; i>=1; i--){
						System.out.print(i+"!");
						Horse.sleep(1000);
					}
					System.out.println("GO\n");
					Horse.sleep(1000);
					mes.notifyAll();
				}*/
			}
			
			System.out.println(getName() + " Started at:" +System.currentTimeMillis() + "\n");		
			go();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

	public void go(){
		
		try{
			//Horse.sleep(1000);	
			int toTravel = distance;			
			do{
				int travel = (int)(Math.random()*10)+1;
				if(toTravel<travel){
					travel = toTravel; 
				}
				Horse.sleep(travel*1000);	
				toTravel = toTravel - travel;	
				System.out.println(getName() + " ran "+ travel +"m and have to travel " + toTravel + "m more");	

			}while(toTravel>0);
			//Horse.sleep(500);
			System.out.println("\n<<"+ getName() + " finished the race! : " + getSound()+">>\n");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

	
}


