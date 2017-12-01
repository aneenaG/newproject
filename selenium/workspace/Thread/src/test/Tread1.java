package test;
class Mclass extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getId()+"value"+i);
			
	     }
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}
}

public class Tread1 {

	public static void main(String[] args) {
		Mclass myclass=new Mclass();
		myclass.start();
		Mclass myclass1=new Mclass();
		myclass1.start();
		
	}

}
