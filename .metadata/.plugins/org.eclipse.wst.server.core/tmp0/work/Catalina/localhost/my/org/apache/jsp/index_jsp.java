/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-11-11 02:00:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<!--\r\n");
      out.write("		* 프레임워크\r\n");
      out.write("		- 개발자가 보다 편리한 환경에서 개발할 수 있또록 제공하는 뼈대, 틀 이라고 생각\r\n");
      out.write("		- 소프트웨어 개발의 입장으로서는 공통으로 사용하는 라이브러리 / 개발도구 / 인터페이스 등등 의미\r\n");
      out.write("		\r\n");
      out.write("		* 왜 프레임워크를 쓰는가? 필요성\r\n");
      out.write("		- 현재 웹 프로그래밍의 규모가 커지고 있음\r\n");
      out.write("		-> 거대하고 복잡도가 높은 프로젝트를 완성시키기 위해 많은 사람들이 필요함\r\n");
      out.write("		-> 그 개발자들이 '통일성' 있게 '빠르고' '안정적'으로 개발하기 위해서는 무수히 많은 규칙을 지켜야만 함\r\n");
      out.write("		-> 그래서 강제성이 짙은 '프레임워크'가 좋은 성과를 내고 있음\r\n");
      out.write("		-> 즉, 생산성 향상에 도움이 된다\r\n");
      out.write("		\r\n");
      out.write("		* 프레임워크의 특징\r\n");
      out.write("		- 자유롭게 설계하고 코딩하는게 아니라 프레임워크가 제공하는 가이드대로 설계하고 코딩해야함 (세팅도 마찬가지)\r\n");
      out.write("		- 개발할 수 있는 범위가 정해져있음\r\n");
      out.write("		- 개발자를 위한 다양한 도구 / 플러그인들이 지원됨\r\n");
      out.write("		\r\n");
      out.write("		* 프레임워크의 장단점\r\n");
      out.write("		> 장점: 개발 시간을 줄일 수 있음\r\n");
      out.write("				오류로부터 자유로워질 수 있음\r\n");
      out.write("		> 단점: 너무 의존하다 보면 개발 능력이 떨어져서 프레임워크 없이 개발하는 것이 힘들 수도 있음\r\n");
      out.write("				습득하는데 까지 시간이 오래 걸릴 수 있음ㄱ\r\n");
      out.write("				\r\n");
      out.write("		* 프레임워크의 종류\r\n");
      out.write("		- 영속성: 데이터 관련한 기능들 (CRUD)을 보다 편리하게 작업할 수 있는 프레임워크\r\n");
      out.write("				ex) MyBatis, JPA, Hibernate, ...\r\n");
      out.write("		- 자바: 웹 애플리케이션에 초점을 맞춰 필요한 요소들을 모듈화해서 제공해주는 프레임워크\r\n");
      out.write("				ex) Spring, Struts, ...\r\n");
      out.write("		- 화면구현: 프론트엔드를 보다 쉽게 구현할 수 있게 틀을 제공해주는 프레임워크\r\n");
      out.write("				ex) Bootstrap\r\n");
      out.write("		- 기능 및 지원: 특정 기능이나 업무 수행에 도움을 주는 기능을 제공하는 프레임워크\r\n");
      out.write("				ex) Log4j, JUnit, ...\r\n");
      out.write("	-->\r\n");
      out.write("	\r\n");
      out.write("	여기는 index.jsp야\r\n");
      out.write("	\r\n");
      out.write("	<!-- \r\n");
      out.write("		* 앞으로 Spring 프로젝트 구조상 모든 화면 관련 파일들은 WEB-INF 폴더 내부의 views 폴더에 들어가있음\r\n");
      out.write("		-> WEB-INF 폴더는 WAS가 전적으로 관리하기 때문에 일반적인 브라우저에서 url 주소로 접속이 불가능하다는 특징이 있다.\r\n");
      out.write("		-> contextRoot로 요청할 시 index.jsp 페이지가 로딩되자마자 WEB-INF/views/main.jsp로 곧바로 포워딩\r\n");
      out.write("	-->\r\n");
      out.write("	\r\n");
      out.write("	");
      if (true) {
        _jspx_page_context.forward("WEB-INF/views/main.jsp");
        return;
      }
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
