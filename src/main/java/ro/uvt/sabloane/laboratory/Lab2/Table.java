package ro.uvt.sabloane.laboratory.Lab2;

public class Table implements Element{
    String title;

    public Table(String title) {
        this.title = title;
    }
    @Override
    public void print() {
        System.out.println(this.title);
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
}
