package cc.kq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cc.kq.po.Kqvo;
import cc.kq.po.Leave;
import cc.kq.po.StunameVo;

@Transactional
public interface LeaveService {
	
	public Integer selectcountbyteaid(Kqvo kqvo);
	
	public List<Leave> leavelist(Leave leave);

	public void update(Leave leave);
	
	public List<StunameVo> courseoftea(Integer classid);
	
	public void addlevel(Leave leave);
	
	public List<Leave> level(String stunum);
}
