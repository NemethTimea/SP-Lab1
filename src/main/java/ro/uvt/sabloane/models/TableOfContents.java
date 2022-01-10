package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.Entity;

@Entity
public class TableOfContents extends BaseElement implements Visitee{
    private final String tbc_name;

    public TableOfContents(String tbc_name) {
        this.tbc_name = tbc_name;
    }
    public TableOfContents(TableOfContents tableOfContents)
    {
        tbc_name = tableOfContents.tbc_name;
    }
    public TableOfContents() {
        this("");
    }
    public String getTitle() { return tbc_name; }
    @Override
    public void accept(Visitor visitor){
    visitor.visitTableOfContents(this);
    }

    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTableOfContents(this);
    }
}
