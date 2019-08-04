class G
{
int x;
double y;
G(int x, double y)
{
	this.x=x;
	this.y=y;
}
}

class H extends G
{
	double z;
	H(int x, double y, double z)
	{
		super(x,y);
		this.z=z;
		
	}
}

class I extends H
{
	int m;
	int n;
	I(int x, double y, double z, int m, int n)
	{
		super(x,y,z);
		this.m=m;
		this.n=n;
	}
}





class MultiInheritance
{
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		G g1=new G(5,2.5);
		H h1= new H(6,1.5,2.5);
		I i1= new I(8,2.6,2.8,5,6);
		System.out.println(g1.x);
		System.out.println(g1.y);
		System.out.println(h1.x);
		System.out.println(h1.y);
		System.out.println(h1.z);
		System.out.println(i1.x);
		System.out.println(i1.y);
		System.out.println(i1.z);
		System.out.println(i1.m);
		System.out.println(i1.n);
		System.out.println("Main ends");
	}
	
}