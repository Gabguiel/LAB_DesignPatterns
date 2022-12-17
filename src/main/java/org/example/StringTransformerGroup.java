package org.example;

import java.awt.*;

public class StringTransformerGroup implements StringTransformer {
    private java.util.List<StringTransformer> transformers;

    public StringTransformerGroup(java.util.List<StringTransformer> transformers) {
        this.transformers = transformers;
    }
    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer transformer: transformers) {
            transformer.execute(drink);
        }
    }
}