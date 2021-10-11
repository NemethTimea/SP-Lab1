package ro.uvt.sabloane;

public class Paragraph implements Element{
    private String paragraph;

    public Paragraph(String paragraph){
        this.paragraph = paragraph;
    }
    public void print(){
        System.out.println("Paragraph: " + this.paragraph);
    }
}