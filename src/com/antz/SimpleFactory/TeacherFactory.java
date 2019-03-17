package com.antz.SimpleFactory;

import com.antz.SimpleFactory.bean.Person;
import com.antz.SimpleFactory.bean.Teacher;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-15:38
 */
public class TeacherFactory extends Factory {
    @Override
    public Person getPerson() {
        return new Teacher() ;
    }
}
