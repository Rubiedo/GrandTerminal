
public abstract class Route {
	String name;
	double miles;
	double mph;
	double headway;
	
	
	//Since the project uses these 4 variables throughout all classes, they will be instantiated in the abstract
	public Route(String n, double l, double v, double h){
		this.name = n;
		this.miles = l;
		this.mph = v;
		this.headway = h;
		
	}
	//Since all classes will require the user to find vehicles and number of staff, they are created in the abstact
	public abstract double getVehicles();
	public abstract double getStaff();
	
}
