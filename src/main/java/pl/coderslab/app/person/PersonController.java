package pl.coderslab.app.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("person", new Person());
        return "person";
    }

    @PostMapping("/add")
    @ResponseBody
    public String addPost(@ModelAttribute Person person) {
        personDao.create(person);
        return person.toString();
    }

}