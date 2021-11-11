package ro.uvt.sabloane.services;

import ro.uvt.sabloane.models.Paragraph;

public interface AlignStrategy {
    default String render(Paragraph paragraph, Context context){
        throw new UnsupportedOperationException("Don't add.");
    }
}
