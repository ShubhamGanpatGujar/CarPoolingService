package org.apache.jsp.CarPoolService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/CarPoolService/header3.jsp");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("                    .form-signin\n");
      out.write("{\n");
      out.write("    max-width: 330px;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 0 auto;\n");
      out.write("}\n");
      out.write(".form-signin .form-signin-heading, .form-signin .checkbox\n");
      out.write("{\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write(".form-signin .checkbox\n");
      out.write("{\n");
      out.write("    font-weight: normal;\n");
      out.write("}\n");
      out.write(".form-signin .form-control\n");
      out.write("{\n");
      out.write("    position: relative;\n");
      out.write("    font-size: 16px;\n");
      out.write("    height: auto;\n");
      out.write("    padding: 10px;\n");
      out.write("    -webkit-box-sizing: border-box;\n");
      out.write("    -moz-box-sizing: border-box;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".form-signin .form-control:focus\n");
      out.write("{\n");
      out.write("    z-index: 2;\n");
      out.write("}\n");
      out.write("            .form-signin input[type=\"text\"]\n");
      out.write("{\n");
      out.write("    margin-bottom: -1px;\n");
      out.write("    border-bottom-left-radius: 0;\n");
      out.write("    border-bottom-right-radius: 0;\n");
      out.write("}\n");
      out.write(".form-signin input[type=\"password\"]\n");
      out.write("{\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    border-top-left-radius: 0;\n");
      out.write("    border-top-right-radius: 0;\n");
      out.write("}\n");
      out.write(".account-wall\n");
      out.write("{\n");
      out.write("    margin-top: 20px;\n");
      out.write("    padding: 40px 0px 20px 0px;\n");
      out.write("    background-color: #f7f7f7;\n");
      out.write("    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write(".login-title\n");
      out.write("{\n");
      out.write("    color: #555;\n");
      out.write("    font-size: 18px;\n");
      out.write("    font-weight: 400;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write(".profile-img\n");
      out.write("{\n");
      out.write("    width: 96px;\n");
      out.write("    height: 96px;\n");
      out.write("    margin: 0 auto 10px;\n");
      out.write("    display: block;\n");
      out.write("    -moz-border-radius: 50%;\n");
      out.write("    -webkit-border-radius: 50%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write(".need-help\n");
      out.write("{\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write(".new-account\n");
      out.write("{\n");
      out.write("    display: block;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write(".container{\n");
      out.write("    \n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
      out.write("          ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("          \n");
      out.write("           \n");
      out.write("       \n");
      out.write("         body\n");
      out.write("         {\n");
      out.write("             font-size-adjust:20;\n");
      out.write("         }\n");
      out.write("         h1{\n");
      out.write("             font-size: 50px;\n");
      out.write("         }\n");
      out.write("       </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("     <nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
      out.write(" \n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">\n");
      out.write("    <img src=\"carpoollogo.png\" alt=\"logo\" style=\"width:40px;\">\n");
      out.write("  </a>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  <ul class=\"navbar-nav\">\n");
      out.write("    <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"Home.jsp\">Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"ContactUs.jsp\">ContactUs</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"AboutUs.jsp\">AboutUs</a>\n");
      out.write("    </li>\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link\" href=\"Information.jsp\">Information</a>\n");
      out.write("    </li>\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>");
      out.write(" \n");
      out.write("          <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("         <h1 class=\"text-center login-title\">Sign in</h1>\n");
      out.write("         <div class=\"account-wall\">\n");
      out.write("          <img class=\"profile-img\" src=\"Prologo.png\">\n");
      out.write("          \n");
      out.write("          <form class=\"form-signin\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Email / User Name\" required autofocus>\n");
      out.write("          <br>\n");
      out.write("          <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("          <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("          <label class=\"checkbox pull-left\">\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\">Remember me </label>                \n");
      out.write("           <a href=\"#\" class=\"pull-right need-help\">Need help? </a><span class=\"clearfix\"></span>\n");
      out.write("          </form>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" class=\"text-center new-account\">For New User click Me</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
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
