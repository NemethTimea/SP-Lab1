package ro.uvt.sabloane.laboratory.Lab2;

public class Author {
    String name;

    public Author(String name) {
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
