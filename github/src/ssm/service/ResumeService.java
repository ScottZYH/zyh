package ssm.service;
import ssm.entity.Resume;
import java.util.List;

public interface ResumeService {
    void add(Resume resume);
    public List<Resume> findAllResumes();
}
