package org.example;

public class StringReplacer implements StringTransformer{
    private char replaced;
    private char replacing;
    public void execute(StringDrink drink){
        String replacer= drink.getText();
        drink.setText(replacer.replace(replaced,replacing));
    }
    public StringReplacer(char a , char b){
        this.replaced=a;
        this.replacing=b;
    }
}