package org.apache.jsp.CarPoolService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SingUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html><html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("  <title>JSP Page</title>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("\t<form class=\"form-horizontal\">\n");
      out.write("<fieldset>\n");
      out.write("\n");
      out.write("<!-- Form Name -->\n");
      out.write("<legend>Form Name</legend>\n");
      out.write("\n");
      out.write("<!-- Text input-->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"Name\">Name</label>  \n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("  <input id=\"Name\" name=\"Name\" type=\"text\" placeholder=\"username\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Password input-->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"passwordinput\">Password</label>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <input id=\"passwordinput\" name=\"passwordinput\" type=\"password\" placeholder=\"\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    <span class=\"help-block\">max 16 characters</span>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Password input-->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"confirm_password\">Confirm Password</label>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <input id=\"confirm_password\" name=\"confirm_password\" type=\"password\" placeholder=\"Re-type password\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Multiple Radios (inline) -->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"gender\">Gender</label>\n");
      out.write("  <div class=\"col-md-4\"> \n");
      out.write("    <label class=\"radio-inline\" for=\"gender-0\">\n");
      out.write("      <input type=\"radio\" name=\"gender\" id=\"gender-0\" value=\"Male\" checked=\"checked\">\n");
      out.write("      Male\n");
      out.write("    </label> \n");
      out.write("    <label class=\"radio-inline\" for=\"gender-1\">\n");
      out.write("      <input type=\"radio\" name=\"gender\" id=\"gender-1\" value=\"Female\">\n");
      out.write("      Female\n");
      out.write("    </label>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Textarea -->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"address\">Address</label>\n");
      out.write("  <div class=\"col-md-4\">                     \n");
      out.write("    <textarea class=\"form-control\" id=\"address\" name=\"address\">default text</textarea>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Select Basic -->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"country\">Country</label>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <select id=\"country\" name=\"country\" class=\"form-control\">\n");
      out.write("      <option value=\"India\">India</option>\n");
      out.write("      <option value=\"Afghanistan\">Afghanistan</option>\n");
      out.write("      <option value=\"Aland Islands\">Aland Islands</option>\n");
      out.write("      <option value=\"Algeria\">Albania</option>\n");
      out.write("      <option value=\"\">Algeria</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Text input-->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"mobilenumber\">Mobile Number</label>  \n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("  <input id=\"mobilenumber\" name=\"mobilenumber\" type=\"text\" placeholder=\"Mobile Number\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Text input-->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"emailId\">Email Id</label>  \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("  <input id=\"emailId\" name=\"emailId\" type=\"text\" placeholder=\"user@domain.com\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Select Multiple -->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"languages\">Languages Known</label>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <select id=\"languages\" name=\"languages\" class=\"form-control\" multiple=\"multiple\">\n");
      out.write("      <option value=\"English\">English</option>\n");
      out.write("      <option value=\"Hindi\">Hindi</option>\n");
      out.write("      <option value=\"Malayalam\">Malayalam</option>\n");
      out.write("      <option value=\"Others\">Others</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Prepended checkbox -->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"check_critiria\">Check the box</label>\n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("      <span class=\"input-group-addon\">     \n");
      out.write("          <input type=\"checkbox\">     \n");
      out.write("      </span>\n");
      out.write("      <input id=\"check_critiria\" name=\"check_critiria\" class=\"form-control\" type=\"text\" placeholder=\"I accept the criteria\" required=\"\">\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Button -->\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"submit\"></label>\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <button id=\"submit\" name=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</fieldset>\n");
      out.write("</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
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
