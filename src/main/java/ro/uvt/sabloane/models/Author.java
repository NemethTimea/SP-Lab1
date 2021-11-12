package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

public class Author implements Visitee{

    private final String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
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