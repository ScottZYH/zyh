package ssm.service;
import ssm.entity.Visitor;

public interface VisitorService {
    void regist(Visitor visitor);
    void login(String name,String password);
}
