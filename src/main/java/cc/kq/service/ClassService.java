package cc.kq.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cc.kq.po.Classtb;

/**
 * @author master
 * Date 2017年11月1日
 * school :九江职业大学
 *<p>班级表</p>
 */
@Transactional
public interface ClassService {
	
	public List<Classtb> findall();
  
	public int insert(Classtb cla);
	
	public Classtb findbyid(Integer id);
	
	public void del(Integer id);
	
	public void update(Classtb classtb); 

}
