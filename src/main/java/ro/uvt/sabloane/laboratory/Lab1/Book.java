package ro.uvt.sabloane.laboratory.Lab1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<String> elements = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }
    public void createNewParagraph(String newTitle){
        elements.add(newTitle);
    }
    public void createNewImage(String newTitle){
        elements.add(newTitle);
    }
    public void createNewTable(String newTitle){
        elements.add(newTitle);
    }
    public void print(){
        for (String e: this.elements){
            System.out.println(e);
        }
    }
    public String getTitle(){
        return this.title;
    }
    public List<String> getElements(){
        return this.elements;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
}
