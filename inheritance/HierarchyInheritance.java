class J
{
int x;

J(int x)
{
	this.x=x;
	
}
}

class K extends J
{
	double a;
	int b;
	K(int x, double a, int b)
	{
		super(x);
		this.a=a;
		this.b=b;
		
	}
}

class L extends J
{
	int m;
	int n;
	L(int x,int m, int n)
	{
		super(x);
		this.m=m;
		this.n=n;
	}
}





class HierarchyInheritance
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		J j1=new J(5);
		K k1= new K(6,1.5,5);
		L l1= new L(10,6,5);
		System.out.println(j1.x);
		
		System.out.println(k1.x);
		System.out.println(k1.a);
		System.out.println(k1.b);
		System.out.println(l1.x);
		System.out.println(l1.m);
		System.out.println(l1.n);
		System.out.println("Main ends");
	}
	
}