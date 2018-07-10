package cc.kq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.kq.dao.CourseMapper;
import cc.kq.dao.StudentMapper;
import cc.kq.po.Student;
import cc.kq.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	StudentMapper studentMapper;
	@Autowired
	CourseMapper courseMapper;
	@Override
	public List<Student> findall(Integer classid) {
		// TODO Auto-generated method stub
		return studentMapper.selectByClassid(classid);
	}

	@Override
	public int insert(Student stu) {
		// TODO Auto-generated method stub
		return studentMapper.insert(stu);
	}

	@Override
	public Student findbyid(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(id);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(Student stu) {
		// TODO Auto-generated method stub
		studentMapper.updateByPrimaryKey(stu);
	}

	@Override
	public List<Student> findbyclassid(Integer classid) {
		// TODO Auto-generated method stub
		return studentMapper.selectByClassid(classid);
	}

	@Override
	public void addlevel(String stunum) {
		// TODO Auto-generated method stub
		studentMapper.addlevel(stunum);
	}

	@Override
	public void addattendance(String stunum) {
		// TODO Auto-generated method stub
		studentMapper.addattendance(stunum);
	}

	@Override
	public List<Student> login(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.login(student);
	}

	public void updatepwd(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updatepwd(student);
	}

	
}
