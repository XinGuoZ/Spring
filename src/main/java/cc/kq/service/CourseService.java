package cc.kq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cc.kq.po.Course;
@Transactional
public interface CourseService {
	
	public List<Course> seleteByclassid(int id);
	
	public void del(Course c);
	
	public void insert(Course c);
	
	public Integer selectByteaid(int id);
	
	//查询所有课表
	public List<Course> selectbyteaid(int id);

}
