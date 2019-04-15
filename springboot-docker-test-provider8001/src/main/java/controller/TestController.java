package controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/test/show/{word}",method=RequestMethod.GET)
	public String show(@PathVariable("word") String word) {
		return "成功访问："+word;
	} 
}
