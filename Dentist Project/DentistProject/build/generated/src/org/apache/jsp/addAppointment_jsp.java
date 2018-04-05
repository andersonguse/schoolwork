package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Business.*;
import Business.Appointment;
import java.util.*;
import java.sql.*;

public final class addAppointment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Appointment</title>\n");
      out.write("        <style>\n");
      out.write("            table, th, td{border: 1px solid black;}    \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>You do not have a current appointment. If you would like to, <br>\n");
      out.write("        please add an appointment below.</h1></center>\n");
      out.write("    <form action=\"AppointmentServlet\" method=\"post\">\n");
      out.write("        <center><table>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"apptDateTime\">Date/Time:</label></td>\n");
      out.write("                <td><input type=\"Text\" name=\"apptDateTime\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"dentists\">Dentist:</label></td>\n");
      out.write("                <td><select name=\"dentists\">\n");
      out.write("                    <option value=\"D201\">Frank Martin</option>\n");
      out.write("                    <option value=\"D202 \">Susan Cassidy</option>\n");
      out.write("                    <option value=\"D203 \">Jerry York</option>\n");
      out.write("                    <option value=\"D204 \">Wayne Pattersen</option\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><label for=\"procedure\">Procedure:</label></td>\n");
      out.write("                <td><select name=\"procedure\">\n");
      out.write("                    <option value=\"P114\">Cleaning/Exam</option>\n");
      out.write("                    <option value=\"P119\">Xrays</option>\n");
      out.write("                    <option value=\"P122\">Whitening</option>\n");
      out.write("                    <option value=\"P321\">Cavity</option>>\n");
      out.write("                    <option value=\"P650\">Top Dentures</option>\n");
      out.write("                    <option value=\"P660\">Bottom Dentures</option>\n");
      out.write("                    <option value=\"P780\">Crown</option>\n");
      out.write("                    <option value=\"P790\">Root Canel</option>\n");
      out.write("                    </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" name=\"submit\" value=\"Submit Changes\"/></td>\n");
      out.write("                <td><input type=\"reset\" name=\"clear\" value=\"Clear\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        </table></center>\n");
      out.write("        </form>\n");
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
