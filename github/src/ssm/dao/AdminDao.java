package ssm.dao;
import ssm.entity.Admin;

public interface AdminDao {
    public Admin queryAdminByNameAndPassword(String name, String password);
}
