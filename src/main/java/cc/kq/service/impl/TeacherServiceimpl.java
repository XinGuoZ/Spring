package cc.kq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.kq.dao.TeacherMapper;
import cc.kq.po.Teacher;
import cc.kq.service.TeacherService;
@Service
public class TeacherServiceimpl implements TeacherService {

	@Autowired
	TeacherMapper teacherMapper;
	@Override
	public List<Teacher> findall() {
		// TODO Auto-generated method stub
		return teacherMapper.findall();
	}

	@Override
	public int insert(Teacher tea) {
		// TODO Auto-generated method stub
		return teacherMapper.insert(tea);
	}

	@Override
	public Teacher findbyid(Integer id) {
		// TODO Auto-generated method stub
		return teacherMapper.findbyid(id);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		teacherMapper.del(id);
	}

	@Override
	public void update(Teacher tea) {
		// TODO Auto-generated method stub
		teacherMapper.update(tea);
	}

	@Override
	public Teacher login(Teacher tea) {
		// TODO Auto-generated method stub
		List<Teacher> list=teacherMapper.login(tea);
		if(list.size()>0){
			return list.get(0);
		}
		
		return null;
	}

}
