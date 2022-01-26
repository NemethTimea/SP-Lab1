package ro.uvt.sabloane.laboratory.Lab6_7.models;

public class Context {
    private Integer nrCharacterOnLine;

    public Context(Integer nrCharacterOnLine){
        this.nrCharacterOnLine = nrCharacterOnLine;
    }
    public Integer getNrWordOnLine(){
        return this.nrCharacterOnLine;
    }
}
