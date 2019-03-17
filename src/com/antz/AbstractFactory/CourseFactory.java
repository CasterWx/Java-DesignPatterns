package com.antz.AbstractFactory;

import com.antz.AbstractFactory.bean.Article;
import com.antz.AbstractFactory.bean.Video;

/**
 * @author CasterWx  AntzUhl
 * @site https://github.com/CasterWx
 * @company Henu
 * @create 2019-03-17-16:45
 */
public interface CourseFactory {
    public Video getVideo();
    public Article getArticle() ;
}
