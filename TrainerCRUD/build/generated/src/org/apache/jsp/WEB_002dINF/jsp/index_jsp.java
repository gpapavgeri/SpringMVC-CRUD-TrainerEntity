package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Trainer Options</title>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("\r\n");
      out.write("            body {\r\n");
      out.write("                background: linear-gradient(to right, #43cea2, #185a9d);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .container {\r\n");
      out.write("                background: white;\r\n");
      out.write("                width: 540px;\r\n");
      out.write("                height: 420px;\r\n");
      out.write("                margin: 0 auto;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                margin-top: 10%;\r\n");
      out.write("                box-shadow: 2px 5px 20px rgba(gray, .5);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .logo {\r\n");
      out.write("                float: right;\r\n");
      out.write("                margin-right: 12px;\r\n");
      out.write("                margin-top: 12px;\r\n");
      out.write("                font-family: hulu;\r\n");
      out.write("                color: logo;\r\n");
      out.write("                font-weight: 900;\r\n");
      out.write("                font-size: 1.5em;\r\n");
      out.write("                letter-spacing: 1px;\r\n");
      out.write("            }\r\n");
      out.write("            a {\r\n");
      out.write("                text-decoration: none;\r\n");
      out.write("                color: gray;\r\n");
      out.write("                font-size: 1.5em;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .CTA {\r\n");
      out.write("                width: 80px;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                right: -20px;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("                margin-bottom: 90px;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                z-index: 1;\r\n");
      out.write("                background: #43cea2;\r\n");
      out.write("                font-size: 1em;\r\n");
      out.write("                transform: rotate(-90deg);\r\n");
      out.write("                transition: all .5s ease-in-out;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                h1 {\r\n");
      out.write("                    color: white;\r\n");
      out.write("                    margin-top: 10px;\r\n");
      out.write("                    margin-left: 9px;\r\n");
      out.write("                }\r\n");
      out.write("                &:hover {\r\n");
      out.write("                    background: aqua;\r\n");
      out.write("                    transform: scale(1.1);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .leftbox {\r\n");
      out.write("                float: left;\r\n");
      out.write("                top: -5%;\r\n");
      out.write("                left: 5%;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                width: 15%;\r\n");
      out.write("                height: 110%;\r\n");
      out.write("                background: green;\r\n");
      out.write("                box-shadow: 3px 3px 10px rgba(gray, .5);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            nav a {\r\n");
      out.write("                list-style: none;\r\n");
      out.write("                padding: 35px;\r\n");
      out.write("                color: white;\r\n");
      out.write("                font-size: 1.1em;\r\n");
      out.write("                display: block;\r\n");
      out.write("                transition: all .3s ease-in-out;\r\n");
      out.write("                &:hover {\r\n");
      out.write("                    color: aqua;\r\n");
      out.write("                    transform: scale(1.2);\r\n");
      out.write("                    cursor: pointer;\r\n");
      out.write("                }\r\n");
      out.write("                &:first-child {\r\n");
      out.write("                    margin-top: 7px;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .active {\r\n");
      out.write("                color:aqua;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .rightbox {\r\n");
      out.write("                float: right;\r\n");
      out.write("                width: 60%;\r\n");
      out.write("                height: 100%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .profile, .payment, .subscription, .privacy, .settings {\r\n");
      out.write("                transition: opacity .5s ease-in;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                width: 70%;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h1 {\r\n");
      out.write("                font-family: heading;\r\n");
      out.write("                color: green;\r\n");
      out.write("                font-size: 1em;\r\n");
      out.write("                margin-top: 40px;\r\n");
      out.write("                margin-bottom: 35px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h2 {\r\n");
      out.write("                color: gray;\r\n");
      out.write("                font-family: body;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                text-transform: uppercase;\r\n");
      out.write("                font-size: 8px;\r\n");
      out.write("                letter-spacing: 1px;\r\n");
      out.write("                margin-left: 2px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            p {\r\n");
      out.write("                border-width: 1px;\r\n");
      out.write("                border-style: solid;\r\n");
      out.write("                border-image: linear-gradient(to right, aqua, rgba(green,.5)) 1 0%;\r\n");
      out.write("                border-top: 0;\r\n");
      out.write("                width: 80%;\r\n");
      out.write("                font-family: heading;\r\n");
      out.write("                font-size: .7em;\r\n");
      out.write("                padding: 7px 0;\r\n");
      out.write("                color: black;\r\n");
      out.write("            }\r\n");
      out.write("            span {\r\n");
      out.write("                font-size: .5em;\r\n");
      out.write("                color: gray;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .btn {\r\n");
      out.write("                float: right;\r\n");
      out.write("                font-family: body;\r\n");
      out.write("                text-transform: uppercase;\r\n");
      out.write("                font-size: 10px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                color: aqua;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h2:hover {\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("                font-weight: 900;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input {\r\n");
      out.write("                border: 1px solid lighten(gray,40%); \r\n");
      out.write("                font-family: body;\r\n");
      out.write("                padding: 2px;\r\n");
      out.write("                margin: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .privacy h2{\r\n");
      out.write("                margin-top: 25px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .settings h2{\r\n");
      out.write("                margin-top: 25px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .noshow {\r\n");
      out.write("                opacity: 0;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            footer {\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                width: 20%;\r\n");
      out.write("                bottom: 0;\r\n");
      out.write("                right: -20px;\r\n");
      out.write("                text-align: right;\r\n");
      out.write("                font-size: 0.8em;\r\n");
      out.write("                text-transform: uppercase;\r\n");
      out.write("                letter-spacing: 2px;\r\n");
      out.write("                font-family: body;\r\n");
      out.write("                p {\r\n");
      out.write("                    border: none;\r\n");
      out.write("                    padding: 0;\r\n");
      out.write("                }\r\n");
      out.write("/*                a {\r\n");
      out.write("                    color: #ffffff;\r\n");
      out.write("                    text-decoration: none;\r\n");
      out.write("                    &:hover {\r\n");
      out.write("                        color: #7d7d7d;\r\n");
      out.write("                    }\r\n");
      out.write("                }*/\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>   \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div id=\"logo\"><h1 class=\"logo\">Trainer</h1>\r\n");
      out.write("                <div class=\"CTA\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"leftbox\">\r\n");
      out.write("                <nav>\r\n");
      out.write("                    <a id=\"profile\" class=\"active\"><i class=\"fa fa-user\"></i></a>\r\n");
      out.write("                    <a id=\"payment\"><i class=\"fa fa-credit-card\"></i></a>\r\n");
      out.write("                    <a id=\"subscription\"><i class=\"fa fa-tv\"></i></a>\r\n");
      out.write("                    <a id=\"privacy\"><i class=\"fa fa-tasks\"></i></a>\r\n");
      out.write("                    <a id=\"settings\"><i class=\"fa fa-cog\"></i></a>\r\n");
      out.write("                </nav>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"rightbox\">\r\n");
      out.write("                <div class=\"profile\">\r\n");
      out.write("                    <h1>Options</h1>\r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trainer/insert.htm\">Create Trainer</a>\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trainer/getall.htm\">Read Trainer Details</a>\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trainer/getall.htm\">Delete Trainer</a>\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trainer/getall.htm\">Update Trainer</a>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"payment noshow\">\r\n");
      out.write("                    <h1>Payment Info</h1>\r\n");
      out.write("                    <h2>Payment Method</h2>\r\n");
      out.write("                    <p>Mastercard •••• •••• •••• 0000 <button class=\"btn\">update</button></p>\r\n");
      out.write("                    <h2>Billing Address</h2>\r\n");
      out.write("                    <p>1234 Example Ave | Seattle, WA <button class=\"btn\">change</button></p>\r\n");
      out.write("                    <h2>Zipcode</h2>\r\n");
      out.write("                    <p>999000</p>\r\n");
      out.write("                    <h2>Billing History</h2>\r\n");
      out.write("                    <p>2018<button class=\"btn\">view</button></p>\r\n");
      out.write("                    <h2>Redeem Gift Subscription </h2>\r\n");
      out.write("                    <p><input type=\"text\"/> <button class=\"btn\">Redeem</button></p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"subscription noshow\">\r\n");
      out.write("                    <h1>Your Subscription</h1>\r\n");
      out.write("                    <h2>Payment Date</h2>\r\n");
      out.write("                    <p>05-15-2018 <button class=\"btn\">pay now</button></p>\r\n");
      out.write("                    <h2>Your Next Charge</h2>\r\n");
      out.write("                    <p>$8.48<span> includes tax</span></p>\r\n");
      out.write("                    <h2>Hulu Base Plan</h2>\r\n");
      out.write("                    <p>Limited Commercials <button class=\"btn\">change plan</button></p>\r\n");
      out.write("                    <h2>Add-ons</h2>\r\n");
      out.write("                    <p>None <button class=\"btn\">manage</button></p>\r\n");
      out.write("                    <h2>Monthly Recurring Total </h2>\r\n");
      out.write("                    <p>$7.99/month</p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"privacy noshow\">\r\n");
      out.write("                    <h1>Privacy Settings</h1>\r\n");
      out.write("                    <h2>Manage Email Notifications<button class=\"btn\">manage</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Manage Privacy Settings<button class=\"btn\">manage</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>View Terms of Use <button class=\"btn\">view</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Personalize Ad Experience <button class=\"btn\">update</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Protect Your Account <button class=\"btn\">protect</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"settings noshow\">\r\n");
      out.write("                    <h1>Account Settings</h1>\r\n");
      out.write("                    <h2>Sync Watchlist to My Stuff<button class=\"btn\">sync</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Hold Your Subscription<button class=\"btn\">hold</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Cancel Your Subscription <button class=\"btn\">cancel</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Your Devices <button class=\"btn\">Manage Devices</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <h2>Referrals <button class=\"btn\">get $10</button></h2>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    <footer>\r\n");
      out.write("        <p>made by <a href=\"https://codepen.io/juliepark\"> julie</a> ♡\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trainer/insert.htm\">Insert Trainer</a>\r\n");
      out.write("    <br/><br/>\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/trainer/getall.htm\">Get All Trainers</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
