package kr.imjeong.user.member.find.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.imjeong.user.constants.PageConstants;

@Controller
public class FindUserIdController {
	
	private static final Logger logger = LoggerFactory.getLogger(FindUserIdController.class);
	
	@RequestMapping(value = "find-id", method = RequestMethod.GET)
	public String findUserId(HttpServletRequest request, Locale locale) {
		logger.info("##### Access Find UserID Page.");
		logger.info("#####    " + "- Request URL : " + request.getRequestURL());
		logger.info("#####    " + "- Request URI : " + request.getRequestURI());
		logger.info("#####    " + "- servlet Path : " + request.getServletPath());
		
		return PageConstants.FIND_ID;
	}
	
	@RequestMapping(value = "find-pw", method = RequestMethod.GET)
	public String findPassword(HttpServletRequest request, Locale locale) {
		logger.info("##### Access Find Password Page.");
		logger.info("#####    " + "- Request URL : " + request.getRequestURL());
		logger.info("#####    " + "- Request URI : " + request.getRequestURI());
		logger.info("#####    " + "- servlet Path : " + request.getServletPath());
		
		return PageConstants.FIND_PW;
	}
	
}
