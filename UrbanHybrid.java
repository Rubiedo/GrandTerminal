
public class UrbanHybrid extends Route {
	
	public double Stops;
	public double stationStaff;
	public double trainLength;
	public double addStaff;
	public double Stations;
	public double additional;
	
	public UrbanHybrid(String n, double l, double v, double h, double t, double a, double nS, double sS, double ad){
		super(n, l, v, h);
		this.trainLength = t;
		this.addStaff = a;
		this.Stations = nS;
		this.stationStaff = sS;
		this.additional = ad;
	}
	//Calculates vehicles
	public double getVehicles(){
		double e = 2*60*miles*additional*trainLength/(mph*headway);
		return e;
	};
	//Calculates staff
	public double getStaff(){
		double staff = getVehicles();
		double operators = staff/trainLength;
		double oStaff = addStaff*staff/trainLength;
		double sStaff = Stations*stationStaff;
		double totalStaff = operators + oStaff + sStaff;
		return totalStaff;
	};
	
}

//The return of these items will be passed onto the main method