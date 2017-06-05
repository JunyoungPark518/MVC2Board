package serviceImpl;

import java.util.Iterator;
import java.util.List;

import dao.DAO;
import daoImpl.DAOImpl;
import domain.Article;
import service.Service;


public class ServiceImpl implements Service{
	private DAO dao;
	private static ServiceImpl instance = new ServiceImpl();
	public static ServiceImpl getInstance() { return instance; }
	private List<Article> list;
	Iterator<Article> it;
	
	public ServiceImpl() {
		try { list = DAOImpl.getInstance().selectAll(); } catch(Exception e) {}
		it = list.iterator();
		dao = DAOImpl.getInstance();
	}
	
	@Override
	public int addArticle(Article a) throws Exception {
		return dao.insert(a);
	}

	@Override
	public Article findOne(Article a) throws Exception {
		return dao.selectBySeq(a);
	}

	@Override
	public List<Article> findSome(Article a) throws Exception {
		return dao.selectSome(a);
	}

	@Override
	public List<Article> findAll() throws Exception {
		return dao.selectAll();
	}

	@Override
	public int update(Article a) throws Exception {
		return dao.update(a);
	}

	@Override
	public int delete(Article a) throws Exception {
		return dao.delete(a);
	}

	@Override
	public int count() throws Exception {
		return dao.count();
	}

}
