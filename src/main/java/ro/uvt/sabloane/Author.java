package ro.uvt.sabloane;

public class Author {

    private final String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public void print(){
        System.out.println("Author: " + this.name + " " + this.surname);
    }
}