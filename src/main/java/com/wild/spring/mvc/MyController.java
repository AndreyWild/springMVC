package com.wild.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // аннотация - класс является контроллером
public class MyController {

    @RequestMapping("/") // связывает URL адрес методом контроллера
    public String showFirstView(){
        return "first-view"; // ссылка на first-view.jsp
    }

    @RequestMapping("/wild") // связывает URL адрес методом контроллера
    public String showWildView(){
        return "wild-view"; // ссылка на wild-view.jsp
    }

    @RequestMapping("/askDetails") //
    public String askEmployeeDetails(){ return "ask-emp-details-view"; }

    @RequestMapping("/showDetails") //
    public String showEmpDetails(){
        return "show-emp-details-view";
    }

}
