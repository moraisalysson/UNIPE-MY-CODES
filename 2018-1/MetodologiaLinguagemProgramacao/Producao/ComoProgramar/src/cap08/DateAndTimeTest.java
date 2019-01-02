package cap08;

public class DateAndTimeTest {

	public static void main(String[] args) {
		DateAndTime dt1 = new DateAndTime();
		
		System.out.println(dt1.toString());
		
		dt1.setTime(11, 59, 55);
		dt1.setDate(31, 12, 18);
		
		System.out.println(dt1.toString());
		
		for(int i = 0; i < 100; i++) {
			dt1.tick();
			System.out.println(dt1.toString());
		}

	}

}
