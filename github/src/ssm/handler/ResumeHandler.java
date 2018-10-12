package ssm.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.entity.Resume;
import ssm.service.ResumeService;

@RequestMapping("resume")
@Controller
public class ResumeHandler {
    @Autowired
    private ResumeService resumeService;
    @RequestMapping("add")
    public String add(Resume resume, Model model){
        resumeService.add(resume);
        model.addAttribute("msg","成功");
        return "success";
    }
}
