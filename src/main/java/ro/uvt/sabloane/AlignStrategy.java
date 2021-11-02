package ro.uvt.sabloane;

public interface AlignStrategy {
    default void render(Paragraph paragraph, Context context){
        throw new UnsupportedOperationException("Don't add.");
    }
}
