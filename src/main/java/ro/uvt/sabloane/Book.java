package ro.uvt.sabloane;

import java.util.*;

public class Book {

    private final String title;
    private final Collection<Author> autori = new LinkedList<>();
    private final ArrayList<Chapter> chapters = new ArrayList<>();

    public Book(String title){
        this.title = title;
    }

    public void addAuthor(Author autor){
        autori.add(autor);
    }

    public void removeAuthor(Author autor){
        autori.remove(autor);
    }

    public Collection<Author> getAuthors(){
        return Collections.unmodifiableCollection(autori);
    }

    public int createChapter(String title){
        chapters.add(new Chapter(title));
        return chapters.size() - 1;
    }
    public Chapter getChapter(Integer pozition){
        return chapters.get(pozition);
    }
    public void print(){
        System.out.println("Book: " + this.title);
        for (Author a : this.autori){
            a.print();
        }
        for (Chapter c : this.chapters){
            c.print();
        }
    }
}