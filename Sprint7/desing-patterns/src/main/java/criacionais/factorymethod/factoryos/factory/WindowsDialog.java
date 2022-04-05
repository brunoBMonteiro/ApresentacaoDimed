package criacionais.factorymethod.factoryos.factory;


import criacionais.factorymethod.factoryos.buttons.Button;
import criacionais.factorymethod.factoryos.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}