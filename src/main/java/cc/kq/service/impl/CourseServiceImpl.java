package cc.kq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.kq.dao.CourseMapper;
import cc.kq.po.Course;
import cc.kq.service.CourseService;
import cc.kq.utils.InitTime;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseMapper courseMapper;
	
	@Override
	public List<Course> seleteByclassid(int id) {
		// TODO Auto-generated method stub
		return courseMapper.selectByClassid(id);
	}

	@Override
	public void del(Course c) {
		// TODO Auto-generated method stub

		courseMapper.del(c);
	}

	@Override
	public void insert(Course c) {
		// TODO Auto-generated method stub

		courseMapper.insert(c);
	}

	@Override
	public Integer selectByteaid(int id) {
		// TODO Auto-generated method stub
		Course course=new Course();
		InitTime initTime=new InitTime();
		course.setTeaid(id);
		course.setCday(initTime.cday());
		course.setCorder(initTime.corder());
		
		return courseMapper.findbyteaid(course);
	}

	@Override
	public List<Course> selectbyteaid(int id) {
		// TODO Auto-generated method stub
		return courseMapper.selectbyteaid(id);
	}

}
