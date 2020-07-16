package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void decorator(String improvedText, PoemDecorator poemDecorator) {

        String updatedText = poemDecorator.decorate(improvedText);
        System.out.println(updatedText);
    }

}
