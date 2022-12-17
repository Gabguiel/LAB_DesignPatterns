package org.example;
import org.example.StringDrink;
import java.awt.*;
import java.util.List;

public class StringRecipe {
    private List<StringTransformer> transformerList;
    public StringRecipe(java.util.List<StringTransformer> l) {
        this.transformerList=l;
    }

    public void mix(StringDrink drink) {
        for(StringTransformer i: transformerList){
            i.execute(drink);
        }
    }
}
