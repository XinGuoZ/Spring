package cc.kq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cc.kq.po.Kqvo;
import cc.kq.po.Leave;
import cc.kq.po.StunameVo;

public interface LeaveMapper {
   
	@Select("select count(*) from `leave` where stunum=#{stunum} and teanum= #{teanum} and Leavstate=3")
	public Integer selectcountbyteaid(Kqvo kqvo);
	
	@Select("select *from `leave` where teanum=#{teanum} and Leavstate=#{leavstate}")
	public List<Leave> leavelist(Leave leave);

	@Update("update `leave` set Leavstate=#{leavstate} where id=#{id}")
	public void update(Leave leave);
	
	
	//根据班级id查询所有老师
	@Select("select teacher.teanum,teacher.teaname,course.coursename from teacher,course where course.classid=#{classid} and course.teaid=teacher.id")
	public List<StunameVo> courseoftea(Integer classid);
	
	
	@Insert("insert into `leave`(stunum,stuname,teanum,Leavecontext,Leavstate,time) values(#{stunum},#{stuname},#{teanum},#{leavecontext},0,#{time})")
	public void addlevel(Leave leave);
	
	@Select("select *from `leave` where stunum=#{stunum}")
	public List<Leave> level(String stunum);
}