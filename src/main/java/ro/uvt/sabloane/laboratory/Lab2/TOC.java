package ro.uvt.sabloane.laboratory.Lab2;

public class TOC {
    String title;

    public TOC(String title) {
        this.title = title;
    }
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
