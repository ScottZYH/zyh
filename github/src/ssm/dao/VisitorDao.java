package ssm.dao;
import ssm.entity.Visitor;

public interface VisitorDao {
    public void addVisitor(Visitor visitor);
    public Visitor queryVisitorByNameAndPassword(String name,String password);
}
