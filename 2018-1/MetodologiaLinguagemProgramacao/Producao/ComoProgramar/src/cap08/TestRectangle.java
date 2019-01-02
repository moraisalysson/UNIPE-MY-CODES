package cap08;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
		System.out.println(r1.calcPerimeter());
		System.out.println(r1.calcArea());
		
		r1.setLength(15.0f);
		r1.setWidth(5.0f);
		
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());		
		System.out.println(r1.calcPerimeter());
		System.out.println(r1.calcArea());
		
	}
}
