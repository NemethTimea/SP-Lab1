package ro.uvt.sabloane.laboratory.Lab6_7.services;

import ro.uvt.sabloane.laboratory.Lab6_7.models.ImageContent;

public interface ImageLoader {
    default ImageContent load(String url){
        throw new UnsupportedOperationException("Don't load.");
    }
}
