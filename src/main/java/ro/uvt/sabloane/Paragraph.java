package ro.uvt.sabloane;

public class Paragraph implements Element{
    private String text;
    private AlignStrategy alignStrategy = new AlignLeft();
    public Paragraph(String paragraph){
        this.text = paragraph;
    }
    public void setAlignStrategy(AlignStrategy alignStrategy){
        Context context = new Context(4);
        this.alignStrategy = alignStrategy;
        this.alignStrategy.render(this,context);
    }
    public String getText(){
        return text;
    }
    public void setText(String newtext){
        this.text = newtext;
    }
    public void print(){
        System.out.println("Paragraph:\n" + this.text);
    }
}