package com.kodilla.stream.beutifier;

public class PoemBeutifier{

   public String beautify(String txt, PoemDecorator poemDecorator){
       String result =  poemDecorator.decorate(txt);
       System.out.println("Bang! " + result);
       return result;
   }
}
