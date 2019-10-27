package abstractFactory;

import buttons.Button;
import buttons.WinButton;

public class WinFactory implements GUIFactory {
	public Button createButton() {
		return new WinButton();
	}
}
