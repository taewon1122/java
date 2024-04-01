package kr.kh.app.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDTO {
	private String id;
	private String pw;
	
	public String getIdPw() {
		return id + ", " + pw;
	}
	

}
