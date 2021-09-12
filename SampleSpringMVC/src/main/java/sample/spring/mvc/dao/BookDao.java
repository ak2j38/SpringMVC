package sample.spring.mvc.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDao {
	
	@Autowired
	SqlSessionTemplate sql;
	
	public int insert(Map<String, Object> map) {
		return this.sql.insert("book.insert", map);
	}
	
	public Map<String, Object> selectDetail(Map<String, Object> map){
		return this.sql.selectOne("book.select_detail", map);
	}
	
	public int update(Map<String, Object> map) {
		return this.sql.update("book.update", map);
	}
	
	public int delete(Map<String, Object> map) {
		return this.sql.delete("book.delete", map);
	}
	
	public List<Map<String, Object>> selectList(Map<String, Object> map){
		return this.sql.selectList("book.select_list", map);
	}

}
