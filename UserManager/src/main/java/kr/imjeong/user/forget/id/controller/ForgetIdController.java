package kr.imjeong.user.forget.id.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.imjeong.user.constants.PageConstants;

@Controller
@RequestMapping(value = "/forget")
public class ForgetIdController {

	private static final Logger logger = LoggerFactory.getLogger(ForgetIdController.class);
	
	@RequestMapping(value = "id", method = RequestMethod.GET)
	public String viewForgetIdPage(HttpServletRequest request, Locale locale) {
		logger.info("##### Access forget ID Page.");
		logger.info("#####    " + "- Request URL : " + request.getRequestURL());
		logger.info("#####    " + "- Request URI : " + request.getRequestURI());
		logger.info("#####    " + "- servlet Path : " + request.getServletPath());
		
		return PageConstants.FIND_ID;
	}
}
