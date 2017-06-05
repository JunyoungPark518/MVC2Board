package dao;

import java.util.List;

import domain.Article;


public interface DAO {
	public int insert(Article a) throws Exception;
	public Article selectBySeq(Article a) throws Exception;
	public List<Article> selectSome(Article a) throws Exception;
	public List<Article> selectAll() throws Exception;
	public int update(Article a) throws Exception;
	public int delete(Article a) throws Exception;
	public int count() throws Exception;
}
