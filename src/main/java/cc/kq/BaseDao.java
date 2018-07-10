package cc.kq;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author 张鑫国
 * @company 九江职大
 * @date 2017年10月25日
 * @param <T>
 */
public interface BaseDao<T> extends Mapper<T>, MySqlMapper<T> {

}