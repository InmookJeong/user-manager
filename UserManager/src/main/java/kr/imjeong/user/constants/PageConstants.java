package kr.imjeong.user.constants;

import java.io.File;

/**
 * Page Location Constnats
 * @author In mook, Jeong
 * @since 2022.09.27
 */
public class PageConstants {
	
	/* Folder Location */
	public static final String COMMON_FOLDER = "common";
	public static final String MEMEBER_FOLDER = "member";
	public static final String LOGIN_FOLDER = "login";
	public static final String FIND_FOLDER = "find";
	
	
	/* View File Location */
	public static final String HOME = COMMON_FOLDER + File.separator + "home";
	public static final String LOG_IN = MEMEBER_FOLDER + File.separator + LOGIN_FOLDER + File.separator + "login";
	public static final String FIND_ID = MEMEBER_FOLDER + File.separator + FIND_FOLDER + File.separator + "find-id";
	public static final String FIND_PW = MEMEBER_FOLDER + File.separator + FIND_FOLDER + File.separator + "find-pw";

}
