package cc.kq.appcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Attendance;
import cc.kq.service.impl.AttendanceServiceImpl;
import cc.kq.service.impl.StudentServiceimpl;

@RestController
public class AppAbsenteeismConller {

	@Autowired
	AttendanceServiceImpl attendanceService;
	@Autowired
	StudentServiceimpl stuService;
	
	@RequestMapping("app_abs_add")
	public void add(@RequestBody Attendance attendance) {
		attendanceService.insert(attendance);
		stuService.addattendance(attendance.getStuNum());
	}
}
