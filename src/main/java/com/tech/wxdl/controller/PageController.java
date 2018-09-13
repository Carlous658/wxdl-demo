package com.tech.wxdl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 文心雕龙 Email：xuwenlong@shike8888.com
* @version 创建时间：2017年6月12日 下午10:29:21
* 类说明
*/
@Controller
public class PageController {

	@RequestMapping("/")
	public String goDemoPage(){
		return "/demo.html";
	}
}
