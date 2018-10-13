package ssm.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.AdminDao;
import ssm.service.AdminService;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public void login(String name, String password) {
        adminDao.queryAdminByNameAndPassword(name,password);
    }
}
