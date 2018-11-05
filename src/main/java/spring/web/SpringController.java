package spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spring.data.SpringRepository;

/**
 * @author gglip
 */
@Controller
@RequestMapping("/spring")
public class SpringController {

    private SpringRepository springRepository;

    @Autowired
    public SpringController(SpringRepository springRepository){
        this.springRepository = springRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spring(Model model) {
        springRepository.findResults();
        return "spring";
    }

}
