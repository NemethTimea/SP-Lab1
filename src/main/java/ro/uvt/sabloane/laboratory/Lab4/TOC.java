package ro.uvt.sabloane.laboratory.Lab4;

public class TOC implements Element {
    String title;

    public TOC(String title) {
        this.title = title;
    }

    @Override
    public void print(){
        System.out.println(this.title);
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = title;
    }
}
