import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DateTime {
	
	//parsing the date
	private int month;
	private int day;
	private int year;
	
	//parsed time instance variables
	private int startHour;
	private int startMin;
	private int endHour;
	private int endMin;
	//private Station workingStation;
	
	
	//getters and setters for date
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getStartHour() {
		return startHour;
	}

	public void setStartHour(int startHour) {
		this.startHour = startHour;
	}

	public int getStartMin() {
		return startMin;
	}

	public void setStartMin(int startMin) {
		this.startMin = startMin;
	}

	public int getEndHour() {
		return endHour;
	}

	public void setEndHour(int endHour) {
		this.endHour = endHour;
	}

	public int getEndMin() {
		return endMin;
	}

	public void setEndMin(int endMin) {
		this.endMin = endMin;
	}

	

	
	//parsing date method, this is used for the station file
	public void parseDate(String passedString) {
		
		//System.out.println("Within ParseDate passed String:" + passedString);
		
		if (passedString.contains("/")) {
			String[] dateArray = passedString.split("/");
			//convert to int
			
			month = Integer.parseInt(dateArray[0].trim());
			day = Integer.parseInt(dateArray[1].trim());
			year = Integer.parseInt(dateArray[2].trim());
			startHour = 0;
			startMin = 0;
			endHour = 0;
			endMin=0;
			
			
			//for debugging purposes
			//System.out.println("Within parsedate index 0\n" + dateArray[0]);
			//System.out.println(dateArray[1]);
			//System.out.println(dateArray[2]);
			
			//for debugging purposes
			//for (int i=0; i < dateList.length; i++) {
			//System.out.println(dateList);
		} else {
			String[] dateArray = passedString.split("-");
			//convert to int
			
			month = Integer.parseInt(dateArray[0].trim());
			day = Integer.parseInt(dateArray[1].trim());
			year = Integer.parseInt(dateArray[2].trim());
			startHour = 0;
			startMin = 0;
			endHour = 0;
			endMin=0;
			
			
			//for debugging purposes
			//System.out.println("Within parsedate index 0\n" + dateArray[0]);
			//System.out.println(dateArray[1]);
			//System.out.println(dateArray[2]);
			
			//for debugging purposes
			//for (int i=0; i < dateList.length; i++) {
			//System.out.println(dateList);
			
		}
	}
		
	//parsing date and time method, which will be useful for the q2 and q3 trips files.
	public void parseStartDateTime(String passedString) {
		
		//System.out.println("Within ParseDate passed String:" + passedString);
		
		String[] dateAndTimeArray = passedString.split("-");		
		//System.out.println("This is the length of dateAndTimeArray: " + dateAndTimeArray.length);
		
		//convert to int
		//System.out.println(dateAndTimeArray[0]);
		month = Integer.parseInt(dateAndTimeArray[0].trim());
		//System.out.println(dateAndTimeArray[1].trim());
		day = Integer.parseInt(dateAndTimeArray[1].trim());
				
		//correct for flipped month
		if (month > 12 ) {
			//swap elements if month and day are switched out of order in date
			month = Integer.parseInt(dateAndTimeArray[1].trim());
			day = Integer.parseInt(dateAndTimeArray[0].trim());
			//System.out.println("This is after month: " + month);
			//System.out.println("This is after day: " + day);			
		}
		
		//System.out.println("This is after month outside loop: " + month);
		//System.out.println("This is after day outside loop: " + day);
		//System.out.println("This is the length of dateAndTimeArray: " + dateAndTimeArray.length);
		
		String temp = dateAndTimeArray[2].trim();
		//System.out.println("This is temp: " + temp.trim());
		year = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
		//System.out.println("this is year: " + year);
		//System.out.println("Before this is startHour: " + startHour);
		startHour = Integer.parseInt(temp.substring(temp.indexOf(" ") + 1, temp.indexOf(":")));
		//System.out.println("After this is startHour: " + startHour);
		startMin = Integer.parseInt(temp.substring(temp.indexOf(":") + 1, temp.length()));
		//System.out.println("this is startMin: " + startMin);
		
		//for debugging purposes
		//System.out.println(month);
		//System.out.println(day);
		//System.out.println(year);
		//System.out.println(startMin);
		//System.out.println(startSecs);
	}
	
	//parsing date and time method, which will be useful for the q2 and q3 trips files.
	public void parseEndDateTime(String passedString) {
		
		//System.out.println("Within ParseDate passed String:" + passedString);
		
		String[] dateAndTimeArray = passedString.split("-");
		//System.out.println("This is the length of dateAndTimeArray: " + dateAndTimeArray.length);

		//convert to int		
		month = Integer.parseInt(dateAndTimeArray[0].trim());
		day = Integer.parseInt(dateAndTimeArray[1].trim());
		if (month > 12 ) {
			//swap elements if month and day are switched out of order in date
			month = Integer.parseInt(dateAndTimeArray[1].trim());
			day = Integer.parseInt(dateAndTimeArray[0].trim());
		}
		String temp = dateAndTimeArray[2];
		temp.trim();
		//System.out.println("This is temp: " + temp);
		year = Integer.parseInt(temp.substring(0, temp.indexOf(" ")));
		
		endHour = Integer.parseInt(temp.substring(temp.indexOf(" ") + 1, temp.indexOf(":")));
		endMin = Integer.parseInt(temp.substring(temp.indexOf(":") + 1, temp.length()));

		//for debugging purposes
		//System.out.println("month " + month);
		//System.out.println("day " + day);
		//System.out.println("year" + year);
	    //System.out.println("end Min" + endHour);
		//System.out.println("end Secs" + endMin);
	}
	
	
}


