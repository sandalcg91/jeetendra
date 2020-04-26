
// Method OverRiding 

class Shape
{
	float area()
	{
		return 0;
	}
	
}
class Circle extends Shape
{
	float pi = 3.14f;
	float area;
	int radius = 2;
	float area()
	{
		area = pi*radius*radius;
		System.out.println("Area of the Circle : " +area);
	return area;
	}
}
class Rectangle extends Shape
{
	float area;
	int length = 3;
	int width = 4;
	float area()
	{
		area = length*width;
		System.out.println("Area of Rectangle : " +area);
	return area;
	}
}
class Triangle extends Shape
{
	float area;
	int height = 2;
	int base = 4;
	float area()
	{
		area = 0.5*height*base;
		System.out.println("Area of Triangle : " +area);
	return area;
	}
}
class TestShape1
{
	public static void main(String[] args)
	{
		Shape s = new Circle();
		s.area();
		
		s = new Rectangle();
		s.area();
		
		s = new Triangle();
		s.area();
	}
}