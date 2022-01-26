package ro.uvt.sabloane.laboratory.Lab9.services;

import ro.uvt.sabloane.laboratory.Lab9.models.ImageContent;

public interface ImageLoader {
    default ImageContent load(String url){
        throw new UnsupportedOperationException("Don't load.");
    }
}
