package cc.kq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cc.kq.BaseDao;
import cc.kq.po.Classtb;

/**
 * @author master
 * Date 2017年11月1日
 * school :九江职业大学
 *<p>班级表的dao层映射</p>
 */
public interface ClasstbMapper extends BaseDao<Classtb>{
	
	@Select("select *from classtb")
	public List<Classtb> findall();
  
	@Insert("insert into classtb (classname,headteacher) values(#{classname},#{headteacher})")
	public int insert(Classtb cla);
	
	@Select("select *from classtb where id=#{id}")
	public Classtb findbyid(Integer id);
	
	@Delete("delete from classtb where id = #{id}")
	public void del(Integer id);
	
	@Update("update classtb set classname=#{classname},headteacher=#{headteacher} where id=#{id}")
	public void update(Classtb classtb);
}