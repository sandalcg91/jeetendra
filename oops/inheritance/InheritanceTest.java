
// Is-a Relationship or Inheritance

class Shape
{
	String color;
	int length;
	int width;
	
	public void setColor()
	{
		color = "red";
	}
	public void getColor()
	{
		System.out.println(color);
	}
	public void setLength()
	{
		length = 10;
	}
	public void getLength()
	{
		System.out.println(length);
	}
	public void setWidth()
	{
		width = 20;
	}
	public void getWidth()
	{
		System.out.println(width);
	}
}
class Circle extends Shape
{
	float area;
	float pi = 3.14f;
	float r;
	
	public void setRadius()
	{
		r = 2f;
	}
	public void getRadius()
	{
		System.out.println(r);
	}

	public void setArea()
	{
		area = pi*r*r;
	}
	public void getArea()
	{
		System.out.println(area);
	}
}
class Ractangle extends Shape
{
	float area;
	
	public void setArea()
	{
		area = length*wigth;
	}
	public void getArea()
	{
		System.out.println(area);
	}
}
	
class InheritanceTest
{
	public static void main(String[] args)
	{
		Circle cr = new Circle();
		cr.setColor();
		cr.getColor();
		cr.setLength();
		cr.getLength();
		cr.setWidth();
		cr.getWidth();
		cr.setRadius();
		cr.getRadius();
		cr.setArea();
		cr.getArea();
	
		System.out.println("-------------------------");

		Shape sp = new Circle();
		sp.setColor();
		sp.getColor();
		sp.setWidth();
		sp.getWidth();
		
		//Circle cr2 = new Shape();         //we can not converted shape to circle
		//cr2.getArea();
	}
}