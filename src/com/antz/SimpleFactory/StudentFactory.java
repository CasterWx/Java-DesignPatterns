package com.antz.SimpleFactory;

import com.antz.SimpleFactory.bean.Person;
import com.antz.SimpleFactory.bean.Student;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-15:37
 */
public class StudentFactory extends Factory {
    @Override
    public Person getPerson(){
        return new Student() ;
    }
}
