package ro.uvt.sabloane.laboratory.Lab4;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
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
    public void print(){
        System.out.println("Book: " + this.title + "\n");
        System.out.println("Authors: ");
        for (Author a: this.authors){
            a.print();
        }
        System.out.println("\n");
        super.print();
    }
    public String getTitle(){
        return this.title;
    }
    public List<Author> getAuthors(){
        return this.authors;
    }
}
