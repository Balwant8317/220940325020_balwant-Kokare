class Shape
{
	
	void draw(){
		System.out.println("Drawing shape");
		
	}
	void erase(){
		System.out.println("Shape erase()");
	}
	
}

class Circle extends Shape
{
	
	void draw(){
		System.out.println("circle draw");
	}
	void erase(){
		System.out.println("circle erase");
	}
	
}

class Triangle extends Shape
{
	
	void draw(){
		System.out.println("triangle draw");
		
	}
	void erase(){
		System.out.println("triangle erase()");
	}
	
}

class Square extends Shape
{
	
	void draw(){
		System.out.println("Square draw");
		
	}
	void erase(){
		System.out.println("Square erase()");
	}
}

public class Solution

{
	public static void main(String args[])
	{
		Shape c= new Circle();
		Shape t= new Triangle();
		Shape s= new Square();
		
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();
		
	}
}