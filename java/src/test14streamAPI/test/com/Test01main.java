package test14streamAPI.test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Stream API");
		
		// 전통적인 자바식 필터링 및 배열할당
		List<String> list = Arrays.asList("aaaa", "bbb", "cccc");
		List<String> temp = new ArrayList<String>();
		for (String x : list) {
			if(x.length() > 3) {
//				System.out.println(x);
				temp.add(x);
			}
		}
		for (String x : temp) {
			System.out.println(x);
		}
		
		System.out.println("================");
		// 스트림 API를 이용한 필터링 및 배열할당
		Stream<String> stream = list.stream();
		stream.filter(item -> {
			return item.length() > 3;
		}).forEach(System.out::println);
				
		System.out.println("================");
		// Mapping
		list.stream().map(item -> item.toCharArray()).forEach(data -> {
			System.out.println(data.length);
		});
		
	}

}
