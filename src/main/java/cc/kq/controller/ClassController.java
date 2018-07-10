package cc.kq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cc.kq.po.Classtb;
import cc.kq.service.impl.ClassServiceimpl;

/**
 * @author master Date 2017年11月1日 school :九江职业大学
 *         <p>
 *         </p>
 */
@Controller
public class ClassController {

	@Autowired
	ClassServiceimpl serviceimpl;

	@RequestMapping("class_add")
	public String add(Classtb classtb) {
		serviceimpl.insert(classtb);
		return "redirect:class_all";
	}

	@RequestMapping("class_all")
	public String findall(Model model) {
		List<Classtb> list = serviceimpl.findall();
		model.addAttribute("classall", list);
		return "class_all";
	}

	@RequestMapping("class_del")
	public String del(Integer id) {
		serviceimpl.del(id);
		return "ok";
	}

	@RequestMapping("class_edit")
	public String edit(Integer id, Model model) {
		Classtb classtb = serviceimpl.findbyid(id);
		model.addAttribute("edit_data", classtb);
		return "class_all";
	}

	@RequestMapping("class_update")
	public String update(Classtb classtb) {
		serviceimpl.update(classtb);
		return "ok";
	}

	@RequestMapping("/")
	public String index(Model model) {
		List<Classtb> list = serviceimpl.findall();
		model.addAttribute("class_all", list);
		return "index";
	}
}
