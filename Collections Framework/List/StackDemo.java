import java.util.*;
public class StackDemo
{
	public static void main(String[] args)
	{
		Stack s = new Stack();
		System.out.println(s.empty()); //  true
		s.push("A");
		s.push("B");
		s.push("V");
		s.push("D");
		s.push(10);
		System.out.println(s); // [A, B, V, D, 10]

		s.pop();
		System.out.println(s); // [A, B, V, D]

		
		System.out.println(s.peek()); // D 
		
		System.out.println(s.search("A")); //  4
		System.out.println(s.search("V")); //  2
		System.out.println(s.search("H")); // -1
		System.out.println(s.search("C")); // -1
		
		System.out.println(s.empty()); // false
	}
}
/*
offset successful - 4
offset unsuccessful -  -1
1 | D |
2 | V |
3 | B |
4 | A |
 
*/