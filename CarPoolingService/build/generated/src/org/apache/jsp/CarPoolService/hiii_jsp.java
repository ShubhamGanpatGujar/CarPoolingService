package org.apache.jsp.CarPoolService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class hiii_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-black w3-card\">\n");
      out.write("    <a class=\"w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right\" href=\"javascript:void(0)\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("    <a href=\"Home.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">HOME</a>\n");
      out.write("    <a href=\"ContactUs.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT</a>\n");
      out.write("    <a href=\"AbutUs.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">About Us</a>\n");
      out.write("    <a href=\"Information.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">Information</a>\n");
      out.write("    \n");
      out.write("    <a href=\"javascript:void(0)\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Navbar on small screens -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top\" style=\"margin-top:46px\">\n");
      out.write("  <a href=\"Home.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">Home</a>\n");
      out.write("  <a href=\"ContactUs.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">Contact Us</a>\n");
      out.write("  <a href=\"AboutUs.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">About Us</a>\n");
      out.write("  <a href=\"Information.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">Information</a>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
