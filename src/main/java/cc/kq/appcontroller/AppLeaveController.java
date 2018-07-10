package cc.kq.appcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Leave;
import cc.kq.po.StunameVo;
import cc.kq.service.impl.LeaveServiceImpl;


@RestController
public class AppLeaveController {

	@Autowired
	LeaveServiceImpl leaveServiceImpl;
	
	@RequestMapping("app_leave_list")
	public List<Leave> app_leave_list(String teanum){
		Leave leave=new Leave();
		leave.setTeanum(teanum);
		leave.setLeavstate(0);
		List<Leave> list=leaveServiceImpl.leavelist(leave);
		if(list.size()>0) {
			return list;
		}
		return null;
	}
	
	@RequestMapping("app_leave_update")
	public void app_leave_update(@RequestBody Leave leave){
		leaveServiceImpl.update(leave);
	}
	
	@RequestMapping("app_leave_tea")
	public List<StunameVo> leavetea(int classid){
		List<StunameVo> list=leaveServiceImpl.courseoftea(classid);
		if(list.size()>0) {
			return list;
		}
		
		return null;
	}
	@RequestMapping("app_leave_add")
	public void addlevel(@RequestBody Leave leave) {
		//System.out.println(leave.getLeavecontext());
		leaveServiceImpl.addlevel(leave);
		
	}
	
	@RequestMapping("app_stukq_all")
	public List<Leave> level(String stunum) {
		List<Leave> list=leaveServiceImpl.level(stunum);
		if(list.size()>0) {
			return list;
		}
		return null;
		
	}
}
