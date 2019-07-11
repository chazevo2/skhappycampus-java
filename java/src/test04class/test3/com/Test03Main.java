package test04class.test3.com;

public class Test03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Score!!");

		// 성적 : 번호 이름 국 영 수 총점 평균 등급
		// ScoreVO - num name kor eng math total avg grade
		// 성적처리 : 입력 수정 삭제 검색 (CRUD)
		// ScoreDAO - insert update delete select

		ScoreVO vo = new ScoreVO();
		vo.setNum(1);
		vo.setName("kim");
		vo.setKor(99);
		vo.setEng(88);
		vo.setMath(77);
		
		ScoreVO vo2 = new ScoreVO();
		vo2.setNum(2);
		vo2.setName("lee");
		vo2.setKor(88);
		vo2.setEng(77);
		vo2.setMath(66);
		
		ScoreVO vo3 = new ScoreVO();
		vo3.setNum(3);
		vo3.setName("choi");
		vo3.setKor(11);
		vo3.setEng(22);
		vo3.setMath(33);
		
		ScoreVO vo4 = new ScoreVO();
		vo4.setNum(4);
		vo4.setName("Wang");
		vo4.setKor(99);
		vo4.setEng(99);
		vo4.setMath(99);

		ScoreDAO dao = new ScoreDAO();
		int result;
		
		// insert
		result = dao.insert(vo);
		System.out.println("insert result : " + result);
		result = dao.insert(vo2);
		System.out.println("insert result : " + result);
		result = dao.insert(vo3);
		System.out.println("insert result : " + result);
		result = dao.insert(vo4);
		System.out.println("insert result : " + result);
		System.out.println();
		
		// update
		vo.setName("park");
		result = dao.update(0, vo);
		System.out.println("update result : " + result);
		vo3.setEng(49);
		result = dao.update(2, vo3);
		System.out.println("update result : " + result);
		System.out.println();
		
		// select
		System.out.println("Select");
		ScoreVO[] vos = dao.select();
		for (int i = 0; i < vos.length; i++) {
			if (vos[i] != null)
				System.out.println(vos[i].toString());
		}
		System.out.println();
		
		// delete
		result = dao.delete(0, vo);
		System.out.println("delete result : " + result);
		System.out.println();
		
		// select
		System.out.println("Select");
		vos = dao.select();
		for (int i = 0; i < vos.length; i++) {
			if (vos[i] != null) {
				System.out.println(vos[i].toString());
			}
		}
		System.out.println();
	}

}
