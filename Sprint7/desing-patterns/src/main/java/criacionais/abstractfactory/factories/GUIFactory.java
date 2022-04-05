package criacionais.abstractfactory.factories;

import criacionais.abstractfactory.buttons.Button;
import criacionais.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}