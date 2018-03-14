package org.apache.jsp.CarPoolService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">    \n");
      out.write("<title>JSP Page</title>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("\n");
      out.write("    background-image: url(\"carback1.gif\");\n");
      out.write("      background-size: 100%;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("   \n");
      out.write("   }\n");
      out.write(" \n");
      out.write(".header {\n");
      out.write("    font-family: serif;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("    float: right;\n");
      out.write("    display: block;\n");
      out.write("    color: #f2f2f2;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write(".form-inline{\n");
      out.write("     text-align: center;\n");
      out.write("    float: right;\n");
      out.write("     padding: 4px 6px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("button[class]{\n");
      out.write("\t  background: #424242;\n");
      out.write("\t  border-radius: 0;\n");
      out.write("\t  color: #fff;\n");
      out.write("\t  border-style: solid;\n");
      out.write("\t  border-color: #1c1c1c;\n");
      out.write("\t}\n");
      out.write("      \n");
      out.write("        .carousel \n");
      out.write("           {\n");
      out.write("               position: relative; \n");
      out.write("               top:0; \n");
      out.write("           }\n");
      out.write("           .carousel-inner \n");
      out.write("           {\n");
      out.write("               position: relative; \n");
      out.write("               width: 100%;\n");
      out.write("               overflow: hidden;\n");
      out.write("           }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("  <h1> Transport Your World Pvt.Ltd</h1>\n");
      out.write("</div>\n");
      out.write("<div class=\"topnav\">\n");
      out.write("   <a href=\"Information.jsp\">Information</a>\n");
      out.write("  <a href=\"AboutUs.jsp\">About Us</a>\n");
      out.write("  <a href=\"ContactUs.jsp\">contact Us</a>\n");
      out.write(" <a href=\"Home.jsp\">Home</a>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("   \n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"back01.jpg\" alt=\"back01\" style=\"width:100%;\">\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"back02.jpg\" alt=\"back02=\" style=\"width:100%;\">\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"back03.jpg\" alt=\"back03\" style=\"width:100%;\">\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarouse1\" data-slide=\"next\">\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
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
