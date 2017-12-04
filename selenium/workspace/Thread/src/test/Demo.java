package test;
class Myclass implements Runnable{

	@Override
	public void run() {
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
	

public class Demo {

	public static void main(String[] args) {

		Thread t1=new Thread(new Myclass());
		Thread t2=new Thread(new Myclass());
		t1.start();
		t2.start();

	}

}
