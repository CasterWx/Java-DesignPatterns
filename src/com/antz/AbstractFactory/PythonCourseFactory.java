package com.antz.AbstractFactory;

import com.antz.AbstractFactory.bean.Article;
import com.antz.AbstractFactory.bean.PythonArticle;
import com.antz.AbstractFactory.bean.PythonVideo;
import com.antz.AbstractFactory.bean.Video;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-16:56
 */
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
