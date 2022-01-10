package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.Entity;

@Entity(name = "Tabel")
public class Table extends BaseElement implements Element, Visitee{
    private String name;

    public Table(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void accept(Visitor visitor){
        visitor.visitTable(this);
    }
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTable(this);
    }
}