package kr.imjeong.user.common.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.imjeong.user.constants.PageConstants;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/", "/d"}, method = RequestMethod.GET)
	public String home(HttpServletRequest request, Locale locale) {
		logger.info("##### Access Main(About) Page.");
		logger.debug("Request URL : " + request.getRequestURL());
		logger.debug("Request URI : " + request.getRequestURI());
		logger.debug("servlet Path : " + request.getServletPath());
		request.setAttribute("url", "");
		
		return PageConstants.HOME;
	}
	
}
