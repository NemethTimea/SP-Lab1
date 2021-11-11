package ro.uvt.sabloane.services;

import ro.uvt.sabloane.models.ImageContent;

public interface ImageLoader {
    default ImageContent load(String url){
        throw new UnsupportedOperationException("Don't load.");
    }
}
