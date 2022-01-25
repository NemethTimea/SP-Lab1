package ro.uvt.sabloane.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.json.JSONObject;
import ro.uvt.sabloane.services.AlignLeft;
import ro.uvt.sabloane.services.AlignStrategy;
import ro.uvt.sabloane.services.BookSaveVisitor;
import ro.uvt.sabloane.services.Context;

import javax.persistence.*;

@Entity
public class Paragraph implements Element,Visitee{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String text;

    @Transient
    @JsonIgnore
    private Context context = new Context(16);
    @Transient
    @JsonIgnore
    private AlignStrategy alignStrategy = new AlignLeft();

    public Paragraph(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Paragraph(String paragraph){
        this.text = paragraph;
    }
    public Paragraph(){}

    public AlignStrategy getAlignStrategy(){
        return alignStrategy;
    }

    public Context getContext(){
        return context;
    }

    public String getText(){
        return text;
    }

    public int getId(){ return this.id; }

    public void setText(String newText) { this.text = newText; }

    @Override
    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitParagraph(this);
    }
}