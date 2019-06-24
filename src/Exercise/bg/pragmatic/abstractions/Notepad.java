package Exercise.bg.pragmatic.abstractions;

import Exercise.bg.pragmatic.exceptions.NoSuchPageException;

/**
 * Represents notepad
 */
public interface Notepad {
    /**
     * Creates a new page in your notepad
     *
     * @param title the title for the newly created page
     * @param text the text for the newly created page
     */
    void createPage(String title, String text) ;

    /**
     * Repalces the text of some page
     *
     * @param pageNumber the number of the page which text needs to be replaced
     * @param text the text to be replaced with
     */
    void replaceText(int pageNumber, String text) throws NoSuchPageException;

    /**
     * Deletes the text from a page with provided number
     *
     * @param pageNumber the number of the page which text will be deleted
     *
     * @throws NoSuchPageException if there is no page with such number
     */
    void deleteText(int pageNumber) throws NoSuchPageException;

    /**
     * Show all the pages in the notepad on your screen
     */
    void previewAllPages();
}
