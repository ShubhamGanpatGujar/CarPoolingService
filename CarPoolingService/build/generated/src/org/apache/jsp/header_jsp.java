package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  \n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("         .navbar-wrapper\n");
      out.write("          {\n");
      out.write("              position: relative;\n");
      out.write("              z-index: 15;\n");
      out.write("          }\n");
      out.write("          .navbar .nav > li > a\n");
      out.write("          {\n");
      out.write("              color: #000;\n");
      out.write("              text-shadow:none;\n");
      out.write("          }\n");
      out.write("          .navbar .nav > li > a:hover\n");
      out.write("          {\n");
      out.write("              color:#000;\n");
      out.write("              background: none;\n");
      out.write("          }\n");
      out.write("          .navbar .nav .active > a\n");
      out.write("          {\n");
      out.write("              color: #000;\n");
      out.write("              background: none;\n");
      out.write("          }\n");
      out.write("          .navbar .nav .active > a:hover\n");
      out.write("          {\n");
      out.write("          background: none\n");
      out.write("          }\n");
      out.write("          .navbar-wrapper\n");
      out.write("          {\n");
      out.write("              margin-top:0px;\n");
      out.write("          }\n");
      out.write("            .navbar-wrapper .navbar\n");
      out.write("            {\n");
      out.write("                border-radius: 4px;\n");
      out.write("            }\n");
      out.write("        \n");
      out.write("           \n");
      out.write("       \n");
      out.write("        \n");
      out.write("       </style>\n");
      out.write("    </head> \n");
      out.write("   \n");
      out.write(" \n");
      out.write("         \n");
      out.write("    <NAVBAR>\n");
      out.write("        <div class=\"navbar-wrapper\">\n");
      out.write("            <div class=\"navbar navbar-inverse navbar-static-top\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button class=\"navbar-toggle\" data-target=\".navbar-collapse\" data-toggle=\"collapse\" type=\"button\">\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                      <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span></button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"#\">Cars</a>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"Home.jsp\">Home</a>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"AboutUs.jsp\">AboutUs</a>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"ContactUs\">ContactUs</a>\n");
      out.write("                           </li>\n");
      out.write("                           <li class=\"active\">\n");
      out.write("                             <a href=\"Information.jsp\">Information</a>\n");
      out.write("                           </li>\n");
      out.write("                            </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("        \n");
      out.write("    </NAVBAR>\n");
      out.write("             \n");
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
