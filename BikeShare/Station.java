
public class Station {
	
	private int stationId; //Station ID	
	private String stationName; //Station Name	
	private String status; //Status
	private DateTime goLiveDate; //date class
	
	Station(int stationId, String stationName, DateTime goLiveDate, String status){
		this.stationId = stationId;
		this.stationName = stationName;
		this.goLiveDate = goLiveDate;
		this.status = status;
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public DateTime getGoLiveDate() {
		return goLiveDate;
	}

	public void setGoLiveDate(DateTime goLiveDate) {
		this.goLiveDate = goLiveDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
