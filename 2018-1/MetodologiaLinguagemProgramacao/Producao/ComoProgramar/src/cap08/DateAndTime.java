package cap08;

public class DateAndTime {
	private int hour;
	private int minute;
	private int second;
	private int month;
	private int day;
	private int year;
		
	public void setDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void nextDay() {
		this.day = this.checkDay(this.day + 1);
		
		if( this.day == 1 )
			this.nextMonth();
	}
	
	public void nextMonth() {
		this.month = this.checkMonth(this.month + 1);
		
		if( this.month == 1 )
			this.nextYear();
	}
	
	public void nextYear() {
		this.year = this.year + 1;
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
	
	public void tick() {
		if(this.getSecond() == 59)
			this.incrementMinute();
		
		this.setSecond( this.getSecond() + 1 );
	}
	
	public void incrementMinute() {
		if(this.getMinute() == 59)
			this.incrementHour();
		
		this.setMinute( this.getMinute() + 1 );
	}
	
	public void incrementHour() {
		if(this.getHour() == 11)
			this.nextDay();
		
		this.setHour( this.getHour() + 1 );
	}
	
	public void setTime(int h, int m, int s) {
		this.setHour(h);
		this.setMinute(m);
		this.setSecond(s);
	}
	
	public String toUniversalString() {
		return String.format("%02d seconds", (this.getHour() * 3600) + (this.getMinute() * 60) + this.getMinute());
	}
	
	public String toString( ) {
		return String.format(
				"%02d:%02d:%02d %s %d/%d/%d", 
				( (this.getHour() == 0 || this.getHour() == 12) ? 12 : this.getHour() % 12), 
				this.getMinute(), this.getSecond(), (this.getHour() < 12 ? "AM" : "PM"),
				this.day, this.month, this.year);
	}
	
	public int getHour() {
		return hour;
	}

	public boolean setHour(int hour) {

		if(hour >= 0 && hour < 24) {
			this.hour = hour;
			return true;
		}
		
		System.out.println("Hora inválida. Setado para 0.");
		
		this.hour = 0;
		
		return false;
	}

	public int getMinute() {
		return minute;
	}

	public boolean setMinute(int minute) {
		if(minute >= 0 && minute < 60) {
			this.minute = minute;
			
			return true;
		}
		
		System.out.println("Minuto inválido. Setado para 0.");
		
		this.minute = 0;
		
		return false;
	}

	public int getSecond() {
		return second;
	}

	public boolean setSecond(int second) {
		if(second >= 0 && second < 60) {
			this.second = second;
			return true;
		}
		
		System.out.println("Segundo inválido. Setado para 0.");
		
		this.second = 0;
		
		return false;
	}
	
	
}
