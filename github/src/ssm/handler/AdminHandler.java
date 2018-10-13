package ssm.handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.service.AdminService;
@RequestMapping("admin")
@Controller
public class AdminHandler {
    @Autowired
    private AdminService adminService;

    @RequestMapping("login")
    public String login(String name, String password, Model model){
        System.out.println("管理员登陆："+name+password);
        adminService.login(name,password);
        model.addAttribute("msg","登陆成功");
        return "success";
    }
}
