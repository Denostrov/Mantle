package mantle.client.pages;

import net.minecraft.util.StatCollector;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class TitlePage extends BookPage {

    String text;

    @Override
    public void readPageFromXML(Element element) {
        NodeList nodes = element.getElementsByTagName("text");
        if (nodes != null) text = nodes.item(0).getTextContent();
    }

    @Override
    public void renderContentLayer(int localWidth, int localHeight, boolean isTranslatable) {
        if (isTranslatable) text = StatCollector.translateToLocal(text);
        manual.fonts.drawSplitString(text, localWidth, localHeight, 178, 0);
    }
}
