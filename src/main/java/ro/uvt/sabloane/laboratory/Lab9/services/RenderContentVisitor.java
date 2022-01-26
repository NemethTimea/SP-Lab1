package ro.uvt.sabloane.laboratory.Lab9.services;

import ro.uvt.sabloane.laboratory.Lab9.models.*;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class RenderContentVisitor implements Visitor<Void> {

    @Override
    public Void visitBook(Book book) {
        System.out.println("Book: " + book.getTitle());
        for (Author a : book.getAuthors()){
            a.accept(this);
        }
        for (Element e : book.getElementList()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitAuthor(Author author) {
        System.out.println("Author: " + author.getName());
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        for (Element e : section.getElementList()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitTOC(TOC tableofcontents) {
        System.out.println("TableOfContent: " + tableofcontents.getTitle());
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        System.out.println(paragraph.getAlignStrategy().render(paragraph,paragraph.getContext()));
        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageproxy) {
        imageproxy.loadImage().accept(this);
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        if (image.content() != null ){
            BufferedImage buffered_img = image.content().getBufferedImage();
            if (buffered_img != null){
                JLabel picLabel = new JLabel(new ImageIcon(buffered_img));
                JPanel jPanel = new JPanel();
                jPanel.add(picLabel);
                JFrame f = new JFrame();
                f.setSize(new Dimension(buffered_img.getWidth(), buffered_img.getHeight()));
                f.add(jPanel);
                f.setVisible(true);
            }
        }
        return null;
    }

    @Override
    public Void visitTable(Table table) {
        System.out.println("Table with Title: " + table.getTitle());
        return null;
    }
}
