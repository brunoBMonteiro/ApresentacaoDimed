package criacionais.factorymethod.factoryos.factory;

import criacionais.factorymethod.factoryos.buttons.HtmlButton;
import criacionais.factorymethod.factoryos.buttons.Button;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}