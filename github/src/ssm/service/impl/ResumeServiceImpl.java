package ssm.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.ResumeDao;
import ssm.entity.Resume;
import ssm.service.ResumeService;

@Service("resumeService")
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;
    @Override
    public void add(Resume resume) {
        resumeDao.addResume(resume);
    }
}
