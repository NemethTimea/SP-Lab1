package ro.uvt.sabloane;

import java.util.ArrayList;
import java.util.List;

public class Chapter {

    private String title;
    private List<SubChapter> subchapters = new ArrayList<>();

    public Chapter(String title){
        this.title = title;
    }
    public int createSubChapter(String title){
        subchapters.add(new SubChapter(title));
        return subchapters.size() - 1;
    }
    public SubChapter getSubChapter(Integer index){
        return subchapters.get(index);
    }
    public void print(){
        System.out.println("Chapter: " + this.title);
        for (SubChapter sbc : this.subchapters){
            sbc.print();
        }
    }
}
