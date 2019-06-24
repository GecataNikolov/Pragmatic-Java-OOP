package Exercise.bg.pragmatic.notepad.utils;

/**
 * This class represents the pages that exist
 * within our notepads
 */
public class Page {
    private String title = "";
    private String text = "";
    private int pageNumber;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }


    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Adds text to the text of the the page. It's being add
     * at the end of the previously existing text on the page.
     *
     * @param text the text that you want to be added to this page
     *
     */
    public void addText(String text) {
        this.text = this.text + text;
    }

    /**
     * Gives a preview of the page you invoke it for
     * with the title and the text on a new line
     *
     * @return the pagenumber, the title and the text on the next line
     */
    public String preview() {
        return this.pageNumber + "\n" + this.title + "\n" + this.text;
    }

    /**
     * Deletes the whole text of the page you invoke this method for
     */
    public void deleteText() {
        this.text = "";
    }
}
