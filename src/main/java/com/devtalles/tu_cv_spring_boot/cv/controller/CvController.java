package com.devtalles.tu_cv_spring_boot.cv.controller;

import com.devtalles.tu_cv_spring_boot.cv.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cv")
public class CvController {
    @GetMapping({"/Jesus", "", "/"})
    public String jesus(Model model){
        Person person = new Person("Jesus", "De Nazareth" , "Dios");
        model.addAttribute("name", "Je");
        model.addAttribute("person", person);
        return "Jesus";
    }

//    @GetMapping("/Diego")
//    public String diego(){
//        return "Diego";
//    }
}
