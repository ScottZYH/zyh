package ssm.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.DeptDao;
import ssm.entity.Dept;
import ssm.service.DeptService;
import java.util.List;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> findAllDepts() {
        return deptDao.queryAllDepts();
    }

    @Override
    public void addDept(Dept dept) {
        deptDao.insertDept(dept);
    }

    @Override
    public void removeDeptById(Integer id) {
        deptDao.deleteDeptById(id);
    }

    @Override
    public Dept findDeptById(Integer id) {
        return deptDao.queryDeptById(id);
    }

    @Override
    public void editDeptById(Dept dept) {
        deptDao.updateDeptById(dept);
    }
}
