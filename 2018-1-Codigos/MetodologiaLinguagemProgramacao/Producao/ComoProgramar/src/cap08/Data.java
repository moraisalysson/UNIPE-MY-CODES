package cap08;

public class Data {
	private int month;
	private int day;
	private int year;
	
	public Data(int theMonth, int theDay, int theYear ) {
		this.month = this.checkMonth(theMonth);
		this.year = theYear;
		this.day = this.checkDay(theDay);
		
		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public void nextDay() {
		this.day = this.checkDay( this.day + 1 );
	}
	
	private int checkMonth(int testMonth) {
		
		if(testMonth > 0 && testMonth <= 12)
			return testMonth;
		
		else {
			
			System.out.printf("Invalid month (%d) set to 1.%n", testMonth);
			
			return 1;
		}
	}
	
	private int checkDay( int testDay ) {
		
		int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(testDay > 0 && testDay <= daysPerMonth[ this.month ])
			return testDay;
		
		if( this.month == 2 && testDay == 29 && (this.year % 400 == 0 || 
				( this.year % 4 == 0 && this.year % 100 != 0 )))
			return testDay;
		
		System.out.printf("Invalid day (%d) set to 1.%n", testDay);
		
		return 1;
	}
	
	public String toString() {
	
		return String.format( "%d/%d/%d", this.month, this.day, this.year);
	
	}
	
	
}
