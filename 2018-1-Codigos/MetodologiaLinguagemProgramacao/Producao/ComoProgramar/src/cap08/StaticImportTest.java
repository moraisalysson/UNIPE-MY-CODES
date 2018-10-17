package cap08;

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.log;
import static java.lang.Math.cos;

public class StaticImportTest {
	public static void main(String[] args) {
		System.out.printf("sqrt( 900.0 ) = %.1f\n", sqrt ( 900.0 ));
		System.out.printf("ceil( -9.8 ) = %.1f\n", ceil ( -9.8 ));
		System.out.printf("log( E ) = %.1f\n", log( 16 ));
		System.out.printf("cos( 0.0 ) = %.1f\n", cos ( 0.0 ));
	}
}
