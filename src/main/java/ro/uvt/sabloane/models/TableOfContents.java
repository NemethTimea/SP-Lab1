package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

public class TableOfContents implements Visitee{
    @Override
    public void accept(Visitor visitor){
    visitor.visitTableOfContents(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitTableOfContents(this);
    }
}
