package university;

import java.util.Objects;

public class Major {
	
	//전공명
	String major;
	//전공번호
	int majorNum;
	//정원
	int majorMaxCount = 20; //5
	//현재 인원
	int majorCount = 0; //(1/5)
	
	@Override
	public int hashCode() {
		return Objects.hash(majorNum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Major other = (Major) obj;
		return majorNum == other.majorNum;
	}

	//같은 전공을 가지고있는 사람들끼리 가나다순으로 sort가능(전공번호를 비교한 뒤 같은 전공번호라면 => sort)
	//하고나서 student로 넘겨준다.
	public boolean Major(int majorNum) {
		if(this.majorNum == majorNum) {
		}
		return false;
	}
	
	
	//조회기능에서도 쓸수있을거같다
	
	
}
