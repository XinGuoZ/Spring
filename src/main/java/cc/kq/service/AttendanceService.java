package cc.kq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cc.kq.po.Attendance;
import cc.kq.po.Kqvo;
@Transactional
public interface AttendanceService {
	
	public void insert(Attendance attendance);
	
	public Integer selectcountbyteaid(Kqvo kqvo);

	List<Attendance> stukqaall(String stunum);
}
