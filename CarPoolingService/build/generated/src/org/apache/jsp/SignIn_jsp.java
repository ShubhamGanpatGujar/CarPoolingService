package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("        <style>\n");
      out.write("            .form-signin\n");
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
      out.write(".form-signin input[type=\"text\"]\n");
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
      out.write(".account-walls {\n");
      out.write("     margin-top: 20px;\n");
      out.write("     padding: 20px 0px 10px 0px;\n");
      out.write("     background-color: #f7f7f7;\n");
      out.write("     -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write(".account-wall {\n");
      out.write("     margin-top: 20px;\n");
      out.write("     padding: 40px 0px 20px 0px;\n");
      out.write("     background-color: #f7f7f7;\n");
      out.write("     -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("          <div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
      out.write("          \n");
      out.write("         <h1 class=\"text-center login-title\"> \n");
      out.write("             <a href=\"Home1.jsp\">\n");
      out.write("    <img src=\"carpoollogo.png\" alt=\"logo\" style=\"width:40px;\">\n");
      out.write("             </a>\n");
      out.write("             <br> <br>Sign in to Transport Your World</h1>\n");
      out.write("         \n");
      out.write("         <div class=\"account-wall\">\n");
      out.write("          <img class=\"profile-img\" src=\"Prologo.png\">\n");
      out.write("          \n");
      out.write("          <form class=\"form-signin\" method=\"post\" action=\"SingIn.do\">\n");
      out.write("          <input required type=\"text\" class=\"form-control\" placeholder=\"Email\" Name=\"customerEmail\">\n");
      out.write("          <br>\n");
      out.write("          <input required type=\"password\" class=\"form-control\" placeholder=\"Password\" name=\"customerPassword\">\n");
      out.write("          <br>\n");
      out.write("          <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Sign in</button>\n");
      out.write("          <label class=\"checkbox pull-left\">\n");
      out.write("          <input type=\"checkbox\" value=\"remember-me\">Remember me </label>                \n");
      out.write("           <a href=\"#\" class=\"pull-right need-help\">Need help? </a><span class=\"clearfix\"></span>\n");
      out.write("          </form>\n");
      out.write("            </div>\n");
      out.write("             <div class=\"account-walls \">\n");
      out.write("            <a href=\"SignUp.jsp\" class=\"text-center new-account\"> If New User ? Sing Up </a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br><br> \n");
      out.write("        \n");
      out.write("         <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 text-center\">\n");
      out.write("                       \n");
      out.write("                        <p>\n");
      out.write("                            &COPY; 2010 Transport your World Pvt Ltd, Inc.\n");
      out.write("                            &middot; <a href=\"Privacy\">Privacy</a>\n");
      out.write("                            &middot; <a href=\"Terms and condition\">Terms & condition</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
