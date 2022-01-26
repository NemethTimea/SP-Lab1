package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;


public class TOC implements Element, Visitee {
    String title;

    public TOC(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = title;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitTOC(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTOC(this);
    }
}
