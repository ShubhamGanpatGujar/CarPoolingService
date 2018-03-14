package org.apache.jsp.CarPoolService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sing_005fin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("            <div class=\"codrops-top\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <strong>&laquo; Previous Demo: </strong>Responsive Content Navigator\n");
      out.write("                </a>\n");
      out.write("                <span class=\"right\">\n");
      out.write("                    <a href=\" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/\">\n");
      out.write("                        <strong>Back to the Codrops Article</strong>\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("                <div class=\"clr\"></div>\n");
      out.write("            </div><!--/ Codrops top bar -->\n");
      out.write("            <header>\n");
      out.write("                <h1>Login and Registration Form <span>with HTML5 and CSS3</span></h1>\n");
      out.write("\t\t\t\t<nav class=\"codrops-demos\">\n");
      out.write("\t\t\t\t\t<span>Click <strong>\"Join us\"</strong> to see the form switch</span>\n");
      out.write("\t\t\t\t\t<a href=\"index.html\" class=\"current-demo\">Demo 1</a>\n");
      out.write("\t\t\t\t\t<a href=\"index2.html\">Demo 2</a>\n");
      out.write("\t\t\t\t\t<a href=\"index3.html\">Demo 3</a>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("            </header>\n");
      out.write("            <section>\t\t\t\t\n");
      out.write("                <div id=\"container_demo\" >\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\n");
      out.write("                            <form  action=\"mysuperscript.php\" autocomplete=\"on\"> \n");
      out.write("                                <h1>Log in</h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"username\" class=\"uname\" data-icon=\"u\" > Your email or username </label>\n");
      out.write("                                    <input id=\"username\" name=\"username\" required=\"required\" type=\"text\" placeholder=\"myusername or mymail@mail.com\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Your password </label>\n");
      out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\" /> \n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"keeplogin\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"loginkeeping\" id=\"loginkeeping\" value=\"loginkeeping\" /> \n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"loginkeeping\">Keep me logged in</label>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"login button\"> \n");
      out.write("                                    <input type=\"submit\" value=\"Login\" /> \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"change_link\">\n");
      out.write("\t\t\t\t\t\t\t\t\tNot a member yet ?\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#toregister\" class=\"to_register\">Join us</a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\n");
      out.write("                            <form  action=\"mysuperscript.php\" autocomplete=\"on\"> \n");
      out.write("                                <h1> Sign up </h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your username</label>\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"usernamesignup\" required=\"required\" type=\"text\" placeholder=\"mysuperusername690\" />\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Your email</label>\n");
      out.write("                                    <input id=\"emailsignup\" name=\"emailsignup\" required=\"required\" type=\"email\" placeholder=\"mysupermail@mail.com\"/> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Your password </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"passwordsignup\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup_confirm\" class=\"youpasswd\" data-icon=\"p\">Please confirm your password </label>\n");
      out.write("                                    <input id=\"passwordsignup_confirm\" name=\"passwordsignup_confirm\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"signin button\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\"/> \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"change_link\">  \n");
      out.write("\t\t\t\t\t\t\t\t\tAlready a member ?\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#tologin\" class=\"to_register\"> Go and log in </a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </section>\n");
      out.write("        </div>\n");
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
