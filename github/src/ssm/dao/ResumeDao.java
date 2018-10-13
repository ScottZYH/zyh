package ssm.dao;
import ssm.entity.Resume;
import java.util.List;

public interface ResumeDao {
    public List<Resume> queryAllResumes();
    public void addResume(Resume resume);
}
