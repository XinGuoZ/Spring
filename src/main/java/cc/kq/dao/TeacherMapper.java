package cc.kq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cc.kq.BaseDao;
import cc.kq.po.Teacher;

/**
 * @author master
 * Date 2017年11月3日
 * school :九江职业大学
 *<p></p>
 */
public interface TeacherMapper extends BaseDao<Teacher> {

	@Select("select *from teacher")
	public List<Teacher> findall();

	@Insert("insert into teacher (teanum,phone,teaname) values(#{teanum},#{phone},#{teaname})")
	public int insert(Teacher tea);

	@Select("select *from teacher where id=#{id}")
	public Teacher findbyid(Integer id);

	@Delete("delete from teacher where id = #{id}")
	public void del(Integer id);

	@Update("update teacher set teanum=#{teanum},phone=#{phone},teapwd=#{teapwd},teaname=#{teaname} where id=#{id}")
	public void update(Teacher tea);
	
	@Select("select *from teacher where teanum=#{teanum} and teapwd=#{teapwd}")
	public List<Teacher> login(Teacher tea);
	
}