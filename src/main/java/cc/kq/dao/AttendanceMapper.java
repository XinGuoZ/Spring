package cc.kq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cc.kq.po.Attendance;
import cc.kq.po.Kqvo;

public interface AttendanceMapper {
    
	@Insert("insert into attendance (stu_num,stu_name,tea_num,time) values(#{stuNum},#{stuName},#{teaNum},#{time})")
	public void insert(Attendance attendance);
	
	@Select("select count(*) from attendance where stu_num=#{stunum} and tea_num=#{teanum}")
	public Integer selectcountbyteaid(Kqvo kqvo);

	@Select("select *from attendance where stu_num=#{stunum}")
	public List<Attendance> stukqaall(String stunum);
}