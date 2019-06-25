package Exercise.bg.pragmatic.demo;

import Exercise.bg.pragmatic.abstractions.IElectronicDevice;
import Exercise.bg.pragmatic.abstractions.Notepad;
import Exercise.bg.pragmatic.exceptions.NoSuchPageException;
import Exercise.bg.pragmatic.impl.ElectronicSecuredNotepad;
import Exercise.bg.pragmatic.impl.SecuredNotepad;
import Exercise.bg.pragmatic.impl.SimpleNotepad;

public class Demo {
    public static void main(String[] args) {

        ElectronicSecuredNotepad elSecuredNotepad = new ElectronicSecuredNotepad("pass", true);
        elSecuredNotepad.createPage("Title1", "Text1");
        elSecuredNotepad.start();
        elSecuredNotepad.createPage("Title2", "Text2");
        elSecuredNotepad.createPage("Title3" , "Text3");
        elSecuredNotepad.stop();
        elSecuredNotepad.createPage("Title4" , "Text4");

        elSecuredNotepad.start();
        elSecuredNotepad.previewAllPages();

        System.out.println("--------------------");

        try {
            elSecuredNotepad.deleteText(2);
        } catch (NoSuchPageException e) {
            e.getMessage();
            System.out.println("Try with some valid page number");
        }

        elSecuredNotepad.previewAllPages();
        System.out.println("---------------------------");

        try {
            elSecuredNotepad.replaceText(3,"changedText3");
        } catch (NoSuchPageException e) {
            e.getMessage();
            System.out.println("Try with some valid page number");
        }

        elSecuredNotepad.previewAllPages();


        Notepad securedNotepad = new SecuredNotepad("parola");

        securedNotepad.createPage("Title1", "Text1");
        securedNotepad.createPage("Title2", "Text2");
        securedNotepad.createPage("Title3", "Text3");
        securedNotepad.createPage("Title4", "Text4");
        securedNotepad.createPage("Title5", "Text5");

        securedNotepad.previewAllPages();

        System.out.println("--------------------------------");

        try {
            securedNotepad.deleteText(3);
        } catch (NoSuchPageException e) {
            e.printStackTrace();
            System.out.println("Try with some valid page number");
        }
        securedNotepad.previewAllPages();

        System.out.println("--------------------------------");

        try {
            securedNotepad.replaceText(3, "nqkyv drug text");
        } catch (NoSuchPageException e) {
            e.printStackTrace();
            System.out.println("Try with some valid page number");
        }


        securedNotepad.previewAllPages();


        Notepad simpleNotepad = new SimpleNotepad();
        simpleNotepad.createPage("Title1", "Text1");
        simpleNotepad.createPage("Title2", "Text2");
        simpleNotepad.createPage("Title3", "Text3");
        simpleNotepad.createPage("Title4", "Text4");
        simpleNotepad.createPage("Title5", "Text5");

        simpleNotepad.previewAllPages();

        try {
            simpleNotepad.deleteText(3);
        } catch (NoSuchPageException e) {
            e.printStackTrace();
            System.out.println("Please try again with valid page number");
        }
        System.out.println("======================================");
        simpleNotepad.previewAllPages();

        System.out.println("=======================================");

        try {
            simpleNotepad.replaceText(4, "Replaced4");
        } catch (NoSuchPageException e) {
            e.printStackTrace();
            System.out.println("Please try again with valid page number");
        }
        simpleNotepad.previewAllPages();

    }
}
