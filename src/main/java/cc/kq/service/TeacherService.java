package cc.kq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cc.kq.po.Teacher;

/**
 * @author master
 * Date 2017年11月1日
 * school :九江职业大学
 *<p>班级表</p>
 */
@Transactional
public interface TeacherService {
	
	public List<Teacher> findall();
  
	public int insert(Teacher tea);
	
	public Teacher findbyid(Integer id);
	
	public void del(Integer id);
	
	public void update(Teacher tea); 
	
	public Teacher login(Teacher tea);

}
