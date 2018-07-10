package cc.kq.appcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Course;
import cc.kq.service.impl.CourseServiceImpl;

@RestController
public class AppCourseController {
	
	@Autowired
	CourseServiceImpl courseServiceImpl;

	@RequestMapping("app_course_all")
	public List<Course> all(int teaid){
		List<Course> list=courseServiceImpl.selectbyteaid(teaid);
		if(list.size()>0) {
			return list;
		}
		return null;
	}
	
	@RequestMapping("app_course_classall")
	public List<Course> classall(int classid){
		List<Course> list=courseServiceImpl.seleteByclassid(classid);
		if(list.size()>0) {
			return list;
		}
		return null;
	}
	
	@RequestMapping("test")
	public Integer countad() {
		
		return 5;
	}
	
	
}
