package ro.uvt.sabloane.laboratory.Lab5;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    String title;
    List<Element> elementList = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    @Override
    public void print() {
        System.out.println(this.title);
        for (Element e: this.elementList){
            e.print();
        }
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
}
