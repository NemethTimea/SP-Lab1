package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element,Visitee{
    protected String title;
    protected List<Element> elements = new ArrayList<>();

    public Section(String title){
        this.title = title;
    }

    public List<Element> getElements(){
        return elements;
    }
    public String getTitle(){
        return title;
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
    @Override
    public void accept(Visitor visitor){
      visitor.visitSection(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitSection(this);
    }
}
