package com.kh.mybatis.common.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter(urlPatterns = "/*") // 어떤 요청이 실행되기 전에 이 필터를 거쳐갈건지에 대한 설정 -> 모든 서블릿이 실행되기 전 이 필터를 거쳐가겠다
public class EncodingFilter implements Filter {

    /**
     * Default constructor. 
     */
    public EncodingFilter() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		/*
		 * * Filter
		 * 서블릿에 요청이 도달하기 전 먼저 가로채서 해당 요청에 대한 선처리 구문을 작성하는 개념
		 * 주로 공통적으로 선처리되어야 하는 기능을 필터로 정의해서 둔다.
		 * ex) 인코딩 처리
		 * 
		 * * Filter 작성 시 주의사항
		 * 선처리할 구문을 doFilter라는 메소드에 작성한다.
		 * 이 때, chain.doFilter 구문이 반드시 doFilter 메소드 마지막에 존재해야만 함
		 */
		
		request.setCharacterEncoding("UTF-8");
		// pass the request along the filter chain
		
		
//		chain.doFilter 구문
//		현재 필터가 최종 필터일 경우 -> 해당 요청에 대한 Servlet을 호출
//		현재 필터가 최종 필터가 아닐 경우 -> 그 다음 또 다른 필터를 호출
		
		chain.doFilter(request, response); // 얘는 무조건 마지막에 있어야된다
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
