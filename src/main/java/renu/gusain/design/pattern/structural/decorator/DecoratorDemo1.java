package renu.gusain.design.pattern.structural.decorator;

public class DecoratorDemo1 {
    public static void main(String[] args) {
        MagicString s=new MagicString("hello");
        System.out.println(s.toString()+" has "+ s.getNoOfVowel()+" vowel" );
    }
}
