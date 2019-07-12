package test12objects.test.com;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Random;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("유용한 클래스들");

		// 1. String
		String str = "aaa";
		System.out.println(str.equals("aaa"));
		System.out.println(str.equalsIgnoreCase("Aaa"));
		System.out.println(str.compareTo("aaa"));
		System.out.println(str.compareToIgnoreCase("Aaa"));
		System.out.println(str.compareTo("aaa") == 0);

		String str2 = "bbb:aaa:ccc";
		System.out.println(str2.split(":"));
		String[] temp = str2.split(":");
		for (String x : temp) {
			System.out.println(x);
		}
		System.out.println();

		Arrays.sort(temp);
		for (String x : temp) {
			System.out.println(x);
		}
		System.out.println(Arrays.toString(temp));

		String str3 = "abcdef";
		System.out.println(str3.contains("bcd"));
		System.out.println(str3.indexOf("bcd"));

		// 2. java.util.Date, java.sql.Date, Calendar
		System.out.println(new Date());
		System.out.println(new Date().getTime());
		System.out.println(new java.sql.Date(new Date().getTime()));

		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DAY_OF_MONTH);

		GregorianCalendar gcal = new GregorianCalendar(1973, 12, 8);
		System.out.println(gcal.get(Calendar.YEAR));
		System.out.println(gcal.get(Calendar.MONTH));
		System.out.println(gcal.get(Calendar.DAY_OF_MONTH));

		Timestamp tstamp = new Timestamp(System.currentTimeMillis());
		System.out.println(tstamp);

		// java.text.*
		System.out.println("2019년12월25일 10시30분50초");
		System.out.println("2019:12:25 10:30:50");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy:mm:dd hh:mm:ss.sss");
		System.out.println(sdf.format(new Date()));

		// 랜덥값 처리
		System.out.println((int) (Math.random() * 10));

		Random random = new Random();
		System.out.println(random.nextInt(3) + 1);
		
		System.out.println("lotto");
		HashSet<Integer> lotto = new HashSet<Integer>();
		while(lotto.size() < 6) {
			lotto.add(random.nextInt(45) + 1);
		}
		for (Integer x : lotto) {
			System.out.println(x);
		}
		
	}

}
