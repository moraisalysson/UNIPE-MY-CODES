package abstractFactory;

import buttons.Button;
import buttons.OSXButton;

public class OSXFactory implements GUIFactory {
	public Button createButton() {
		return new OSXButton();
	}
}
