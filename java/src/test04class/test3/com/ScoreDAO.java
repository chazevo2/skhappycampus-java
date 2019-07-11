package test04class.test3.com;

public class ScoreDAO {
	ScoreVO[] vos = new ScoreVO[3];
	int i = 0;
	String grade = "";

	public int insert(ScoreVO vo) {// 입력
		System.out.println("Insert");
		
		if(i>2) {
			System.out.println(">> ArrayIndexOutOfBoundsException");
			return 1;
		}
		
		vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
		vo.setAvg(vo.getTotal() / 3.0);

		if (vo.getAvg() >= 90) {
			grade = "A";
		} else if (vo.getAvg() >= 80) {
			grade = "B";
		} else if (vo.getAvg() >= 70) {
			grade = "C";
		} else if (vo.getAvg() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		vo.setGrade(grade);
		System.out.println(vo.toString());
		vos[i] = vo;
		i++;
		return 0;
	}

	public int update(int i, ScoreVO vo) {// 수정
		System.out.println("Update");
		
		vo.setTotal(vo.getKor() + vo.getEng() + vo.getMath());
		vo.setAvg(vo.getTotal() / 3.0);

		if (vo.getAvg() >= 90) {
			grade = "A";
		} else if (vo.getAvg() >= 80) {
			grade = "B";
		} else if (vo.getAvg() >= 70) {
			grade = "C";
		} else if (vo.getAvg() >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		vo.setGrade(grade);
		
		System.out.println(vo.toString());
		vos[i] = vo;
		return 1;
	}

	public int delete(int x, ScoreVO vo) {// 삭제
		System.out.println("Delete");
		System.out.println(vo.toString());
		for (int j = x; j < i - 1; j++) {
			vos[j] = vos[j + 1];
		}
		vos[i - 1] = null;
		i--;
		return 2;
	}

	public ScoreVO[] select() {// 검색
		return vos;
	}
}
