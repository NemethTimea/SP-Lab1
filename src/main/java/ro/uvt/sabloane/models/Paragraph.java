package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.AlignLeft;
import ro.uvt.sabloane.services.AlignStrategy;
import ro.uvt.sabloane.services.BookSaveVisitor;
import ro.uvt.sabloane.services.Context;

public class Paragraph implements Element,Visitee{
    private String text;
    private Context context = new Context(16);;

    private AlignStrategy alignStrategy = new AlignLeft();

    public Paragraph(String paragraph){
        this.text = paragraph;
    }

    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }

    public Context getContext(){
        return context;
    }

    public String getText(){
        return text;
    }

    @Override
    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitParagraph(this);
    }
}