package cc.kq.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.kq.dao.AttendanceMapper;
import cc.kq.po.Attendance;
import cc.kq.po.Kqvo;
import cc.kq.service.AttendanceService;
@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceMapper attendanceMapper;
	@Override
	public void insert(Attendance attendance) {
		// TODO Auto-generated method stub
		attendance.setTime(new SimpleDateFormat("yyyy-MM-dd HH-MM").format(new Date()));
		attendanceMapper.insert(attendance);

	}
	@Override
	public Integer selectcountbyteaid(Kqvo kqvo) {
		// TODO Auto-generated method stub
		return attendanceMapper.selectcountbyteaid(kqvo);
	}
	
	@Override
	public List<Attendance> stukqaall(String stunum) {
		// TODO Auto-generated method stub
		return attendanceMapper.stukqaall(stunum);
	}

	
}
