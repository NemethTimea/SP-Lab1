package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section implements Visitee{
    List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }
    public void add(Element e){
        elementList.add(e);
    }
    public void addAuthor(Author newAuthor){
        authors.add(newAuthor);
    }
    public String getTitle(){
        return this.title;
    }
    public List<Author> getAuthors(){
        return this.authors;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitBook(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitBook(this);
    }
}
