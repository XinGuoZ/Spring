package cc.kq.appcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cc.kq.po.Leave;
import cc.kq.po.Student;
import cc.kq.service.impl.CourseServiceImpl;
import cc.kq.service.impl.LeaveServiceImpl;
import cc.kq.service.impl.StudentServiceimpl;
@RestController
public class AppStudentController {

	@Autowired
	CourseServiceImpl courseServiceImpl;
	
	@Autowired
	StudentServiceimpl studentService;
	
	
	@Autowired
	LeaveServiceImpl leaveServiceImpl;
	/**
	 * @param id
	 * @param teanum
	 * @return
	 * 教师端开始点到时的请求
	 * 将已请假成功的同学自动移除
	 */
	@RequestMapping("app_findbyteaid")
	public List<Student> findbuclass(int id,String teanum){
		//System.out.println(id+teanum );
		Integer classid=courseServiceImpl.selectByteaid(id);
		if(classid!=null) {
			List<Student> list=studentService.findbyclassid(classid);
			Leave leave=new Leave();
			leave.setTeanum(teanum);
			leave.setLeavstate(1);
			List<Leave> leaveList= leaveServiceImpl.leavelist(leave);
			
			for (Student student : list) {
				for (Leave lea : leaveList) {
					if(student.getStunum().equals(lea.getStunum())) {
						list.remove(student);
						studentService.addlevel(student.getStunum());
						leave.setStunum(student.getStunum());
						leave.setLeavstate(3);
						leaveServiceImpl.update(leave);
						return list;
					}
				}
			}
			return list;
		}
		return null;
	}
	
	
	
	/**
	 * @param id
	 * @return
	 * ajax请求
	 */
	@RequestMapping("app_findbyclassid")
	public List<Student> findbyclassid(int id){
		
		return studentService.findbyclassid(id);
		
	}
	
	/**
	 * @param student
	 * @return
	 * 移动端学生登入
	 */
	@RequestMapping("app_stu_login")
	public Student login(@RequestBody Student student) {
		List<Student> list=studentService.login(student);
		if(list.size()>0) {
			return list.get(0);
		}
		return null;
	}
	
	@RequestMapping("app_findbyid")
	public Student findbyid(int id) {
		return studentService.findbyid(id);
	}
	
	@RequestMapping("app_update_stu")
	public void updatestu(@RequestBody Student student) {
		studentService.updatepwd(student);
	}
	
}
