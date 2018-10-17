package cap08;

public class Time2 {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time2() {
		this(0, 0, 0);
	}
	
	public Time2(int h) {
		this(h, 0, 0);
	}
	
	public Time2(int h, int m, int s) {
		this.setTime(h, m, s);
	}
	
	public Time2(Time2 time) {
		this(time.getHour(), time.getMinute(), time.getSecond());
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
				"%02d:%02d:%02d %s", 
				( (this.getHour() == 0 || this.getHour() == 12) ? 12 : this.getHour() % 12), 
				this.getMinute(), this.getSecond(), (this.getHour() < 12 ? "AM" : "PM") );
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
			this.minute = hour;
			
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
