package kr.imjeong.user.login.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.imjeong.user.constants.PageConstants;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String home(HttpServletRequest request, Locale locale) {
		logger.info("##### Access Login Page.");
		logger.info("#####    " + "- Request URL : " + request.getRequestURL());
		logger.info("#####    " + "- Request URI : " + request.getRequestURI());
		logger.info("#####    " + "- servlet Path : " + request.getServletPath());
		
		return PageConstants.LOG_IN;
	}

}
