package test07Collection_Map.test.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Test01main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Collection & Map");
		
		// 가변 배열(가변 데이터 배열 처리용)
		// 1.Collection : List(ArrayList), Set(HashSet)
		// List : 순서 존재(인덱스), 중복데이터 허용
		// ArrayList, LinkedList, Vector
		// add, set, remove, clear
		// Generic(제너릭) - 명시적 타입 체크, Object타입 입력
		ArrayList/* <제너릭> */ list = new ArrayList/* <제너릭> */();
		list.add(1000);// 입력
		list.add(1000);
		list.add("kim");
		System.out.println("list size" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1000);
		list2.add(2000);
		list2.add(3000);
		list2.add(3000);
		
		list2.set(3, 4000);// 수정
		list2.remove(2);// 삭제
		System.out.println("list2 size" + list2.size());
		for (Integer x : list2) {
			System.out.println(x);
		}
		list2.clear();// 모두 삭제
		
		System.out.println();
		// Set : 순서 없음, 중복데이터 비허용(유니크)
		// add, remove, clear (set X 수정불가)
		Set<String> set = new HashSet<String>();// 다형성, 유지보수에 좋음, 속도가 느림
		set.add("kim");
		set.add("kim");
		set.add("kim");
		set.add("kim");// 유니크한 값이 아니므로 size = 1;
		set.add("kim3");
		set.add("kim2");

		System.out.println("set size:" + set.size());
		for (String x : set) {// 입력 순서와 출력 순서가 상이
			System.out.println(x);
		}
		System.out.println();
		
		set.remove("kim");
		for (String x : set) {// 순서가 없기 때문에 일반  for문 사용 불가
			System.out.println(x);
		}
		System.out.println();
		
		// 2.Map(HashMap, HashTable) : 키와 값으로 매핑(키(유니크), 값(중복 허용))
		// put, get
		Map<String, Double> map = new Hashtable<String, Double>();
		map.put("pi", 3.14);
		map.put("pi", 3.141);
		map.put("pi", 3.1415);
		map.put("pi", 3.14159);
		map.put("pi", 3.141592);// 키 중복시 제일 마지막 값 입력
		map.put("위도", 37.2);
		
		System.out.println(map.get("pi"));
		System.out.println(map.get("위도"));
		System.out.println();
		
		System.out.println("map size:" + map.size());
		System.out.println("map key size:" + map.keySet().size());
		for (String x : map.keySet()) {// 키셋을 통한 map 데이터 출력
			System.out.println(x + ":" + map.get(x));
		}
		
	}

}
