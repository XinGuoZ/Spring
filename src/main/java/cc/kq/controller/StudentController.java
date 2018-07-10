package cc.kq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.kq.po.Student;
import cc.kq.service.impl.ClassServiceimpl;
import cc.kq.service.impl.StudentServiceimpl;

@Controller
public class StudentController {

	@Autowired
	StudentServiceimpl serviceimpl;
	@Autowired
	ClassServiceimpl classServiceimpl;
	@RequestMapping("stu_add")
	public String add(Student stu) {
		/*
		 * stu.setPhone("111111"); stu.setClassid(74); stu.setStuname("zhangsan");
		 * stu.setStunum("dfd"); stu.setStupwd("88");
		 */
		serviceimpl.insert(stu);
		return "ok";
	}

	@RequestMapping("stu_edit")
	public String edit(int id, Model model) {
		Student stu=serviceimpl.findbyid(id);
		model.addAttribute("studata",stu);
		return "stu_all";
	}

	@RequestMapping("stu_all")
	public String all(Model model, int classid) {
		List<Student> list = serviceimpl.findall(classid);
		model.addAttribute("stu_list", list);
		
		model.addAttribute("classid", classid);
		return "stu_all";

	}

	@RequestMapping("stu_del")
	public String del(int id) {
		serviceimpl.del(id);
		return "redirect:stu_all";
	}

	@RequestMapping("stu_update")
	public String update(Student stu) {
		serviceimpl.update(stu);
		return "redirect:stu_all";
	}
}
