package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SignUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("  <title>JSP Page</title>\n");
      out.write("<style>\n");
      out.write(".account-wall {\n");
      out.write("     margin-top: 20px;\n");
      out.write("     padding: 40px 10px 20px 10px;\n");
      out.write("     background-color: #f7f7f7;\n");
      out.write("     -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <form class=\"form-horizontal\" action=\"SignUp.do\" method=\"post\">\n");
      out.write("            <br>\n");
      out.write("             <a href=\"Home.jsp\">\n");
      out.write("    <img src=\"carpoollogo.png\" alt=\"logo\" style=\"width:40px;\">\n");
      out.write("             </a>\n");
      out.write("            <br><br>\n");
      out.write("<fieldset>\n");
      out.write("\n");
      out.write("<legend>Create your personal account on Transport your world</legend>\n");
      out.write("\n");
      out.write(" <div class=\"account-wall\">\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"Name\">Name</label>  \n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("      <input id=\"Name\" name=\"customerName\" type=\"text\" placeholder=\"username\" class=\"form-control input-md\" required=\"username\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"passwordinput\">Password</label>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <input id=\"passwordinput\" name=\"customerPassword\" type=\"Password\" placeholder=\"\" class=\"form-control input-md\" required=\"up\">\n");
      out.write("    <span class=\"help-block\">max 16 characters</span>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"confirm_password\">Confirm Password</label>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <input id=\"confirm_password\" name=\"confirm_password\" type=\"password\" placeholder=\"Re-type password\" class=\"form-control input-md\" required=\"up2\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>-->\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"contactnumber\">Contact Number</label>  \n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("  <input id=\"mobilenumber\" name=\"customerContact\" type=\"text\" placeholder=\"Contact Number\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"gender\">Gender</label>\n");
      out.write("  <div class=\"col-md-4\"> \n");
      out.write("    <label class=\"radio-inline\" for=\"gender-0\">\n");
      out.write("      <input type=\"radio\" name=\"customerGender\" id=\"gender-0\" value=\"Male\" checked=\"checked\">Male</label>\n");
      out.write("      \n");
      out.write("    <label class=\"radio-inline\" for=\"gender-1\">\n");
      out.write("      <input type=\"radio\" name=\"customerGender\" id=\"gender-1\" value=\"Female\">Female</label>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"address\">Address</label>\n");
      out.write("  <div class=\"col-md-4\">                     \n");
      out.write("    <textarea class=\"form-control\" id=\"address\" name=\"customerAddress\">default text</textarea>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"date\">Date</label>  \n");
      out.write("  <div class=\"col-md-2\">\n");
      out.write("  <input id=\"date\" name=\"customerDateOfBirth\" type=\"text\" placeholder=\"DD/MM/YYYY\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"emailId\">Email Id</label>  \n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("  <input id=\"emailId\" name=\"customerEmail\" type=\"text\" placeholder=\"user@domain.com\" class=\"form-control input-md\" required=\"\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"submit\"></label>\n");
      out.write("  <div class=\"col-md-4\">\n");
      out.write("    <button id=\"submit\" name=\"submit\" class=\"btn btn-success\">Sing Up</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                 <div class=\"container\">\n");
      out.write("        <h6> By clicking \"Sign up for Transport your world\", you agree to our\n");
      out.write("         <a href=\"Terms and condition\">Terms & condition</a> and \n");
      out.write("          <a href=\"Privacy\">Privacy</a>\n");
      out.write("         policy.</h6>\n");
      out.write("                 </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("</fieldset>\n");
      out.write("            \n");
      out.write("</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("    \n");
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
