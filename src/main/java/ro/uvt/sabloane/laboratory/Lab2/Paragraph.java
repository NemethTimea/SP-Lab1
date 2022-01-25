package ro.uvt.sabloane.laboratory.Lab2;

public class Paragraph implements Element{
    String text;

    public Paragraph(String text) {
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println(this.text);
    }
    public String getParagraph(){
        return this.text;
    }
    public void setParagraph(String newParagraph){
        this.text = newParagraph;
    }
}
