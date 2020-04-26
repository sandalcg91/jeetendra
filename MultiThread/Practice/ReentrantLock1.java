import java.util.concurrent.locks.*;
class ReentrantLock1
{
	public static void main(String[] args)
	{
		ReentrantLock rl = new ReentrantLock();
		rl.lock();
		rl.lock();
		System.out.println(rl.isLocked());  // true
		System.out.println(rl.isHeldByCurrentThread());  // true
		System.out.println(rl.getQueueLength()); // 0
		System.out.println(rl.getHoldCount()); // 2
		
		rl.unlock();
		System.out.println(rl.getHoldCount()); // 1
		System.out.println(rl.isLocked());  // true
		
		rl.unlock();
		System.out.println(rl.isLocked()); // false
		System.out.println(rl.isFair());  // false
	}
}