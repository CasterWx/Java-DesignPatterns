package com.antz.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new StudentFactory() ;
        Factory factory1 = new TeacherFactory() ;

        factory.getPerson().printWork();
        factory1.getPerson().printWork();
    }
}
