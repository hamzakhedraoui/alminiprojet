package com.elearning.demo.services;

import com.elearning.demo.dao.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.elearning.demo.models.Modules;
import java.util.List;

@Service
@Transactional
public class ModuleService {

    @Autowired
    private ModuleRepository repo;

    @Autowired
    public ModuleService(ModuleRepository repo){
        this.repo = repo;
    }
    public ModuleService(){}
    public List<Modules> listAll() {
        return repo.findAll();
    }

    public void save(Modules modules) {
        repo.save(modules);
    }

    public Modules get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
