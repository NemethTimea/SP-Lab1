package ro.uvt.sabloane.models;

import ro.uvt.sabloane.services.AlignLeft;
import ro.uvt.sabloane.services.AlignStrategy;
import ro.uvt.sabloane.services.Context;

public class Paragraph implements Element,Visitee{
    private String text;
    private Context context = new Context(16);;

    private AlignStrategy alignStrategy = new AlignLeft();

    public Paragraph(String paragraph){
        this.text = paragraph;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy = alignStrategy;
    }

    public void setContext(Context context){
        this.context = context;
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

    public void setText(String newtext){
        this.text = newtext;
    }

    public void accept(Visitor visitor){
        visitor.visitParagraph(this);
    }
}