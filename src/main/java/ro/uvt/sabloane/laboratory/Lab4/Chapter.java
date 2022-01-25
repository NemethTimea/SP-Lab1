package ro.uvt.sabloane.laboratory.Lab4;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    String title;
    List<SubChapter> subChapterList = new ArrayList<>();

    public Chapter(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }
    public int createSubChapter(String newTitle){
        subChapterList.add(new SubChapter(newTitle));
        return subChapterList.size() - 1;
    }
    public SubChapter getSubChapter(int index){
        return subChapterList.get(index);
    }
}
