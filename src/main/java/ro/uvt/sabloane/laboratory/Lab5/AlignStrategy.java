package ro.uvt.sabloane.laboratory.Lab5;

public interface AlignStrategy {
    default String render(Paragraph paragraph, Context context){
        throw new UnsupportedOperationException("Don't add.");
    }
}
