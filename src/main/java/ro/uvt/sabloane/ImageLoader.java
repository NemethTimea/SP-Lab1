package ro.uvt.sabloane;

public interface ImageLoader {
    default ImageContent load(String url){
        throw new UnsupportedOperationException("Don't load.");
    }
}
