package ro.uvt.sabloane.laboratory.Lab5;

public class Paragraph implements Element {
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

    @Override
    public void print() {
        System.out.println(alignStrategy.render(this,this.context));
    }
    public String getParagraph(){
        return this.text;
    }
    public void setParagraph(String newParagraph){
        this.text = newParagraph;
    }
}
