package ro.uvt.sabloane;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class ImageContent {
    BufferedImage image;

    public ImageContent(BufferedImage image){
        this.image = image;
    }

    public void print(){
        JLabel picLabel = new JLabel(new ImageIcon(image));
        JPanel jPanel = new JPanel();
        jPanel.add(picLabel);
        JFrame f = new JFrame();
        f.setSize(new Dimension(image.getWidth(), image.getHeight()));
        f.add(jPanel);
        f.setVisible(true);
    }
}
