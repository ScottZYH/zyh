package ssm.service;
import ssm.entity.Dept;
import java.util.List;

public interface DeptService {
    public List<Dept> findAllDepts();
    public void addDept(Dept dept);
    public void removeDeptById(Integer id);
    public Dept findDeptById(Integer id);
    public void editDeptById(Dept dept);
}
