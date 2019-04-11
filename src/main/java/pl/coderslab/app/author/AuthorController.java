package pl.coderslab.app.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;


    @GetMapping("/list")
    public String getList(Model model) {
        List<Author> authors = authorService.findAll();
        model.addAttribute("authors", authors);
        return "authorList";
    }

    @GetMapping("/add")
    public String addAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "author";
    }

    @PostMapping("/add")
    public String addAuthor(@ModelAttribute Author author, BindingResult result){
        authorService.create(author);
        return "redirect:list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Author author = authorService.read(id);
        model.addAttribute("author", author);
        return "author";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute Author author, BindingResult result) {
        authorService.update(author);
        return "redirect:../list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        authorService.delete(id);
        return "redirect:../list";
    }


}