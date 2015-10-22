public class BusHybrid extends Route {
	
	public double additional;
	public double Stops;
	public double stationStaff;
	public double trainLength;
	public double stations;
	
	//The constructor pulls in the information and passes all the information to the super class variables and to local variables.
	public BusHybrid(String n, double l, double v, double h, double j, double ad, double nm, double s){
			super(n, l, v, h);
			this.stationStaff = j;
			this.additional = ad;
			this.Stops = nm;
			this.stations = s;
	   }
	//Calculates Vehicles
	public double getVehicles(){
		double e = 2*60*miles*additional/(mph*headway);
		return e;
	};
	//Calculates Staff
	public double getStaff(){
		double vehicles = getVehicles();
		double sStaff = stations*stationStaff;
		double staff = vehicles + sStaff;
		return staff;
	};
}
//The return of these items will be passed onto the main method
