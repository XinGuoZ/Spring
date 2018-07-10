package cc.kq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.kq.po.Classtb;
import cc.kq.po.Course;
import cc.kq.service.impl.ClassServiceimpl;
import cc.kq.service.impl.CourseServiceImpl;

@Controller
public class CourseController {

	@Autowired
	CourseServiceImpl serviceImpl;

	@Autowired
	ClassServiceimpl classserviceImpl;
	
	@RequestMapping("course_all")
	public String all(int classid, Model model) {
		
		Classtb classdata=classserviceImpl.findbyid(classid);
		
		model.addAttribute("classid", classdata);

		List<Course> list = serviceImpl.seleteByclassid(classid);

		model.addAttribute("course", list);

		return "course_all";
	}

	@RequestMapping("course_del")
	public String del(Course c) {

		serviceImpl.del(c);

		return "ok";
	}

	@RequestMapping("course_add")
	public String add(Course c) {

		serviceImpl.insert(c);

		return "ok";
	}
}
