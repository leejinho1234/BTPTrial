package Secondapp;

import Secondapp.dto.TestDto;
import Secondapp.service.ExcelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;

@WebServlet("/excel")
public class excelServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public excelServlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("doGet");
        //res.sendRedirect("excelTest.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        System.out.println("req : " + req.toString());
        System.out.println("res : " + resp.toString());
        //super.doPost(req, resp);
    }
}
