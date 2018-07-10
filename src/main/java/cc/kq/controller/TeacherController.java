package cc.kq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.kq.po.Teacher;
import cc.kq.service.impl.TeacherServiceimpl;

@Controller
public class TeacherController {

	@Autowired
	TeacherServiceimpl serviceimpl;

	@RequestMapping("tea_all")
	public String teaall(Model model) {
		List<Teacher> list = serviceimpl.findall();
		model.addAttribute("tea_list", list);
		return "tea_all";
	}

	@RequestMapping("tea_del")
	public String del(int id) {
		serviceimpl.del(id);
		return "ok";
	}

	@RequestMapping("tea_edit")
	public String edit(int id, Model model) {

		Teacher tea = serviceimpl.findbyid(id);
		model.addAttribute("edit_data", tea);
		return "tea_all";
	}

	@RequestMapping("tea_update")
	public String update(Teacher tea) {
		serviceimpl.update(tea);
		return "ok";
	}

	@RequestMapping("tea_add")
	public String add(Teacher tea) {
		serviceimpl.insert(tea);
		return "ok";
	}
}
