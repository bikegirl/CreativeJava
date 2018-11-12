import java.io.File;
import java.io.PrintWriter;

public class ClientProgram {
	
	public static void main(String[] args) {
		
		
		RideIndegoFileReader stationFile = new RideIndegoFileReader("indego-stations-2018-8-3.csv");
		RideIndegoFileReader tripFile = new RideIndegoFileReader("indego-trips-2018-q2.csv");
//		File outputFile = new File("BikeShare Report.txt");
//		PrintWriter out = new PrintWriter(outputFile);
		
		//RideIndegoFileReader q2TripFile = new RideIndegoFileReader("indego-trips-2018-q2.csv");
		//RideIndegoFileReader q3TripFile = new RideIndegoFileReader("indego-trips-2018-q3.csv");
		
		
		//this DataAnalysis Object is for core requirements
		DataAnalysis stats = new DataAnalysis(stationFile.readStationFile(), tripFile.readTripFile());
		
		//this DataAnalysis Object is for wild card credit
		//DataAnalysis combinedStats = new DataAnalysis(stationFile.readStationFile(), q2TripFile.readTripFile(), q3TripFile.readTripFile());
		
		//question 1
		System.out.println("These are the number of active Stations from q2 2018: " + stats.getActiveStations());
		
		//question 2
		System.out.println("This is the number of Go-Live Date 2017 still Active: " + stats.stillActiveFrom(2017));
		
		//question 3
		System.out.println("This is the number of trips that started at 30th Amtrak: " + stats.getOriginQty(3022));
		
		//question 4
		System.out.println("This is most popular month for walk-ups q2:" + stats.getmostPopularMonthFor("Walk-up"));
		//System.out.println("This is most popular month for walk-ups q3:" + stats.getmostPopularMonthFor("Walk-up"));
		
		//question 5
        System.out.printf("This is the average Duration: %.4f",stats.getAverage()); //formatted to 4 past the decimal
		
		
		//question 6
		//For the number of Trips I am assuming the lapse of their ride has to
		//start and end between 10AM and 1PM.  For example, if the ride started at 10AM and ends at 2PM
		//then it won't get counted in the overall analysis.  Only trips that their start and end time are
        //both between 10-1
		System.out.println("\nThis is the number of Trips between 10AM and 1PM: " + stats.numberOfTripsBetween(10, "am", 1, "pm"));
		
		//question 7
		//combined stats wild card questions
		System.out.println("Wild Card: Total trips in the month of May q2: " + stats.getTripsPerMonth(5));
		//System.out.println("Wild Card: Total trips in the month of May q2 & q3: " + combinedStats.getCombineQuarterTripsPerMonth(5));
		//stats.printTripArrayList();
		//System.out.println(tripFile.readStationFile());
	}

}
		

	

