class GrandParent
{
	String i="Ajoba";
	public void Print()
	{
		System.out.println("GrandParent name");
	}
	
}

class Parent extends GrandParent

{
	String j="papa";
	public void Print()
	{
		super.Print();
		System.out.println("Parent name");
	}
	
	
}


class Child extends Parent
{
     
	 String k="balwant";
	public void Print()
	{
		super.Print();
		System.out.println("child name");
	}
}

class Main
{
	public static void main(String args[])
	{
		Child c= new Child();
		c.Print();
	}
}