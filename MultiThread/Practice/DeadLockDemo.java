class A
{
	public synchronized void foo(B b)
	{
		System.out.println("THread1 starts execution foo");
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("Thread1 trying to catch b's last()");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A this is last()");
	}
}
class B
{
	public synchronized void bar(A a)
	{
		System.out.println("Thread2 starts bar");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
		System.out.println("Thread2 trying to call a's last()");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B this is last");
	}
}
class DeadLockDemo extends Thread
{
	A a = new A();
	B b = new B();
	
/*	DeadLockDemo()
	{
		this.start();
		a.foo(b); // executing by main Thread
	}
*/
	public void m()
	{
		this.start();
		a.foo(b); // executing by main Thread
	}
	public void run()
	{
		b.bar(a); // executing by child Thread
	}
	public static void main(String[] args)
	{
		DeadLockDemo d = new DeadLockDemo();
		d.m();
	}
}