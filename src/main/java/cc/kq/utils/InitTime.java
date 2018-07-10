package cc.kq.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author master
 *
 */
public class InitTime {
	/**
	 * 返回星期几
	 */
	public int cday() {

		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int weekday = cal.get(Calendar.DAY_OF_WEEK) - 1;
		return weekday;
	}

	/**
	 * 返回当前上课第几节
	 */
	public int corder() {
		SimpleDateFormat sdt = new SimpleDateFormat("HH:mm");
		String time=sdt.format(System.currentTimeMillis());
		int ctime=Integer.parseInt(time.replace(":", ""));
		if(830<ctime&&ctime<1000) {
			return 1;
		}
		if(1020<ctime&&ctime<1150) {
			return 2;
		}
		if(1410<ctime&&ctime<1540) {
			return 3;
		}
		if(1550<ctime&&ctime<1720) {
			return 4;
		}
		
		return 0;
	}
}
