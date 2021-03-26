package com.elearning.teacher.services;

import com.elearning.teacher.dao.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.elearning.teacher.models.Teacher;
import java.util.List;

@Service
@Transactional
public class TeacherService {

    @Autowired
    private TeacherRepository repo;

    @Autowired
    public TeacherService(TeacherRepository repo){
        this.repo = repo;
    }
    public TeacherService(){}
    public List<Teacher> listAll() {
        return repo.findAll();
    }

    public void save(Teacher teacher) {
        repo.save(teacher);
    }

    public Teacher get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
