package ssm.dao;
import ssm.entity.Dept;
import java.util.List;

public interface DeptDao {
    public List<Dept> queryAllDepts();
    public void insertDept(Dept dept);
    public void deleteDeptById(Integer id);
    public Dept queryDeptById(Integer id);
    public void updateDeptById(Dept dept);
}
