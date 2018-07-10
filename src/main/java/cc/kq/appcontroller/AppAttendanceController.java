package cc.kq.appcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Attendance;
import cc.kq.po.Kq;
import cc.kq.po.Kqvo;
import cc.kq.service.impl.AttendanceServiceImpl;
import cc.kq.service.impl.LeaveServiceImpl;

@RestController
public class AppAttendanceController {
	
	@Autowired
	AttendanceServiceImpl attendanceServiceImpl;
	@Autowired
	LeaveServiceImpl leaveServiceImpl;
	
	@RequestMapping("app_kq")
	public Kq kq(String stunum,String teanum) {
		Kqvo kqvo=new Kqvo();
		kqvo.setStunum(stunum);
		kqvo.setTeanum(teanum);
		Kq kq=new Kq();
		kq.setAttendance(attendanceServiceImpl.selectcountbyteaid(kqvo));
		kq.setLevel(leaveServiceImpl.selectcountbyteaid(kqvo));
		return kq;
		
	}
	
	@RequestMapping("app_stukqa_all")
	public List<Attendance> stukqaall(String stunum) {
		List<Attendance> list=attendanceServiceImpl.stukqaall(stunum);
		if(list.size()>0) {
			return list;
		}
		return null;
		
	}

}
