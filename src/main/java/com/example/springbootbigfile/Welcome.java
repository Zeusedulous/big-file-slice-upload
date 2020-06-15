package com.example.springbootbigfile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Welcome {
	
	@RequestMapping("index")
	public String index(){
		return "file2";
	}
	
}
