package Exercise.bg.pragmatic.impl;

import Exercise.bg.pragmatic.exceptions.DeviceNotStartedException;
import Exercise.bg.pragmatic.exceptions.NoSuchPageException;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String password) {
        this.password = password;
    }

    private boolean checkPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dai parola be: ");
        for (int i = 0; i < 3; i++) {
            String enteredPassword = scan.nextLine();
            if(enteredPassword.equals(this.password)) {
                return true;
            } else {
                if(i == 2) {
                    break;
                }
                System.out.println("Try again! Dai parola PAK:");
            }
        }
        return false;
    }


    @Override
    public void previewAllPages() {
        if(checkPassword()) {
            super.previewAllPages();
        } else {
            System.out.println("Not authorized for operation previewAllPages");
        }
    }

    @Override
    public void deleteText(int pageNumber) throws NoSuchPageException {
        if(checkPassword()) {
            super.deleteText(pageNumber);
        } else {
            System.out.println("Not authorized for operation deleteText");
        }
    }

    @Override
    public void replaceText(int pageNumber, String text) throws NoSuchPageException {
        if (checkPassword()) {
            super.replaceText(pageNumber, text);
        } else {
            System.out.println("Not authorized for operation replaceText");
        }
    }

    @Override
    public void createPage(String title, String text) {
        if (checkPassword()) {
            super.createPage(title, text);
        } else {
            System.out.println("Not authorized for operation createPage");
        }
    }
}
