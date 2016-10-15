package com.niit.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Model.Blog;

@Repository("blogDAO")
public interface BlogDAO {

	public void saveOrUpdate(Blog b);
	
	public Blog get(int bid);
	
	public void delete(int bid);
	
	public List<Blog> list();
	
	
	
	
}
