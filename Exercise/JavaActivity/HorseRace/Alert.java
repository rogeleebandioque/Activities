public class Alert extends Thread{
	static Message mes = new Message();

	public void run(){
		mes.notifyAll();
	}

}