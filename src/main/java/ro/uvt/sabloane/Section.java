package ro.uvt.sabloane;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    protected String title;
    protected List<Element> elements = new ArrayList<>();

    public Section(String title){
        this.title = title;
    }
    @Override
    public void print() {
        for (Element e : elements){
            e.print();
        }
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(Integer index) {
        return elements.get(index);
    }
}
