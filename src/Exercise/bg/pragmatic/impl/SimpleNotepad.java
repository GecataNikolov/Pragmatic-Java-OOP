package Exercise.bg.pragmatic.impl;

import Exercise.bg.pragmatic.abstractions.Notepad;
import Exercise.bg.pragmatic.exceptions.DeviceNotStartedException;
import Exercise.bg.pragmatic.exceptions.NoSuchPageException;
import Exercise.bg.pragmatic.notepad.utils.Page;

import java.util.ArrayList;
import java.util.List;

public class SimpleNotepad implements Notepad {
    private List<Page> pages;

    public SimpleNotepad() {
        this.pages = new ArrayList<>();
    }


    @Override
    public void previewAllPages()  {
        for (Page curPage : pages) {
            System.out.println(curPage.preview());
        }
    }

    private Page findPage(int pageNumber) throws NoSuchPageException {
        for (Page curPage : pages) {
            if(curPage.getPageNumber() == pageNumber) {
                return curPage;
            }
        }

        throw new NoSuchPageException("No such page with number: " + pageNumber);
    }

    @Override
    public void deleteText(int pageNumber) throws NoSuchPageException{
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
    }

    @Override
    public void replaceText(int pageNumber, String text) throws NoSuchPageException{
        Page foundPage = findPage(pageNumber);
        foundPage.deleteText();
        foundPage.addText(text);
    }

    @Override
    public void createPage(String title, String text) {
        Page curPage = new Page();
        curPage.addText(text);
        curPage.setTitle(title);
        curPage.setPageNumber(this.pages.size() + 1);
        this.pages.add(curPage);
    }

}
