package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Tabel")
public class Table extends BaseElement implements Element, Visitee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String name;

    public Table(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Table(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){ this.name = newName; }

    public void accept(Visitor visitor){
        visitor.visitTable(this);
    }
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTable(this);
    }
}