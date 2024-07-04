package cn.sm1234.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //代表@Controller + @ResponseBody
//@RequestMapping("/hello")
public class HelloController {
	
	private Map<String,Object> result = new HashMap<>();
	
	@RequestMapping("/hello")
	//@ResponseBody //轉換json註解
	public Map<String,Object> hello() {
		result.put("name", "daniel");
		result.put("gender", "男");
		return result;
	}
}
