package spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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


    }

}
