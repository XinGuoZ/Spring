package cc.kq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cc.kq.po.Student;

/**
 * @author master
 * Date 2017年11月1日
 * school :九江职业大学
 *<p>班级表</p>
 */
@Transactional
public interface StudentService {
	
	public List<Student> findall(Integer classid);
  
	public int insert(Student stu);
	
	public Student findbyid(Integer id);
	
	public void del(Integer id);
	
	public void update(Student stu);
	
	public List<Student> findbyclassid(Integer classid);
	
	public void addlevel(String stunum);
	
	public void addattendance(String stunum);

	public List<Student> login(Student student);

	public void updatepwd(Student student);
}
