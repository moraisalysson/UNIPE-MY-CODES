package abstractFactory;

import buttons.Button;

@FunctionalInterface
public interface GUIFactory {

	public Button createButton();

}
