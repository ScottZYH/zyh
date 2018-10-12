package ssm.service.impl;
import ssm.dao.VisitorDao;
import ssm.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.service.VisitorService;
@Service("visitorService")
public class VisitorServiceImpl implements VisitorService {
    @Autowired
    private VisitorDao visitorDao;
    @Override
    public void regist(Visitor visitor) {
        visitorDao.addVisitor(visitor);
    }

    @Override
    public void login(String name, String password) {
        visitorDao.queryVisitorByNameAndPassword(name,password);
    }
}
