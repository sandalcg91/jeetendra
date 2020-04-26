import java.util.concurrent.locks.*;
class ReenterantLock1
{
	public static void main(String[] args)
	{
		ReentrantLock rl = new ReentrantLock();
		rl.lock();
		rl.lock();
		System.out.println(rl.isLocked());
		System.out.println(rl.isHeldByCurrentThread());
		System.out.println(rl.getQueueLength());

		rl.unlock();
		System.out.println(rl.getHoldCount());
		System.out.println(rl.isLocked());
		
		rl.unlock();
		System.out.println(rl.isLocked());
		System.out.println(rl.isFair());
	}
}