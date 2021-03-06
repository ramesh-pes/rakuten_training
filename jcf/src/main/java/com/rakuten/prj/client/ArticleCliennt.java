package com.rakuten.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rakuten.prj.entity.Article;

public class ArticleCliennt {

	public static void main(String[] args) {
	    List<Article> articles = new ArrayList<>();
        articles.add(new Article("NoDBA",561,"bliki",Arrays.asList("nosql","people","orm")));
        articles.add(new Article("Infodesk",1145,"bliki",Arrays.asList("nosql","writing")));
        articles.add(new Article("OrmHate",1718,"bliki",Arrays.asList("nosql","orm")));
        articles.add(new Article("ruby",1313,"article",Arrays.asList("ruby")));
        articles.add(new Article("DDD_Aggregate",482,"bliki",Arrays.asList("nosql","ddd")));
        
        System.out.println((double)articles.stream().map(p->p.getWords()).reduce(0,(u,v)->u+v));
        articles.stream().map(p->p.getTags()).forEach(System.out::println);
        
        //flatMap and Distinct
        articles.stream().flatMap(p->p.getTags().stream()).distinct().forEach(System.out::println);
	}

}
