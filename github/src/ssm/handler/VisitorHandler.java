package ssm.handler;
import ssm.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.VisitorService;

@RequestMapping("visitor")
@Controller
public class VisitorHandler {
    @Autowired
    private VisitorService visitorService;
    @RequestMapping("regist")
    public String regist(Visitor visitor, Model model){
        System.out.println("游客注册："+visitor.getName()+visitor.getPassword());
        visitor.setId(1);
        visitorService.regist(visitor);
        model.addAttribute("msg","注册成功");
        return "success";
    }

    @RequestMapping("login")
    public String login(String name,String password,Model model){
        System.out.println("游客登陆："+name+password);
        visitorService.login(name,password);
        model.addAttribute("msg","登陆成功");
        return "success";
    }
}
