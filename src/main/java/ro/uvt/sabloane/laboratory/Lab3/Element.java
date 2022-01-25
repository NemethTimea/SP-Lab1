package ro.uvt.sabloane.laboratory.Lab3;

public interface Element {
    default void add(Element element){
        throw new UnsupportedOperationException("Don't add.");
    };
    default void remove(Element element){
        throw new UnsupportedOperationException("Don't remove.");
    };
    default Element get(Integer index){
        throw new UnsupportedOperationException("Don't get.");
    };
    void print();
}
