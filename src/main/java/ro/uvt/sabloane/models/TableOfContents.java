package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TableOfContents extends BaseElement implements Visitee{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private final String name;

    public TableOfContents(String newName) {
        this.name = newName;
    }
    public TableOfContents(TableOfContents tableOfContents)
    {
        name = tableOfContents.name;
    }
    public TableOfContents() {
        this("");
    }

    public String getTitle() { return name; }

    @Override
    public void accept(Visitor visitor){
    visitor.visitTableOfContents(this);
    }

    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTableOfContents(this);
    }
}
