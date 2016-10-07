package com.niit.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Model.Blog;

@Repository("blogDAO")
public interface BlogDAO {

	public void saveOrUpdate(Blog user);
	public Blog get(int userid);
	
	public Blog getUserByname(String name);

	public void delete(int userid);
	public List<Blog> list();
	
	
	
	
}
