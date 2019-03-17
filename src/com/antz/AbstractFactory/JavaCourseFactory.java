package com.antz.AbstractFactory;

import com.antz.AbstractFactory.bean.Article;
import com.antz.AbstractFactory.bean.JavaArticle;
import com.antz.AbstractFactory.bean.JavaVideo;
import com.antz.AbstractFactory.bean.Video;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-16:48
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
