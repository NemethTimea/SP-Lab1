package ro.uvt.sabloane.laboratory.Lab9.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab9.services.BookSaveVisitor;

public interface Visitee {
    default void accept(Visitor visitor){
        throw new UnsupportedOperationException("don't visit.");
    };
    default JSONObject accept(BookSaveVisitor booksavevisitor){
        throw new UnsupportedOperationException("don't visit.");
    };
}
