package cc.kq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cc.kq.po.Student;
import cc.kq.po.StudentExample;

public interface StudentMapper{
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    List<Student> selectByClassid(Integer classid);
    
    @Update("update student set level=level+1 where stunum=#{stunum}")
    public void addlevel(String stunum);
	
    @Update("update student set attendance=attendance+1 where stunum=#{stunum}")
	public void addattendance(String stuum);
    
    @Select("select *from student where stunum=#{stunum} and stupwd=#{stupwd}")
    public List<Student> login(Student student);
    
    @Update("update student set stupwd=#{stupwd} where id=#{id}")
    public void updatepwd(Student student);

}