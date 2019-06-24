package Exercise.bg.pragmatic.impl;

import Exercise.bg.pragmatic.abstractions.IElectronicDevice;
import Exercise.bg.pragmatic.exceptions.NoSuchPageException;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
    private boolean isStarted;

    public ElectronicSecuredNotepad(String password, boolean isStarted) {
        super(password);
        this.isStarted= isStarted;
    }


    @Override
    public void previewAllPages() {
        if(isStarted()) {
            super.previewAllPages();
        }
        else {
            System.out.println(("The electronic secured notepad is not started!"));

        }
    }

    @Override
    public void deleteText(int pageNumber) throws NoSuchPageException {
        boolean checkIfStarted = isStarted();
        if (checkIfStarted) {
            super.deleteText(pageNumber);
        } else {
            System.out.println(("The electronic secured notepad is already started!"));
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws NoSuchPageException {

        if (isStarted()) {
            super.replaceText(pageNumber, text);
        } else {
            System.out.println(("The electronic secured notepad is not started!"));

        }
    }

    @Override
    public void createPage(String title, String text) {

        if (isStarted()) {
            super.createPage(title, text);
        } else {
            System.out.println(("The electronic secured notepad is not started!"));
        }
    }

    @Override
    public void start() {
        if(this.isStarted){
            System.out.println("The electronic secured notepad is already started!");
        }else {
            this.isStarted = true;
        }
    }

    @Override
    public void stop() {
        if (this.isStarted){
        this.isStarted = false;
        }else {
            System.out.println("The electronic secured notepad is already stopped! ");
        }
    }

    @Override
    public boolean isStarted() {
        if (this.isStarted){
            return true;
        }
        return false;
    }
}
