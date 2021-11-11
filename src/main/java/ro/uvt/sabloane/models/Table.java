package ro.uvt.sabloane.models;

public class Table implements Element, Visitee{
    private String name;

    public Table(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void accept(Visitor visitor){
        visitor.visitTable(this);
    }
}