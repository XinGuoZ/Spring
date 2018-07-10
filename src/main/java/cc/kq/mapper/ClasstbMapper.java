package cc.kq.mapper;

import cc.kq.po.Classtb;
import cc.kq.po.ClasstbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClasstbMapper {
    int countByExample(ClasstbExample example);

    int deleteByExample(ClasstbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classtb record);

    int insertSelective(Classtb record);

    List<Classtb> selectByExample(ClasstbExample example);

    Classtb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classtb record, @Param("example") ClasstbExample example);

    int updateByExample(@Param("record") Classtb record, @Param("example") ClasstbExample example);

    int updateByPrimaryKeySelective(Classtb record);

    int updateByPrimaryKey(Classtb record);
}