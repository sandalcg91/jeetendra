import java.util.*;
class PriorityQueueDemo
{
	public static void main(String[] args)
	{
		PriorityQueue q = new PriorityQueue();
		System.out.println(q.peek()); // null
	//	System.out.println(q.element()); // NSTOE
		for(int i=0; i<=10; i++)
		{
			q.offer(i);
		}
		System.out.println(q); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(q.poll()); // 0 remove also
		System.out.println(q); // [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]
		
		System.out.println(q.element()); // 1
		
		System.out.println(q.remove()); // 1 remove head
		System.out.println(q); // [2, 3, 5, 7, 4, 9, 6, 10, 8]
		
		System.out.println(q.peek()); // 2
		
	//	System.out.println(q.offer(null)); // NPE*/
	}
}