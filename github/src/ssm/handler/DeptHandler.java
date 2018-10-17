package ssm.handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.entity.Dept;
import ssm.service.DeptService;
import java.util.List;
@RequestMapping("dept")
@Controller
public class DeptHandler {
    @Autowired
    private DeptService deptService;
    @RequestMapping("findAllDepts")
    public String findAllDepts(Model model){
        List<Dept> depts = deptService.findAllDepts();
        model.addAttribute("depts",depts);
        return "dept/show";
    }

    @RequestMapping("addDept")
    public String addDept(Dept dept){
        deptService.addDept(dept);
        return "forward:findAllDepts";
    }

    @RequestMapping("deleteDeptById")
    @ResponseBody
    public String deleteDeptById(Integer id){
        deptService.removeDeptById(id);
        return "删除成功";
    }

    @RequestMapping("editDept")
    public String editDeptById(Dept dept){
        deptService.editDeptById(dept);
        return "forward:findAllDepts";
    }
}
