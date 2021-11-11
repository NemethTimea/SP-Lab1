package ro.uvt.sabloane.models;

public class Author implements Visitee{

    private final String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void accept(Visitor visitor){
        visitor.visitAuthor(this);
    }
}