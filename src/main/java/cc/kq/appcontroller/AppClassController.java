package cc.kq.appcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Classtb;
import cc.kq.service.impl.ClassServiceimpl;


/**
 * @author master
 * Date 2017年11月1日
 * school :九江职业大学
 *<p></p>
 */
@RestController
public class AppClassController {

	@Autowired
	ClassServiceimpl serviceimpl;

	@RequestMapping("app_class_add")
	public void add(@RequestBody Classtb classtb) {
		serviceimpl.insert(classtb);
	}

	@RequestMapping("app_class_all")
	public List<Classtb> findall() {
		List<Classtb> list = serviceimpl.findall();
		return list;
	}

	@RequestMapping("app_class_del")
	public void del(Integer id) {
		serviceimpl.del(id);
	}

	@RequestMapping("app_class_edit")
	public Classtb edit(Integer id) {
		Classtb classtb = serviceimpl.findbyid(id);
		return classtb;
	}

	@RequestMapping("app_class_update")
	public void update(Classtb classtb) {
		serviceimpl.update(classtb);
	}
}
