

class Emp {
	
	int eid;
	String ename;
	double esal;
	String tech;
	
	Emp(int eid, String ename, double esal, String tech) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.tech = tech;

	}
	
	public void displayEmpInfo() {
		System.out.println("emp id is :"+this.eid);
		System.out.println("empname :"+ this.ename);
		System.out.println("empsal is :"+this.esal);
		
	
	}
}

class FrontEndDeveloper extends Emp {
 	


	FrontEndDeveloper(int eid, String ename, double esal, String tech) {
		super(eid, ename, esal);
		
	}

	public void displayEmpInfo()
	{
		super.displayEmpInfo();
		System.out.println("emp FrontEnd tech is: " +this.tech);
	}

	
}

class BackendDeveloper extends Emp {
 			
	BackendDeveloper(int eid, String ename, double esal, String tech) {
		super(eid, ename, esal);
		
	}
	public void displayEmpInfo()
	{
		super.displayEmpInfo();
		System.out.println("emp BackendEnd tech is: " +this.tech);
	}

}

class SoftwareCompany  {

	public static void main(String[] args) {
		

		System.out.println("main starts");
		
		FrontEndDeveloper f1 = new FrontEndDeveloper(12, "vidhu", 15000, "JS");
        BackendDeveloper b1= new BackendDeveloper(15, "Priya", 10000, "Ajs");	
        
        f1.displayEmpInfo();
        b1.displayEmpInfo();
	}

}

