package ssundev.ssundevproject.mainController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class MainController {
    @GetMapping("/hi")
    public String ControllerMain(Model model){
        System.out.println("진입");
        log.info("진입");
        model.addAttribute("test","성공");

        return "main";
    }

    /*    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("ControllerTest","테스트성공");
        return "templates/main.html";
    }*/
}
