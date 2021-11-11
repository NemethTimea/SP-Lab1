package ro.uvt.sabloane.services;

public class Context {
    private Integer nrCharacterOnLine;

    public Context(Integer nrCharacterOnLine){
        this.nrCharacterOnLine = nrCharacterOnLine;
    }
    public Integer getNrWordOnLine(){
        return this.nrCharacterOnLine;
    }
}