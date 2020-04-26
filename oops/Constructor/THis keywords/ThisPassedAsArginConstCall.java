
// this keyword can be passed as argument in the constructor call

class ConstructCall
{
	ThisPassedAsArginConstCall obj;   //  class type variable
	
	ConstructCall(ThisPassedAsArginConstCall obj)
	{
		this.obj = obj;
	}
	void display()
	{
		System.out.println(obj.data);
	}
}

class ThisPassedAsArginConstCall
{
	int data = 10;
	ThisPassedAsArginConstCall()
	{
		ConstructCall cc = new ConstructCall(this);
		cc.display();
	}
	public static void main(String[] args)
	{
		ThisPassedAsArginConstCall pscc = new ThisPassedAsArginConstCall();
	}
}

// output : 10
