package kr.imjeong.user.join.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.imjeong.user.constants.ViewConstants;

@Controller
public class JoinController {

	private static final Logger logger = LoggerFactory.getLogger(JoinController.class);
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String joinPage(HttpServletRequest request, Locale locale) {
		logger.info("##### Access Join Page.");
		logger.info("#####    " + "- Request URL : " + request.getRequestURL());
		logger.info("#####    " + "- Request URI : " + request.getRequestURI());
		logger.info("#####    " + "- servlet Path : " + request.getServletPath());
		
		return ViewConstants.VIEW_JOIN_PAGE;
	}
}
