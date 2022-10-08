package kr.imjeong.user.constants;

import java.io.File;

/**
 * Page Location Constnats
 * @author In mook, Jeong
 * @since 2022.09.27
 */
public class ViewConstants {
	
	/* Folder Name */
	public static final String FOLDER_COMMON = "common";
	public static final String FOLDER_FORGET = "forget";
	public static final String FOLDER_ID = "id";
	public static final String FOLDER_PASSWORD = "password";
	public static final String FOLDER_HOME = "home";
	public static final String FOLDER_JOIN = "join";
	public static final String FOLDER_LOGIN = "login";
	
	/* View File Location */
	public static final String VIEW_FORGET_ID_PAGE = FOLDER_FORGET + File.separator + FOLDER_ID + File.separator + "forget-id";
	public static final String VIEW_FORGET_PASSWORD_PAGE = FOLDER_FORGET + File.separator + FOLDER_PASSWORD + File.separator + "forget-password";
	public static final String VIEW_HOME_PAGE = FOLDER_HOME + File.separator + "home";
	public static final String VIEW_JOIN_PAGE = FOLDER_JOIN + File.separator + "join";
	public static final String VIEW_LOGIN_PAGE = FOLDER_LOGIN + File.separator + "login";

}
