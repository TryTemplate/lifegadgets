package com.eici.lifegadgets.utils;

import java.lang.reflect.Field;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateUtil {
	
	
	private final static SimpleDateFormat	sdf					= new SimpleDateFormat("yyyy/MM/dd");
	
	private final static SimpleDateFormat	yyyyMMdd			= new SimpleDateFormat("yyyyMMdd");
	
	private final static SimpleDateFormat	yyyy_MM_dd			= new SimpleDateFormat("yyyy-MM-dd");
	
	private final static SimpleDateFormat	MM_dd				= new SimpleDateFormat("MM-dd");
	
	private final static SimpleDateFormat	yyyyMMddHHmm		= new SimpleDateFormat("yyyyMMddHHmm");
	
	private final static SimpleDateFormat	sdf1				= new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	private final static SimpleDateFormat	sdf2				= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private final static SimpleDateFormat	sdf3				= new SimpleDateFormat("HHmm");
	
	private final static SimpleDateFormat	sdf5				= new SimpleDateFormat("HH:mm");
	
	private final static SimpleDateFormat	sdf4				= new SimpleDateFormat("yy-MM-dd HH:mm");
	
	private final static SimpleDateFormat	yyyyMMddhhmmssSSS	= new SimpleDateFormat("yyyyMMddhhmmssSSS");
	
	private final static SimpleDateFormat	yyyyMMddHHmmss		= new SimpleDateFormat("yyyyMMddHHmmss");
	
	public static String simpleDate3(Date date) {
		
		
		if (date == null)
			return "";
		return yyyyMMddHHmmss.format(date);
	}
	
	public String simpleDate(Date date) {
		
		
		if (date == null)
			return "";
		return sdf.format(date);
	}
	
	public static String simpleDate1(String date1) {
		
		
		if (date1 == null)
			return "";
		return sdf.format(date1);
	}
	
	public static String simpleDate2(Date date) {
		
		
		if (yyyyMMddhhmmssSSS == null)
			return null;
		return yyyyMMddhhmmssSSS.format(date);
		
	}
	
	/**
	 * 取当前时间
	 * 
	 * @return
	 */
	public static String getCurrentTime() {
		
		
		Calendar calendar = Calendar.getInstance();
		
		int i = calendar.get(1);
		int j = calendar.get(2) + 1;
		int k = calendar.get(5);
		return "" + i + (j >= 10 ? "" + j : "0" + j) + (k >= 10 ? "" + k : "0" + k);
	}
	
	public static Date calculateDate(Date startDay, int days) {
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDay);
		cal.add(Calendar.DAY_OF_YEAR, days);
		return cal.getTime();
	}
	
	public static Date calculateMonth(Date startDay, int months) {
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDay);
		cal.add(Calendar.MONTH, months);
		return cal.getTime();
	}
	
	/**
	 * String 获取当前时间yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {
		
		
		return dateToString4(getCurrentDate());
	}
	
	public static Date getCurrentDate() {
		
		
		return new Date(System.currentTimeMillis());
	}
	
	/**
	 * String 获取今天日期yyyyMMdd
	 * 
	 * @return
	 */
	public static String getToday() {
		
		
		Calendar calendar = Calendar.getInstance();
		return DateUtil.getyyyyMMdd(calendar.getTime());
	}
	
	/**
	 * String 获取明天日期yyyyMMdd
	 * 
	 * @return
	 */
	public static String getTomorrow() {
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return DateUtil.getyyyyMMdd(calendar.getTime());
	}
	
	/**
	 * String 获取几天后日期yyyyMMdd
	 * 
	 * @return
	 */
	public static String getDateByDays(Integer days) {
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return DateUtil.getyyyyMMdd(calendar.getTime());
	}
	
	/**
	 * String 获取几天后日期yyyy-MM-dd
	 * 
	 * @return
	 */
	public static String getDateByDays2(Integer days) {
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, days);
		return DateUtil.getyyyy_MM_dd(calendar.getTime());
	}
	
	/**
	 * 将日期格式化为字符串
	 * 
	 * @param date
	 * @return
	 */
	@Deprecated
	public static String dateToString(Date date, String pattern) {
		
		
		if (date == null) {
			return "";
		}
		return new SimpleDateFormat(pattern).format(date);
	}
	
	public static String getyyyyMMdd(Date date) {
		
		
		if (date == null)
			return "";
		return yyyyMMdd.format(date);
	}
	
	public static String getyyyy_MM_dd(Date date) {
		
		
		if (date == null)
			return "";
		return yyyy_MM_dd.format(date);
	}
	
	public static String getMM_dd(Date date) {
		
		
		if (date == null)
			return "";
		return MM_dd.format(date);
	}
	
	public static Date StringToDate(String date) {
		
		
		try {
			return yyyyMMdd.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	/**
	 * String 获取时间 yyyy-MM-dd HH:mm
	 * 
	 * @param date
	 * @return
	 */
	public static String format1(Date date) {
		
		
		if (date == null)
			date = new Date();
		return sdf1.format(date);
	}
	
	public static String dateToString1(Date date) {
		
		
		try {
			return sdf2.format(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	/**
	 * Date 获取时间 yyyy-MM-dd HH:mm
	 * 
	 * @param String
	 * @return Date
	 */
	public static Date StringToDate1(String date) {
		
		
		try {
			return sdf1.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	/**
	 * Date 获取时间 yyyy/MM/dd
	 * 
	 * @param String
	 * @return Date
	 */
	public static Date StringToDate5(String date) {
		
		
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	public static Date StringToDate6(String date) {
		
		
		try {
			return yyyy_MM_dd.parse(date);
		} catch (Exception e) {
		}
		return new Date();
	}
	
	/**
	 * Date 获取时间yyyyMMddHHmm
	 * 
	 * @param String
	 *            yyyyMMddHHmm
	 * @return Date
	 */
	public static Date StringToDate2(String date) {
		
		
		try {
			return yyyyMMddHHmm.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	/**
	 * Date 获取时间yyyyMMdd
	 * 
	 * @param String
	 *            yyyyMMdd
	 * @return Date
	 */
	public static Date StringToDate3(String date) {
		
		
		try {
			return yyyyMMdd.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	public static Date StringToDate4(String date) {
		
		
		try {
			return sdf2.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	/**
	 * Date 获取时间yyyyMMddHHmmss
	 * 
	 * @param String
	 *            yyyyMMddHHmmss
	 * @return Date
	 */
	public static Date StringToDate7(String date) {
		
		
		try {
			return yyyyMMddHHmmss.parse(date);
		} catch (ParseException e) {
		}
		return new Date();
	}
	
	public static String dateToString4(Date date) {
		
		
		try {
			return sdf2.format(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static String getHHmm(Date date) {
		
		
		try {
			return sdf3.format(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static String getHHmm1(Date date) {
		
		
		try {
			return sdf5.format(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static String dateToString2(Date date) {
		
		
		try {
			return sdf4.format(date);
		} catch (Exception e) {
		}
		return null;
	}
	
	public static String simpleDate11(Date date) {
		
		
		if (date == null)
			return "";
		return sdf.format(date);
	}
	
	public static Integer getWeekId(String date) {
		
		
		Date d = new Date();
		try {
			d = yyyy_MM_dd.parse(date);
		} catch (ParseException e) {
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		Integer i = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		return i;
	}
	
	/**
	 * 获取周几
	 * 
	 * @param date
	 *            yyyyMMdd
	 * @return
	 */
	public static String getWeek(String date) {
		
		
		String week = "";
		switch (getWeekId(date)) {
			case 1:
				week = "星期一";
				break;
			case 2:
				week = "星期二";
				break;
			case 3:
				week = "星期三";
				break;
			case 4:
				week = "星期四";
				break;
			case 5:
				week = "星期五";
				break;
			case 6:
				week = "星期六";
				break;
			case 0:
				week = "星期日";
				break;
			
			default:
				break;
		}
		return week;
	}
	
	/**
	 * 时间计算（日）
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date getDate(Date date, int n) {
		
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(Calendar.DAY_OF_MONTH, n);
		return gc.getTime();
	}
	
	public static Date getDate(Date date, int field, int n) {
		
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		gc.add(field, n);
		return gc.getTime();
	}
	
	public static String getDate(Date date, Date updateTime) {
		
		
		String str = "";
		Calendar calendar1 = new GregorianCalendar();
		calendar1.setTime(date);
		Calendar calendar2 = new GregorianCalendar();
		calendar2.setTime(updateTime);
		Date date1 = DateUtil.minuteAdd(date, -1);
		Date date2 = DateUtil.hourAdd(date, -1);
		Date date3 = DateUtil.dayAdd(date, -1);
		Date date4 = DateUtil.dayAdd(date, -2);
		if (updateTime.after(date4)) {
			str = "昨天" + DateUtil.getHHmm1(updateTime);
			if (updateTime.after(date3)) {
				int hour = (24 + calendar1.get(Calendar.HOUR_OF_DAY) - calendar2.get(Calendar.HOUR_OF_DAY));
				if (hour > 24) {
					hour = hour - 24;
				}
				str = hour + "小时前";
				if (updateTime.after(date2)) {
					int minute = 60 + calendar1.get(Calendar.MINUTE) - calendar2.get(Calendar.MINUTE);
					if (minute > 60) {
						minute = minute - 60;
					}
					str = minute + "分钟前";
					if (updateTime.after(date1)) {
						int second = 60 + calendar1.get(Calendar.SECOND) - calendar2.get(Calendar.SECOND);
						if (second > 60) {
							second = second - 60;
						}
						str = second + "秒前";
					}
				}
			}
		} else {
			str = DateUtil.format1(updateTime);
		}
		return str;
	}
	
	/**
	 * 年的加减
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date yearAdd(Date date, int n) {
		
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.YEAR, n);
		return cl.getTime();
	}
	
	/**
	 * 月的加减
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date monthAdd(Date date, int n) {
		
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.MONTH, n);
		return cl.getTime();
	}
	
	/**
	 * 日的加减
	 */
	public static Date dayAdd(Date date, int n) {
		
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.DAY_OF_MONTH, n);
		return cl.getTime();
	}
	
	/**
	 * 小时的加减
	 */
	public static Date hourAdd(Date date, int n) {
		
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.HOUR_OF_DAY, n);
		return cl.getTime();
	}
	
	/**
	 * 分钟的加减
	 */
	public static Date minuteAdd(Date date, int n) {
		
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(date);
		cl.add(Calendar.MINUTE, n);
		return cl.getTime();
	}
	
	/**
	 * 判断医患问答的问题是否已过工作时间的6个小时 0:未超过; 1:已超过
	 * 
	 * @param createTime
	 * @return
	 */
	public static int judgeQuestionTime(Date createTime) {
		
		
		Date nowTime = new Date();
		Date yesTime = DateUtil.dayAdd(nowTime, -1);
		Date yes14 = DateUtil.StringToDate4((new SimpleDateFormat("yyyy-MM-dd 14:00:00").format(yesTime)));
		Date yes20 = DateUtil.StringToDate4((new SimpleDateFormat("yyyy-MM-dd 20:00:00").format(yesTime)));
		Date now06 = DateUtil.StringToDate4((new SimpleDateFormat("yyyy-MM-dd 06:00:00").format(nowTime)));
		Date now12 = DateUtil.StringToDate4((new SimpleDateFormat("yyyy-MM-dd 12:00:00").format(nowTime)));
		Date now20 = DateUtil.StringToDate4((new SimpleDateFormat("yyyy-MM-dd 20:00:00").format(nowTime)));
		if (createTime.before(yes14)) {
			return 1;
		} else if (createTime.after(yes14) && createTime.before(yes20)) {
			Long t1 = yes20.getTime() - createTime.getTime();
			if (nowTime.before(now06)) {
				return 0;
			} else if (nowTime.after(now06) && nowTime.before(now12)) {
				Long t = t1 + nowTime.getTime() - now06.getTime();
				if (t > 6 * 60 * 60 * 1000) {
					return 1;
				} else {
					return 0;
				}
			} else if (nowTime.after(now12)) {
				return 1;
			}
		} else if (createTime.after(yes20) && createTime.before(now06)) {
			if (nowTime.before(now06)) {
				return 0;
			} else if (nowTime.after(now06) && nowTime.before(now12)) {
				Long t = nowTime.getTime() - now06.getTime();
				if (t > 6 * 60 * 60 * 1000) {
					return 1;
				} else {
					return 0;
				}
			} else if (nowTime.after(now12)) {
				return 1;
			}
		} else if (createTime.after(now06) && createTime.before(now20)) {
			Long t = nowTime.getTime() - createTime.getTime();
			if (t > 6 * 60 * 60 * 1000) {
				return 1;
			} else {
				return 0;
			}
		} else if (createTime.after(now20)) {
			return 0;
		}
		return 1;
	}
	
	/**
	 * 判断日期格式:yyyy-MM-dd
	 * 
	 * @param sDate
	 * @return
	 */
	public static boolean isValidDate(String sDate) {
		
		
		String datePattern1 = "\\d{4}-\\d{2}-\\d{2}";
		String datePattern2 = "^((\\d{2}(([02468][048])|([13579][26]))" + "[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|" + "(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?" + "((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?(" + "(((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?" + "((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";
		if ((sDate != null)) {
			Pattern pattern = Pattern.compile(datePattern1);
			Matcher match = pattern.matcher(sDate);
			if (match.matches()) {
				pattern = Pattern.compile(datePattern2);
				match = pattern.matcher(sDate);
				return match.matches();
			} else {
				return false;
			}
		}
		return false;
	}
	
	/**
	 * 毫秒转天时分秒
	 * 
	 * @param ms
	 * @return
	 */
	public static String formatTime(Long ms) {
		
		
		Integer ss = 1000;
		Integer mi = ss * 60;
		Integer hh = mi * 60;
		Integer dd = 24;
		Double d = (double) (1000 * 60 * 60);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);// 百分号后保留的小数点位数
		String time = nf.format(ms / d).replaceAll(",", "");
		double hLong = Double.parseDouble(time);
		int dLong = (int) (Math.floor(hLong));
		int day = dLong / dd;
		int hour = dLong - day * dd;
		double asd = (hLong * 100 - Math.floor(hLong) * 100) / 100;
		int minute = (int) Math.floor(asd * 60);
		asd = (asd * 60 * 100 - minute * 100) / 100;
		int second = (int) (asd * 60);
		
		StringBuffer sb = new StringBuffer();
		if (day > 0) {
			sb.append(day + "天");
		}
		if (hour > 0) {
			sb.append(hour + "小时");
		}
		if (minute > 0) {
			sb.append(minute + "分");
		}
		if (second > 0) {
			sb.append(second + "秒");
		}
		return sb.toString();
	}
	
	/**
	 * 毫秒转时
	 * 
	 * @param ms
	 * @return
	 */
	public static Double formatTime1(Long ms) {
		
		
		Integer ss = 1000;
		Double mi = (double) (ss * 60);
		double hh = (int) (mi * 60);
		Double hour = (ms) / hh;
		return hour;
	}
	
	public static Object getAttr(Class userCla, Object a, String name) {
		
		
		Field[] fs = userCla.getDeclaredFields();
		for (int i = 0; i < fs.length; i++) {
			Field f = fs[i];
			f.setAccessible(true); // 设置些属性是可以访问的
			Object val = null;
			try {
				val = f.get(a);// 得到此属性的值
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (name.equals(f.getName())) {
				// 属性名
				return val;
			}
		}
		return null;
	}

	/**
	 * 时段对应 上午07:30,08:30,09:00   下午12:30，13:30   夜诊 16:30 17:30
	 * @param amPmType
	 * @param visitTime
	 * @return
	 */
	public static String dualVisitTime(String amPmType,String visitTime){
		String resStr = "";
		if("A".equals(amPmType)){
			if("1".equals(visitTime)){
				resStr = "07:30";
			}else if("2".equals(visitTime)){
				resStr = "08:30";
			}else if("3".equals(visitTime)){
				resStr = "09:00";
			}
		}else if("P".equals(amPmType)){
			if("1".equals(visitTime)){
				resStr = "12:30";
			}else if("2".equals(visitTime)){
				resStr = "13:30";
			}
		}else if("N".equals(amPmType)){
			if("1".equals(visitTime)){
				resStr = "16:30";
			}else if("2".equals(visitTime)){
				resStr = "17:30";
			}
		}
		return resStr;
	}

	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(new Date()));
	}
}
