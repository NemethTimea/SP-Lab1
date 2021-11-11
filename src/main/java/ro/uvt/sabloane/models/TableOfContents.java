package ro.uvt.sabloane.models;

public class TableOfContents implements Visitee{

    public void accept(Visitor visitor){
    visitor.visitTableOfContents(this);
    }
}
