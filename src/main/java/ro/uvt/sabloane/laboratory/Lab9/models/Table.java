package ro.uvt.sabloane.laboratory.Lab9.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab9.services.BookSaveVisitor;

public class Table implements Element, Visitee {
    String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void accept(Visitor visitor){
        visitor.visitTable(this);
    }
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTable(this);
    }
}
