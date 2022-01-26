package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element, Visitee {
    String title;
    List<Element> elementList = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element e) {
        elementList.add(e);
    }
    public String getTitle(){
        return this.title;
    }
    public List<Element> getElementList(){
        return this.elementList;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
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
