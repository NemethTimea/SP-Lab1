package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author implements Visitee{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String surname;


    public Author(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;

    }

    public Author(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setSurname( String newSurname){
        this.surname = newSurname;
    }
    public int getId(){
        return this.id;
    }

    public String getSurname(){
        return surname;
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