package com.project.shop.dao.ibatis;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.shop.dao.ProductDao;
import com.project.shop.model.Product;

@Repository //DAO라고 명시 (DAO를 스프링에서 인식시켜줌)
public class SqlMapProductDao implements ProductDao{
	
	@Autowired  
    private SqlSession sqlSession; 

    /**
     * 상품목록 
     * @param criteria
     * @return
     */
	@Override
	public List<Product> selectProductList(){
		return sqlSession.selectList("ProductSQL.selectProductList");
	}
	
}
