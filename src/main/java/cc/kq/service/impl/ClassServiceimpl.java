package cc.kq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.kq.dao.ClasstbMapper;
import cc.kq.po.Classtb;
import cc.kq.service.ClassService;
@Service
public class ClassServiceimpl implements ClassService {

	@Autowired
	ClasstbMapper classMapper;
	
	@Override
	public List<Classtb> findall() {
		// TODO Auto-generated method stub
		return classMapper.findall();
	}

	@Override
	public int insert(Classtb cla) {
		// TODO Auto-generated method stub
		return classMapper.insert(cla);
	}

	@Override
	public Classtb findbyid(Integer id) {
		// TODO Auto-generated method stub
		return classMapper.findbyid(id);
	}

	@Override
	public void del(Integer id) {
		// TODO Auto-generated method stub
		classMapper.del(id);
	}

	@Override
	public void update(Classtb classtb) {
		// TODO Auto-generated method stub
		 classMapper.update(classtb);
	}

}
