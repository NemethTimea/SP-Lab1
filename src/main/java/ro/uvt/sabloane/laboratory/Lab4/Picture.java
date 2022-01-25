package ro.uvt.sabloane.laboratory.Lab4;

public interface Picture {
    default public String url(){
        throw new UnsupportedOperationException("Don't return url.");
    };
    default public Dimension dim(){
        throw new UnsupportedOperationException("Don't return dim.");
    };
    default public ImageContent content(){
        throw new UnsupportedOperationException("Don't return img content.");
    };
}
