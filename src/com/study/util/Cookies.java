package com.study.util;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 쿠키를 처리하기 위한 클래스
 * @author pc31
 * @since 2018.03.14
 * ----------------------------
 * 작성자 	일자 	변경내역 
 * ----------------------------
 * pc31	   03.14	최초작성
 * 
 *
 */



public class Cookies {
	
	private Map<String, Cookie> cookieMap = new HashMap<>();
	
	public Cookies(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if(cookies !=null) {
			for(Cookie cookie : cookies) {
				cookieMap.put(cookie.getName(), cookie);
			}
		}
	}
	/**
	 * 이름에 해당하는 쿠키의 <b>값을 리턴 <br>
	 * 만약 쿠키가 존재하지 않으면 null 리턴 
	 * @param name
	 * @return String
	 * @throws IOXception
	 */
	public Cookie getCookie(String name) {
		return cookieMap.get(name);
	}
	
	public String getValue(String name) throws IOException{
		Cookie cookie = cookieMap.get(name);
		if(cookie == null) return null;
		return URLDecoder.decode(cookie.getValue(),"utf-8");
		
	}
	
	public boolean exists(String name) {
		return cookieMap.containsKey(name);
	}
	
	/**
	 * 쿠키를 생성
	 * @param name
	 * @param value
	 * @return
	 * @throws IOException
	 */
	
	public static Cookie createCookie(String name, String value) throws IOException{
		return new Cookie(name, URLEncoder.encode(value,"utf-8"));
	}
	
	public static Cookie createCookie(String name, String value
											,String path,int maxAge) throws IOException{
		Cookie cookie = new Cookie(name,URLEncoder.encode(value,"utf-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		return cookie;
	}
	
	public static Cookie createCookie(String name, String value
									,	String domain,String path,int maxAge) throws IOException{
		Cookie cookie = new Cookie(name,URLEncoder.encode(value,"utf-8"));
		cookie.setPath(path);
		cookie.setMaxAge(maxAge);
		cookie.setDomain(domain);
		return cookie;
	}

}