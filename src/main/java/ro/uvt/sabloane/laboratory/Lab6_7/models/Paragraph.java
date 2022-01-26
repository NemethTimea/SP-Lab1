package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.AlignLeft;
import ro.uvt.sabloane.laboratory.Lab6_7.services.AlignStrategy;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;

public class Paragraph implements Element,Visitee {
    String text;

    public Paragraph(String text) {
        this.text = text;
    }
    private Context context = new Context(16);

    private AlignStrategy alignStrategy = new AlignLeft();
    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }
    public void setAlignStrategy(AlignStrategy align){
        this.alignStrategy = align;
    }

    public String getParagraph(){
        return this.text;
    }
    public void setParagraph(String newParagraph){
        this.text = newParagraph;
    }
    public Context getContext(){return this.context;}
    @Override
    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitParagraph(this);
    }
}
