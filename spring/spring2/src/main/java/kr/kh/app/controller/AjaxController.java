package kr.kh.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.kh.app.model.dto.LoginDTO;

@RestController //@Controller + @ResponseBody / @ResponseBody => return값 자체를 화면에 보내줌
@RequestMapping("/ajax")
public class AjaxController {
	
	@PostMapping("/json/json")
	public Map<String, Object> jsonJson(@RequestBody LoginDTO member) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println(member);
		map.put("member", member);
		map.put("name", "홍길동");
		return map;
	}
	
	@GetMapping("/object/json")
	public Map<String, Object> objectJson(
			@RequestParam("id")String id, @RequestParam("name")String name){
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println(id);
		System.out.println(name);
		map.put("age", 31);
		return map;
	}
	
	@GetMapping("/object/json2")
	public Map<String, Object> idpw(
			@RequestParam("name")String name, @RequestParam("age")int age){
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println(name);
		System.out.println(age);
		map.put("result", "성공");
		return map;
	}
}
