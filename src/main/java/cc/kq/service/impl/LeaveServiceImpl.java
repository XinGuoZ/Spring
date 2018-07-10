package cc.kq.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.kq.dao.LeaveMapper;
import cc.kq.po.Kqvo;
import cc.kq.po.Leave;
import cc.kq.po.StunameVo;
import cc.kq.service.LeaveService;
@Service
public class LeaveServiceImpl implements LeaveService{

	@Autowired
	LeaveMapper leaveMapper;
	@Override
	public Integer selectcountbyteaid(Kqvo kqvo) {
		// TODO Auto-generated method stub
		return leaveMapper.selectcountbyteaid(kqvo);
	}
	@Override
	public List<Leave> leavelist(Leave leave) {
		// TODO Auto-generated method stub
		return leaveMapper.leavelist(leave);
	}
	public void update(Leave leave) {
		// TODO Auto-generated method stub
		leaveMapper.update(leave);
	}
	@Override
	public List<StunameVo> courseoftea(Integer classid) {
		// TODO Auto-generated method stub
		return leaveMapper.courseoftea(classid);
	}
	@Override
	public void addlevel(Leave leave) {
		// TODO Auto-generated method stub
		leave.setTime(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		leaveMapper.addlevel(leave);
	}
	@Override
	public List<Leave> level(String stunum) {
		// TODO Auto-generated method stub
		return leaveMapper.level(stunum);
	}
	
	
	

}
