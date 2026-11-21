
package com.azhan.personalprofileapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        // Receive data from HTML form
        String name = request.getParameter("name");
        String studentId = request.getParameter("studentId");
        String program = request.getParameter("program");
        String email = request.getParameter("email");
String[] hobbies = request.getParameterValues("hobbies");

String hobbiesText;

if (hobbies != null) {
    hobbiesText = String.join(", ", hobbies);
} else {
    hobbiesText = "No hobbies selected";
}
        String introduction = request.getParameter("introduction");

        // Store data for JSP
        request.setAttribute("name", name);
        request.setAttribute("studentId", studentId);
        request.setAttribute("program", program);
        request.setAttribute("email", email);
        request.setAttribute("hobbies", hobbies);
        request.setAttribute("hobbiesText", hobbiesText);
        request.setAttribute("introduction", introduction);

        // Forward data to JSP page
        request.getRequestDispatcher("result.jsp")
                .forward(request, response);
    }
}
