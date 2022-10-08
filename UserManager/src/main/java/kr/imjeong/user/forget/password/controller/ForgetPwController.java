package kr.imjeong.user.forget.password.controller;

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
public class ForgetPwController {

	private static final Logger logger = LoggerFactory.getLogger(ForgetPwController.class);
	
	@RequestMapping(value = "password", method = RequestMethod.GET)
	public String viewForgetPasswordPage(HttpServletRequest request, Locale locale) {
		logger.info("##### Access Forget Password Page.");
		logger.info("#####    " + "- Request URL : " + request.getRequestURL());
		logger.info("#####    " + "- Request URI : " + request.getRequestURI());
		logger.info("#####    " + "- servlet Path : " + request.getServletPath());
		
		return PageConstants.FIND_PW;
	}
}
