package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;

public interface Visitee {
    default void accept(Visitor visitor){
        throw new UnsupportedOperationException("don't visit.");
    };
    default JSONObject accept(BookSaveVisitor booksavevisitor){
        throw new UnsupportedOperationException("don't visit.");
    };
}
