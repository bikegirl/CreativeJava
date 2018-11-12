import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class DataAnalysis {
	
	int activeStatusCount;
	DateTime someDate;
	Trip someTrip;
	Station someStation;
	
	//all core requirements are based off 1st constructor instantiations
	ArrayList<Station> stationRoster; 
	ArrayList<Trip> tripRoster;
	
	//wild card credits are based off 2nd constructor instantiations
	ArrayList<Trip> tripRosterq2;
	ArrayList<Trip> tripRosterq3;
	
	
	
	/*
	 * 1. How many Active stations were there in the second quarter of 2018?
	 * 2. How many stations that had a Go-Live Date in 2017 are still Active?
	 * 3. How many trips originated at Amtrak 30th Street Station?
	 * 4. What was the most popular month for walk ups?
	 * 5. What is the average duration of a bike rental?
	 * 6. How many trips started and completed between 10am and 1pm? You can assume the input will
     *    not include part of the hour.
	 * 7. Wild card – come up with an interesting question. List the question and find the answer to it.
	 *    These are my wild cards:
	 *    How many trips were there in February? (for just one file)
	 *    How many trips were there in February? (a combined q2 and q3 data, created by using a new object).
	 * 
	 */
	
	//1st constructor: receives Arraylist of Stations and Arraylist of Trips
	DataAnalysis(ArrayList<Station> stationRoster, ArrayList<Trip> tripRoster) {
		
		this.stationRoster = stationRoster;
		this.tripRoster = tripRoster;
	}
	
	//2nd constructor receives two different Trip Arraylists
	DataAnalysis(ArrayList<Station> stationRoster, ArrayList<Trip> tripRosterq2, ArrayList<Trip> tripRosterq3) {
		
		this.stationRoster = stationRoster;
		this.tripRosterq2 = tripRosterq2;
		this.tripRosterq3 = tripRosterq3;
	}
	
	//How many Active stations were there in the second quarter of 2018?
	public int getActiveStations() {
		
		ArrayList<Station> activeStations = new ArrayList<>();
		for(Station s: stationRoster) {
			if(s.getStatus().equals("Active")) {
				activeStations.add(s);
			}			
		}
		return activeStations.size();
	}
	
	//How many stations that had a Go-Live Date in 2017 are still Active?
	public int stillActiveFrom(int passedYear) {
		ArrayList<Station> activeStationsFor = new ArrayList<>();
		
		//because all years are 2000 or later, shaving off the last 2 digits
		//passedYear = passedYear % 2000;
		
		for(Station s: stationRoster) {
			//System.out.println(s.getGoLiveDate().getYear());
			if((s.getGoLiveDate().getYear() == passedYear || s.getGoLiveDate().getYear() == (passedYear % 2000) )) {
				activeStationsFor.add(s);
			}				
		}
		return activeStationsFor.size();
	}
	
	//print only the years in the ArrayList
	//for debugging purposes only
//	public ArrayList<Integer> printAllYears() {
//		ArrayList<Integer> allYears = new ArrayList<>();
//		
//		for(Station s: stationRoster) {
//			allYears.add(s.getGoLiveDate().getYear());		
//		}
//		return allYears;
//	}
	
	//How many trips originated at Amtrak 30th Street Station (3022)?
	public int getOriginQty(int passedStationId) {
		
		ArrayList<Trip> originQty = new ArrayList<>();
		
		for(Trip t: tripRoster) {
			if(t.getStartStation() == passedStationId) {
				originQty.add(t);
			}			
		}
		return originQty.size();
	}
	
	//What was the most popular month for walk ups?
	public int getmostPopularMonthFor(String kind) {
		ArrayList<Trip> type = new ArrayList<>();
		for(Trip t: tripRoster) {
			//System.out.println(t.getPassHolderType());
			if(t.getPassHolderType().equals(kind)) {
				type.add(t);
			}			
		}
		
		int[] monthTracker = new int[13];
		
		for (Trip y: type) {
			//currMonth = y.getGoLiveDate().getMonth();
			monthTracker[y.getStartDateTime().getMonth()]++;
		}
		
		int currMax = monthTracker[1];
		int indexTracker = 1;
		for (int i = 1; i < monthTracker.length; i++) {
			if (currMax < monthTracker[i]) {
				indexTracker = i;		
				currMax = monthTracker[i];
			} 
		}
		return indexTracker;			
	}
	
	//What is the average duration of a bike rental?
	public double getAverage() {
		//ArrayList<Trip> duration = new ArrayList<>();
		double totalDuration = 0.00;
		
		for(Trip t: tripRoster) {
			totalDuration += t.getDuration();			
		}
		
		return (double) (totalDuration/tripRoster.size());
	}
				
	
			
	//How many trips started and completed between 10am and 1pm? You can assume the input will
	//the client does not have to indicate whether using standard or military time
	//this method will work with whichever time stamp entry
	public int numberOfTripsBetween(int startHour, String startMeridian, int endHour, String endMeridian) {
		ArrayList<Trip> totalTrips = new ArrayList<>();
		double totalDuration = 0.00;
		
		//convert to military time
		int startHourConverted;
		int endHourConverted;
		
		//convert to miliyary, otherwise it's already in military time and the meridian argument doesn't matter		
		if (startHour < 12 && startMeridian.toUpperCase().equals("PM")) {
			
			startHourConverted = startHour + 12;
		} else {
			startHourConverted = startHour;
		}
		if (endHour < 12 && endMeridian.toUpperCase().equals("PM")) {
			
			endHourConverted = endHour + 12;
		} else {
			endHourConverted = endHour;
		}
		
		//System.out.println("This is converted Time for Start: " + startHourConverted);
		//System.out.println("This is converted Time for End: " + endHourConverted);
		
		for(Trip t: tripRoster) {
			//System.out.println(t.getStartDateTime().getStartHour());
			if (t.getStartDateTime().getStartHour() >= startHourConverted && t.getEndDateTime().getStartHour() <= endHourConverted) {
				totalTrips.add(t);
			}
		}
		return totalTrips.size();		
	}
	
	public int getTripsPerMonth(int numberMonth) {
		
		ArrayList<Trip> totalPerMonth = new ArrayList<>();
		
		for(Trip t: tripRoster) {
			//System.out.println("This is month within getTripsPerMonth: " + t.getStartDateTime().getMonth());
			if (t.getStartDateTime().getMonth() == numberMonth)
			totalPerMonth.add(t);			
		}
		
		return totalPerMonth.size();
		
				
		
	}
	
	//this is for debugging purposes only
//	public void printTripArrayList() {
//		
//		for(Trip t: tripRoster) {
//			System.out.println(t.getStartDateTime().getMonth());	
//			}
//	}
//}

		public int getCombineQuarterTripsPerMonth(int numberMonth) {
		
		ArrayList<Trip> totalPerMonth = new ArrayList<>();
		
		for(Trip q2: tripRosterq2) {
			//System.out.println("This is month within getTripsPerMonth: " + t.getStartDateTime().getMonth());
			if (q2.getStartDateTime().getMonth() == numberMonth)
			totalPerMonth.add(q2);			
		}
		
		for(Trip q3: tripRosterq3) {
			
			if (q3.getStartDateTime().getMonth() == numberMonth)
				totalPerMonth.add(q3);
		}
		
		return totalPerMonth.size();
				
		
	}




}
		
	


	

	

		
//		Iterator<Station> eachStation = stationRoster.iterator();
//		//System.out.println("Printing out ArrayList from within Method: " + passedArrayList);
//		
//		while (eachStation.hasNext()) {
//			//System.out.println("This is within the method: " + someStation.getStatus());
//			
//			if (someStation.getStatus().equals("Active")) {
//				
//				activeStatusCount++;
////			}
//			
//		}
//		
//		//System.out.println(activeStatusCount);
////		return activeStatusCount++;
//	}
//
//}
