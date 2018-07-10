package cc.kq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import cc.kq.po.Course;

public interface CourseMapper {

	@Select("select *from course where classid=#{id} ")
	public List<Course> selectByClassid(Integer id);
	
	@Insert("INSERT INTO course (classid, teaid, addr, corder, cday,classname,coursename) VALUES (#{classid}, #{teaid}, #{addr}, #{corder}, #{cday},#{classname},#{coursename});")
	public void insert(Course course);
	
	@Delete("delete from course where classid=#{classid} and corder=#{corder} and cday=#{cday}")
	public void del(Course c);
	
	@Select("select classid from course where corder=#{corder} and cday=#{cday} and teaid=#{teaid} ")
	public Integer findbyteaid(Course course);
	
	@Select("select *from course where teaid=#{id} ")
	public List<Course> selectbyteaid(int id);
	
	
	
}
