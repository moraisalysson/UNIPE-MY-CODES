package cap08;

public class TestData {
	public static void main(String[] args) {
		Data dt1 = new Data(10, 15, 2018);
		
		for(int i = 0; i < 100; i++) {
			System.out.println(dt1.toString());
			dt1.nextDay();
		}
	}
}
