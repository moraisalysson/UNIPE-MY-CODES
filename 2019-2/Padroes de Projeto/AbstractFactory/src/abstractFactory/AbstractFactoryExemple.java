package abstractFactory;

import java.util.List;
import java.util.Random;
import abstractFactory.OSXFactory;
import buttons.Button;
import buttons.OSXButton;
import buttons.WinButton;

public class AbstractFactoryExemple {
	
	private static GUIFactory factory(String apparence) {
		switch(apparence) {
			case "osx":
				return new OSXFactory();
			
			case "win":
				return new WinFactory();
			
			default:
				throw new IllegalArgumentException("unknown " + apparence);
		}
	}
	
	public static void main(final String[] arguments) {
		var randomAppearance = List.of("osx", "win").get(new Random().nextInt(2));
		
		var factory = factory(randomAppearance);
		
		var button = factory.createButton();
		
		button.paint();
	}
}
