package org.example;

public class StringCaseChanger implements StringTransformer{
    public void execute(StringDrink drink){
        char c;
        StringBuffer caseChanged = new StringBuffer(drink.getText().length());
        for(int i=0; i<drink.getText().length();i++ ){
            if(Character.isLowerCase(drink.getText().charAt(i))){
                c=Character.toUpperCase(drink.getText().charAt(i));
            }
            else {
                c=Character.toLowerCase(drink.getText().charAt(i));
            }
            caseChanged.append(c);
        }
        drink.setText(caseChanged.toString());
    }
}