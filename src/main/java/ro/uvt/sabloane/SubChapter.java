package ro.uvt.sabloane;

import javax.lang.model.util.Elements;
import java.util.ArrayList;

public class SubChapter {

    private String title;
    private ArrayList<Element> elements = new ArrayList<>();
//    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
//    private ArrayList<Image> images = new ArrayList<>();
//    private ArrayList<Table> tables = new ArrayList<>();

    public SubChapter(String title){
        this.title = title;
    }
    public void createNewParagraph(String paragraph){
        elements.add(new Paragraph(paragraph));
    }
    public void createNewImage(String image_name){
        elements.add(new Image(image_name));
    }
    public void createNewTable(String name){
        elements.add(new Table(name));
    }
    public void print(){
        System.out.println(this.title);
        for (Element p : this.elements) {
            p.print();
        }
    }
}