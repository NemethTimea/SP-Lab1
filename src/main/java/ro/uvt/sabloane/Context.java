package ro.uvt.sabloane;

public class Context {
    private Integer nrcharacter;

    public Context(Integer nrcharacter){
        this.nrcharacter = nrcharacter;
    }
    public Integer getNrWordOnLine(){
        return this.nrcharacter;
    }
}
