package ro.uvt.sabloane.laboratory.Lab5;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    String title;
    List<String> elements = new ArrayList<>();

    public SubChapter(String title) {
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public void createNewParagraph(String element){
        elements.add(element);
    }
    public void createNewImage(String element){
        elements.add(element);
    }
    public void createNewTable(String element){
        elements.add(element);
    }
    public void print(){
        for (String e: this.elements){
            System.out.println(e);
        }
    }
}
