package cap08;

public class TestTime2 {
	public static void main(String[] args) {
		Time2 t1 = new Time2(23, 59, 59);
		
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toString());
		
		t1.tick();
		
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toString());
		
		t1.incrementMinute();
		
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toString());
			
		t1.incrementHour();
		
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toString());
	}
}
