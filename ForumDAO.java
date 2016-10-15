package com.niit.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.Model.Forum;


@Repository("forumDAO")
public interface ForumDAO {

public void saveOrUpdate(Forum form);
	
	public Forum get(int fid);
	
	
	public void delete(int userid);
	
	public List<Forum> list();
	
	
	
}
