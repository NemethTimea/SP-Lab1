package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;


public class Author implements Visitee{
    String name;

    public Author(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitAuthor(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitAuthor(this);
    }
}
