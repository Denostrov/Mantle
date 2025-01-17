package mantle.client.pages;

import mantle.client.gui.GuiManual;

import org.w3c.dom.Element;

public abstract class BookPage {

    protected GuiManual manual;
    protected int side;

    public void init(GuiManual manual, int side) {
        this.manual = manual;
        this.side = side;
    }

    public abstract void readPageFromXML(Element element);

    public void renderBackgroundLayer(int localwidth, int localheight) {}

    public abstract void renderContentLayer(int localwidth, int localheight, boolean isTranslatable);
}
