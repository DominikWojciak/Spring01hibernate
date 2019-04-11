package pl.coderslab.app.student;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "student";
    }

    @PostMapping("/add")
    @ResponseBody
    public String add(@ModelAttribute Student student) {
        return student.toString();
    }

    @ModelAttribute("countries")
    List<String> getCountries() {
        List<String> countries = new ArrayList<>();
        countries.add("Polska");
        countries.add("Portugalia");
        countries.add("Francja");
        return countries;
    }

    @ModelAttribute("skills")
    List<String> getSkills() {
        List<String> skills = new ArrayList<>();
        skills.add("PHP");
        skills.add("Java");
        skills.add("Python");
        return skills;
    }

    @ModelAttribute("hobbies")
    List<String> getHobbies() {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("bicycle");
        hobbies.add("football");
        hobbies.add("running");
        return hobbies;
    }
}