package ro.uvt.sabloane.laboratory.Lab6_7.models;

import java.awt.image.BufferedImage;

public class ImageContent {
    BufferedImage image;

    public ImageContent(BufferedImage image){
        if(this.image == null) {
            this.image = image;
        }
    }

    public BufferedImage getBufferedImage(){
        return image;
    }
}
