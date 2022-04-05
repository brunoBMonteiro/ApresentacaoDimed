package criacionais.abstractfactory.factories;

import criacionais.abstractfactory.buttons.Button;
import criacionais.abstractfactory.buttons.MacOSButton;
import criacionais.abstractfactory.checkboxes.Checkbox;
import criacionais.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}