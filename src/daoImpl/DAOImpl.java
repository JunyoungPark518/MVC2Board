package daoImpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import constants.Database;
import dao.DAO;
import domain.Article;
import enums.Vendor;
import factory.DatabaseFactory;

public class DAOImpl implements DAO {
	public static DAOImpl getInstance() { return new DAOImpl(); }
	@Override
	public int insert(Article a) throws Exception {
		return DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeUpdate(
				String.format("INSERT INTO Article(id, title, content, regdate) VALUES('%s','%s','%s','%s')", 
						a.getId(), a.getTitle(), a.getContent(), a.getRegdate())
				);
	}

	@Override
	public Article selectBySeq(Article a) throws Exception {
		Article temp = new Article();
		ResultSet rs = DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(
				String.format("SELECT * FROM Article WHERE seq = '%s'", a.getSeq())
				);
		if(rs.next()){
			temp.setSeq(rs.getString("seq"));
			temp.setId(rs.getString("id"));
			temp.setTitle(rs.getString("title"));
			temp.setContent(rs.getString("content"));
			temp.setRegdate(rs.getString("regdate"));
			temp.setReadCount(rs.getString("readCount"));
		}
		return temp;
	}

	@Override
	public List<Article> selectSome(Article a) throws Exception {
		List<Article> list = new ArrayList<Article>();
		ResultSet rs = null;
		if(a.getId()!=null){
			rs = DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(
					String.format("SELECT * FROM Article WHERE id like '%s'", "%"+a.getId()+"%"));
		} else if(a.getTitle()!=null){
			rs = DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(
					String.format("SELECT * FROM Article WHERE title like '%s'", "%"+a.getTitle()+"%"));
		} else if(a.getContent()!=null){
			rs = DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(
					String.format("SELECT * FROM Article WHERE content like '%s'", "%"+a.getContent()+"%"));
		}
		while(rs.next()){
			Article temp = new Article();
			temp.setSeq(rs.getString("seq"));
			temp.setId(rs.getString("id"));
			temp.setTitle(rs.getString("title"));
			temp.setContent(rs.getString("content"));
			temp.setRegdate(rs.getString("regdate"));
			temp.setReadCount(rs.getString("readCount"));
			list.add(temp);
		}
		return list;
	}

	@Override
	public List<Article> selectAll() throws Exception {
		List<Article> list = new ArrayList<Article>();
		ResultSet rs = DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery(String.format("SELECT * FROM Article"));
		while(rs.next()){
			Article temp = new Article();
			temp.setSeq(rs.getString("seq"));
			temp.setId(rs.getString("id"));
			temp.setTitle(rs.getString("title"));
			temp.setContent(rs.getString("content"));
			temp.setRegdate(rs.getString("regdate"));
			temp.setReadCount(rs.getString("readCount"));
			list.add(temp);
		}
		return list;
	}

	@Override
	public int update(Article a) throws Exception {
		Article temp = selectBySeq(a);
		if(temp!=null){
			return DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeUpdate(
					String.format("UPDATE Article SET title='%s', content='%s', regdate='%s'", 
							a.getTitle().equals(temp.getTitle()) && a.getTitle()!=null ? a.getTitle() : temp.getTitle(),  
							a.getContent().equals(temp.getContent()) && a.getContent()!=null ? a.getContent() : temp.getContent(),  
							a.getRegdate().equals(temp.getRegdate()) && a.getRegdate()!=null ? a.getRegdate() : temp.getRegdate()  
					));
		}
		return 0;
	}

	@Override
	public int delete(Article a) throws Exception {
		return DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeUpdate(
				String.format("DELETE FROM Article WHERE seq = '%s'", a.getSeq())
				);
	}

	@Override
	public int count() throws Exception {
		ResultSet rs = DatabaseFactory.create(Vendor.MYSQL, Database.USERNAME, Database.PASSWORD).getConnection().createStatement().executeQuery("SELECT COUNT(*) AS COUNT FROM Article");
		if(rs.next()) {
			return Integer.parseInt(rs.getString("COUNT"));
		}
		return 0;
	}

}
