package ro.uvt.sabloane.laboratory.Lab5;

public interface ImageLoader {
    default ImageContent load(String url){
        throw new UnsupportedOperationException("Don't load.");
    }
}
