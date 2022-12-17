package org.example;

public class StringDrink {
    private String text_;

    public StringDrink( String s ){
        this.text_=s;
    }

    public void setText(String new_s) {
        this.text_=new_s;
    }

    public String getText() {
        return text_;
    }
}