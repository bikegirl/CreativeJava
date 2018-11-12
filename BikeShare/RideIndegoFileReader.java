import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

//has two methods, readStationFile and readBikeFile
public class RideIndegoFileReader {
	
		String fileName;
		Station someStation;
		Trip someTrip;
		DateTime startDateTime; //for trip file
		DateTime endDateTime; // for trip file
		DateTime someDate; //for station file

				
		RideIndegoFileReader(String fileName) {
			this.fileName = fileName;
			
		}
		//throws FileNotFoundException insert line 20
		
		public ArrayList<Trip> readTripFile() {
			//create an array list of passenger and model that passenger in an arrayList
			ArrayList<Trip> tripRoster = new ArrayList<Trip>();
			//this does not create a new DateTime object, just uses the same instance variable
//			startDateTime = new DateTime();
//			endDateTime = new DateTime();
			File outputFile = new File("BikeShareReportTrips.txt");
			try  {
				PrintWriter out = new PrintWriter(outputFile);
				Scanner scan = new Scanner(new File(fileName));
				//in.useDelimiter(",");
				scan.nextLine();
				//int currIndex=0;
			    
			    while (scan.hasNextLine()) {
					startDateTime = new DateTime();
					endDateTime = new DateTime();
			    	//read in each line of the file
			    	String line = scan.nextLine();
			    	//System.out.println("This is print line: " + line);
			    	//split the line in 2 at the colon
			    	//see the split method on the String class in Javadocs
			    	String[] bikeRoute = line.split(",");
			    	//store a DateTime and Station object inside of trips
			    	//private DateTime goLiveDate;
			    	//System.out.println(bikeRoute[0]);
			    	int tripID = Integer.parseInt(bikeRoute[0]);
			    	int duration = Integer.parseInt(bikeRoute[1]);
			    	if ( bikeRoute[2].contains("-")) {
			    		
			    		if (bikeRoute[2].contains("\"")) {
			    			bikeRoute[2] = bikeRoute[2].substring(1, bikeRoute[2].length()-1);
			    		}
			    		
			    		startDateTime.parseStartDateTime((bikeRoute[2].trim()));
			    		//System.out.println(startDateTime.getStartHour());
			    		
			    		
			    	}   	
			    	if ( bikeRoute[3].contains("-")) {
			    		
			    		if (bikeRoute[3].contains("\"")) {
			    			bikeRoute[3] = bikeRoute[3].substring(1, bikeRoute[3].length()-1);
			    		}
			    		
			    		endDateTime.parseEndDateTime(bikeRoute[3].trim()); 
			    		//System.out.println(endDateTime.getEndHour());
			    	}
			    	//System.out.println(bikeRoute[2]);
			    	//System.out.println(bikeRoute[3]);
			    	int startStation = Integer.parseInt(bikeRoute[4].trim());
			    	double startLat = 0.00;
			    	double startLong = 0.00;
			    	if (bikeRoute[5].equals("")) {
			    		startLat = 0.00;
			    	} else {
			    		startLat = Double.parseDouble(bikeRoute[5].trim());
			    	}
			    	if (bikeRoute[6].equals("")) {
			    		startLong = 0.00;
			    	} else {
			    		startLong = Double.parseDouble(bikeRoute[6].trim());
			    	}
			    	int endStation = Integer.parseInt(bikeRoute[7].trim());
			    	double endLat = 0.00;
			    	double endLong = 0.00;
			    	if (bikeRoute[8].equals("")) {
			    		endLat = 0.00;
			    	} else {
			    		endLat = Double.parseDouble(bikeRoute[8].trim());
			    	}
			    	if (bikeRoute[9].equals("")) {
			    		endLong = 0.00;
			    	} else {
			    		endLong = Double.parseDouble(bikeRoute[9].trim());
			    	}	    	   	
		
			    	int bikeId = Integer.parseInt(bikeRoute[10].trim());
			    	int planDuration = Integer.parseInt(bikeRoute[11].trim());
			    	String tripRouteCategory = bikeRoute[12].trim();
			    	String passHolderType = bikeRoute[13].trim();
			    	
			    	//instantiate a Trip object with new info
			    	Trip tripInfo = new Trip(tripID, duration, startDateTime, endDateTime, startStation, startLat, startLong, endStation, endLat, endLong, bikeId, planDuration, tripRouteCategory, passHolderType);
			    	tripRoster.add(tripInfo);
			    }
				
			    //for debugging purposes only
//				for(Trip t: tripRoster) {
//					System.out.println("This is within file reader:" + t.getStartDateTime().getMonth());	
//					}
			    
			    //System.out.println(startDateTime.getMonth());
			    //System.out.println(endDateTime.getMonth());
			    		    
			    
			    } catch(Exception e) {
			    	System.out.println("Error reading file ");
			    	e.printStackTrace();
			    }	
			//System.out.println(tripRoster);
			return tripRoster;
		}
		
		
		
		public ArrayList<Station> readStationFile() {
			File outputFile = new File("BikeShareReportStations.txt");
			
			ArrayList<Station> stationRoster = new ArrayList<Station>();
			
			
			try  {
				PrintWriter out = new PrintWriter(outputFile);
				Scanner scan = new Scanner(new File(fileName));
				//in.useDelimiter(",");
				scan.nextLine();
				//int currIndex=0;
			    
			    while (scan.hasNextLine()) {
			    	someDate = new DateTime();
			    	String line = scan.nextLine();

			    	String[] stationLocation = line.split(",");
			    	int stationId = Integer.parseInt(stationLocation[0]);
			    	String stationName = stationLocation[1];
			    	String status = stationLocation[3];
			    	//if statement, scoping issues beware
			    	if (stationLocation[1].contains("\"")) {
			    		//System.out.println("This is before stationName:" + stationName);
			    		stationName = stationName.substring(1, stationName.length());
			    		stationName = stationLocation[1].concat(stationLocation[2]);
			    		stationName = stationName.substring(1, stationName.length()-1);
			    		someDate.parseDate(stationLocation[3]);//parsesDate at different location
				    	status = stationLocation[4]; //sets status at different location			    		
			    	} else {
			    	
			    		stationName = stationLocation[1];
				    	someDate.parseDate(stationLocation[2]);//parsesDate
				    	status = stationLocation[3];

			    	}	
			    	
			    	//Instantiate a station object with new info
			    	Station stationInfo = new Station(stationId, stationName, someDate, status);
			    	stationRoster.add(stationInfo);

			    }
			    
			    } catch(Exception e) {
			    	System.out.println("Error reading file ");
			    	e.printStackTrace();
			    }	
			//System.out.println("Print stationRoster from within: " + stationRoster);
			return stationRoster;
		}

	}


//substring method to remove quotations
//char At (int.)
//Parse Int (String S)


//parseMonth
//parseDay
//parseYear
//int goLiveDate = Integer.parseInt(stationLocation[2]);
//String name;
//System.out.println(stationLocation[3]);
//System.out.println(stationLocation[4]);
//String myName = stationLocation[3].concat("," + stationLocation[4]);
//System.out.println(myName);
////you might need this line for Name
//myName = myName.substring(1, myName.length()-1);
//System.out.println(myName);
//break;
//while(individual[currIndex].charAt(individual[currIndex].length()-1) != '"') {
//	name = individual[currIndex];
//	System.out.println(name);
//	
//	currIndex++;
//}
//System.out.println(individual[4]);
		
//		if (individual[3] == )
//Passenger passengerInfo = new Passenger(passengerID, name, fate);
//manifest.add(passengerInfo);
//scan.useDelimiter(",|\n|\r"); is an option you can use.
//int pId = scan.nextInt();
//String name = scan.next();
//int fate = scan.nextInt();
//Pass it to an object
//Then make sure you add scan.next(); at the very very end. 
//Absorb the white space from the very last call.
//}
//then you're going to use a scan.close() before your catch.

