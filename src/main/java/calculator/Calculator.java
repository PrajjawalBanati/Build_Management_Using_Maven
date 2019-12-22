package calculator;
class Multiplication{
	public int e;
	public double f;
void mul(double a,double b)//both types are double
{
	f=a*b;
	System.out.println(f);
}
void mul(int a,int b)//both types are int
{
	e=a*b;
	System.out.println(e);
}
void mul(int a,double b)//one type is int and one is double
{
	f=a*b;
	System.out.println(f);
}
}
class Addition extends Multiplication{
	public int c;
	public double d;
void add(double a,double b)//both types are double
{
	d=a+b;
	System.out.println(d);
}
void add(int a,int b)//both types are int
{
	c=a+b;
	System.out.println(c);
}
void add(int a,double b)//one type is int and one is double
{
	d=a+b;
	System.out.println(d);
}
}
class Division extends Addition{
	public int c;
	public double d;
void div(double a,double b)//both types are double
{
	d=a/b;
	System.out.println(d);
}
void div(int a,int b)//both types are int
{
	c=a/b;
	System.out.println(c);
}
void div(int a,double b)//one type is int and one is double
{
	d=a/b;
	System.out.println(d);
}	
}
class Calculator extends Division{
	public static void main(String[]args)
	{
		Calculator obj = new Calculator();
		obj.add(3,2);
		obj.add(3.1f,4);
		obj.add(3.1f,8.1f);
		obj.mul(3,2);
		obj.mul(3.1f,4);
		obj.mul(3.1f,8.1f);
		obj.div(6,2);
		obj.div(14,7);
	}
}

	

