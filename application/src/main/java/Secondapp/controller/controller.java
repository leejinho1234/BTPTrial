package Secondapp.controller;

import Secondapp.dto.TestDto;
import Secondapp.service.ExcelService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.text.ParseException;
/*
@Controller
public class controller implements WebMvcConfigurer {
    @RequestMapping(value = "/home/test", method = RequestMethod.POST)
    @ResponseBody
    public String homeTest(TestDto param) throws IOException, ParseException {
        ExcelService excelService = new ExcelService();
        excelService.ExcelSer(param);
        System.out.println("Controller");
        return "";
    }

}
*/

