package cc.kq.appcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Teacher;
import cc.kq.service.impl.TeacherServiceimpl;

@RestController
public class AppTeacherController {

	@Autowired
	TeacherServiceimpl teaService;
	
	@RequestMapping("app_tea_all")
	public List<Teacher> Teaall(){
		List<Teacher> list=teaService.findall();
		return list;
	}
	
	@RequestMapping("app_tea_login")
	public Teacher login(@RequestBody Teacher tea) {
		System.out.println("----------安卓登入---"+tea.getTeanum()+"---------");
		tea=teaService.login(tea);
		if(tea!=null) {
			return tea;
		}
		return null;
	}
}
