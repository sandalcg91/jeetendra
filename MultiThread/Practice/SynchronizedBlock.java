class Disp{
	public void wish(){
		System.out.print("Hello 1 ");
		System.out.print("Hello 2 ");
		System.out.print("Hello 3 ");
		System.out.println();
		synchronized(this){
			for(int i=0; i<10; i++){
				System.out.print(i);
				try{
					Thread.sleep(2000);
				}catch(InterruptedException e)
				{}
			}
		}
		System.out.println();
		System.out.print("Hi 1 ");
		System.out.print("Hi 2 ");
		System.out.print("Hi 3 ");
		System.out.println();
	}
}
class ThreadSB extends Thread{
	Disp d;
	ThreadSB(Disp d){
		this.d = d;
	}
	public void run(){
		d.wish();
	}
}
class SynchronizedBlock{
	public static void main(String[] args){
		Disp d1 = new Disp();
		Disp d2 = new Disp();
		
		ThreadSB t1 = new ThreadSB(d1);
		ThreadSB t2 = new ThreadSB(d1);
	//	ThreadSB t3 = new ThreadSB(d2);
		
		t1.start();
		t2.start();
	//	t3.start();
	}
}