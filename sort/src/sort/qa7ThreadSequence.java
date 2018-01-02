
public class qa7ThreadSequence implements Runnable {
	
		String name;
		public qa7ThreadSequence(String name){
			this.name=name;
		}
	public void run(){
		
		for(int i=1;i<=5;i++){
			System.out.println(name+" thread completes "+i+"km");
		}
		
	}
		public static void main(String[] args) {
			qa7ThreadSequence ob1=new qa7ThreadSequence("t1");
			qa7ThreadSequence ob2=new qa7ThreadSequence("t2");
			Thread t1=new Thread(ob1);
			Thread t2=new Thread(ob2);
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("two thread exeution completed");
			

		}

	}



