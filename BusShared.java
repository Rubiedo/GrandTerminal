
public class BusShared extends Route {

	public double additional;
	public double Stops;
	//The constructor pulls in the information and passes all the information to the super class variables and to local variables.
	public BusShared(String n, double l, double v, double h, double a, double num){
			super(n, l, v, h);
			this.additional = a;
			this.Stops = num;
	   }
	
	//Calculation of vehicles
	public double getVehicles(){
		double e = 2*60*miles*additional/(mph*headway);
		return e;
	};
	
	//Calculation of staff
	public double getStaff(){
		double staff = getVehicles();
		return staff;
	};
}
//The return of these items will be passed onto the main method