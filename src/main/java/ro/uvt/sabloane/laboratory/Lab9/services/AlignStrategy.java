package ro.uvt.sabloane.laboratory.Lab9.services;

import ro.uvt.sabloane.laboratory.Lab9.models.Context;
import ro.uvt.sabloane.laboratory.Lab9.models.Paragraph;

public interface AlignStrategy {
    default String render(Paragraph paragraph, Context context){
        throw new UnsupportedOperationException("Don't add.");
    }
}
