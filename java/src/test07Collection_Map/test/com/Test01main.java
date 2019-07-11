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
		
		// ���� �迭(���� ������ �迭 ó����)
		// 1.Collection : List(ArrayList), Set(HashSet)
		// List : ���� ����(�ε���), �ߺ������� ���
		// ArrayList, LinkedList, Vector
		// add, set, remove, clear
		// Generic(���ʸ�) - ����� Ÿ�� üũ, ObjectŸ�� �Է�
		ArrayList/* <���ʸ�> */ list = new ArrayList/* <���ʸ�> */();
		list.add(1000);// �Է�
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
		
		list2.set(3, 4000);// ����
		list2.remove(2);// ����
		System.out.println("list2 size" + list2.size());
		for (Integer x : list2) {
			System.out.println(x);
		}
		list2.clear();// ��� ����
		
		System.out.println();
		// Set : ���� ����, �ߺ������� �����(����ũ)
		// add, remove, clear (set X �����Ұ�)
		Set<String> set = new HashSet<String>();// ������, ���������� ����, �ӵ��� ����
		set.add("kim");
		set.add("kim");
		set.add("kim");
		set.add("kim");// ����ũ�� ���� �ƴϹǷ� size = 1;
		set.add("kim3");
		set.add("kim2");

		System.out.println("set size:" + set.size());
		for (String x : set) {// �Է� ������ ��� ������ ����
			System.out.println(x);
		}
		System.out.println();
		
		set.remove("kim");
		for (String x : set) {// ������ ���� ������ �Ϲ�  for�� ��� �Ұ�
			System.out.println(x);
		}
		System.out.println();
		
		// 2.Map(HashMap, HashTable) : Ű�� ������ ����(Ű(����ũ), ��(�ߺ� ���))
		// put, get
		Map<String, Double> map = new Hashtable<String, Double>();
		map.put("pi", 3.14);
		map.put("pi", 3.141);
		map.put("pi", 3.1415);
		map.put("pi", 3.14159);
		map.put("pi", 3.141592);// Ű �ߺ��� ���� ������ �� �Է�
		map.put("����", 37.2);
		
		System.out.println(map.get("pi"));
		System.out.println(map.get("����"));
		System.out.println();
		
		System.out.println("map size:" + map.size());
		System.out.println("map key size:" + map.keySet().size());
		for (String x : map.keySet()) {// Ű���� ���� map ������ ���
			System.out.println(x + ":" + map.get(x));
		}
		
	}

}
