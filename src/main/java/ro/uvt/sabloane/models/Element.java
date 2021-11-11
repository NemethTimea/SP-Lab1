package ro.uvt.sabloane.models;

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
}