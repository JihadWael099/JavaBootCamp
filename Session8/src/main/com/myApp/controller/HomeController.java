package main.com.myApp.controller;

import main.com.myApp.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController
{

    @RequestMapping("/showForm")
    public String showHomePage(Model model)
    {
        model.addAttribute("userModel" , new UserModel());
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model)
    {
        int year=Integer.parseInt(request.getParameter("year"));
        int month=Integer.parseInt(request.getParameter("month"));
        int day=Integer.parseInt(request.getParameter("day"));

        int total=year*365+month*30+day;

        model.addAttribute("total", total);

        return "resultPage";
    }

    @RequestMapping("/showTestForm")
    public String showTestForm()
    {
        return "test";
    }
}