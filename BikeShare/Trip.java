
public class Trip {
	

	private int tripId; //trip_id
	private int duration; //duration	
	//private int startTime; //start_time, will get from DateTime object	
	//private int endTime; //end_time, will get from DateTime object	
	private int startStation; //start_station	
	private double startLat; //start_lat	
	private double startLong; //start_lon	
	private int endStation; //end_station	
	private double endLat; //end_lat	
	private double endLong; //end_lon	
	private int bikeId; //bike_id	
	private int planDuration; //plan_duration	
	private String tripRouteCategory; //trip_route_category	
	private String passHolderType; //passholder_type
	
	//store a DateTime and Station object inside of trips
	private DateTime startDateTime; //for trip file
	private DateTime endDateTime; //for trip file
	private DateTime goLiveDate; // for station file

	
	Trip (int tripID, int duration, DateTime startDateTime, DateTime endDateTime, int startStation, double startLat, double startLong, int endStation, double endLat, double endLong, int bikeId, int planDuration, String tripRouteCategory, String passHolderType){
		this.tripId = tripID;
		this.duration = duration;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.startStation = startStation;
		this.startLat = startLat;
		this.startLong = startLong;
		this.endStation = endStation;
		this.endLat = endLat;
		this.endLong = endLong;
		this.bikeId = bikeId;
		this.planDuration = planDuration;
		this.tripRouteCategory = tripRouteCategory;
		this.passHolderType = passHolderType;

	}


	public int getTripId() {
		return tripId;
	}


	public void setTripId(int tripId) {
		this.tripId = tripId;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


//	public int getStartTime() {
//		return startTime;
//	}


	public String getPassHolderType() {
		return passHolderType;
	}


	public void setPassHolderType(String passHolderType) {
		this.passHolderType = passHolderType;
	}


	public DateTime getStartDateTime() {
		return startDateTime;
	}


	public void setStartDateTime(DateTime startDateTime) {
		this.startDateTime = startDateTime;
	}


	public DateTime getEndDateTime() {
		return endDateTime;
	}


	public void setEndDateTime(DateTime endDateTime) {
		this.endDateTime = endDateTime;
	}


//	public void setStartTime(int startTime) {
//		this.startTime = startTime;
//	}
//
//
//	public int getEndTime() {
//		return endTime;
//	}
//
//
//	public void setEndTime(int endTime) {
//		this.endTime = endTime;
//	}


	public int getStartStation() {
		return startStation;
	}


	public void setStartStation(int startStation) {
		this.startStation = startStation;
	}


	public double getStartLat() {
		return startLat;
	}


	public void setStartLat(double startLat) {
		this.startLat = startLat;
	}


	public double getStartLong() {
		return startLong;
	}


	public void setStartLong(double startLong) {
		this.startLong = startLong;
	}


	public int getEndStation() {
		return endStation;
	}


	public void setEndStation(int endStation) {
		this.endStation = endStation;
	}


	public double getEndLat() {
		return endLat;
	}


	public void setEndLat(double endLat) {
		this.endLat = endLat;
	}


	public double getEndLong() {
		return endLong;
	}


	public void setEndLong(double endLong) {
		this.endLong = endLong;
	}


	public int getBikeId() {
		return bikeId;
	}


	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}


	public int getPlanDuration() {
		return planDuration;
	}


	public void setPlanDuration(int planDuration) {
		this.planDuration = planDuration;
	}


	public String getTripRouteCategory() {
		return tripRouteCategory;
	}


	public void setTripRouteCategory(String tripRouteCategory) {
		this.tripRouteCategory = tripRouteCategory;
	}

	public DateTime getGoLiveDate() {
		return goLiveDate;
	}


	public void setGoLiveDate(DateTime goLiveDate) {
		this.goLiveDate = goLiveDate;
	}

}
