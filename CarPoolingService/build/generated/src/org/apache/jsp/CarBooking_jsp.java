package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CarBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("                <div class=\"container\">\n");
      out.write("\t<div class=\"row\">\n");
      out.write("            <form class=\"form-horizontal\" action=\"CarBooking.do\" method=\"post\">\n");
      out.write("            <br>\n");
      out.write("             <a href=\"Home.jsp\">\n");
      out.write("    <img src=\"carpoollogo.png\" alt=\"logo\" style=\"width:40px;\">\n");
      out.write("             </a>\n");
      out.write("            <br><br>\n");
      out.write("<fieldset>\n");
      out.write("\n");
      out.write("<legend>Add Car Details on Transport your world</legend>\n");
      out.write("                 \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"carpoolbookingdate\">Car Pool Booking Date</label>\n");
      out.write("  <div class=\"col-md-6\"> \n");
      out.write("    <input id=\"Name\" name=\"carpoolbookingDate\" type=\"text\" placeholder=\"MM/DD/YYYY\" class=\"form-control input-md\" required=\"\">\n");
      out.write("</div>   \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("   <div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"carpoolbookingtime\">Car Pool Booking Time</label>\n");
      out.write("  <div class=\"col-md-6\"> \n");
      out.write("    <input id=\"Name\" name=\"carpoolbookingTime\" type=\"text\" placeholder=\"HH/MM/SS\" class=\"form-control input-md\" required=\"\">\n");
      out.write("</div>   \n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("<div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"numberofPassenger\">NO. Of Passenger</label>\n");
      out.write("  <div class=\"col-md-6\"> \n");
      out.write("    <input id=\"Name\" name=\"numberofPassenger\" type=\"text\" placeholder=\"IN NO\" class=\"form-control input-md\" required=\"\">\n");
      out.write("</div>   \n");
      out.write("              </div>\n");
      out.write("             \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("  <label class=\"col-md-4 control-label\" for=\"submit\"></label>\n");
      out.write("  <div class=\"col-md-6\">\n");
      out.write("    <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Submit</button>\n");
      out.write("  </div>\n");
      out.write("</div>       \n");
      out.write("      \n");
      out.write("            </form>\n");
      out.write("           </div>\n");
      out.write("              </div>\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <br> <br> <br>  <br>  <br>\n");
      out.write("                        <p>\n");
      out.write("                            &COPY; 2010 Transport your World Pvt Ltd, Inc.\n");
      out.write("                            &middot; <a href=\"Privacy\">Privacy</a>\n");
      out.write("                            &middot; <a href=\"Terms and condition\">Terms & condition</a>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
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
