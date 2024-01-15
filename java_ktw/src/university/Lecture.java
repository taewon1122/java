package university;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Lecture {
	
	//강의정보 입력받는 리스트
	List<Lecture> lectureList = new ArrayList<Lecture>();
	
	//과목명
	String lectureName;
	//과목식별번호
	int lectureNum;
	//학점
	int lectureGrade;
	//현인원
	int lectureCount;
	//정원
	int lectureMaxCount;
	
	
}
