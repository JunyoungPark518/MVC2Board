package service;

import java.util.List;

import domain.Article;

public interface Service {
	public int addArticle(Article a) throws Exception;
	public Article findOne(Article a) throws Exception;
	public List<Article> findSome(Article a) throws Exception;
	public List<Article> findAll() throws Exception;
	public int update(Article a) throws Exception;
	public int delete(Article a) throws Exception;
	public int count() throws Exception;
}
