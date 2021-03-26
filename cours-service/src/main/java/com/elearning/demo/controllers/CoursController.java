package com.elearning.demo.controllers;

import com.elearning.demo.models.ModuleList;
import com.elearning.demo.models.Modules;
import com.elearning.demo.services.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursController {

    private ModuleService service;

    @Autowired
    public CoursController(ModuleService service){
        this.service = service;
    }
    @RequestMapping("/")
    public ModuleList AllModules() {
        ModuleList moduleList = new ModuleList();
        if(service.listAll()==null){
            return moduleList;
        }

        List<Modules> listModules = service.listAll();
        moduleList.setModuleList(listModules);
        return moduleList;
    }
    @RequestMapping(value = "/save/{id}/{credit}/{coe}/{cours}/{td}/{tp}/{name}/{last}/{email}")
    public Modules saveModule(@PathVariable(name="id") int id,
                                  @PathVariable(name="credit") int credit,
                                  @PathVariable(name="coe") int coe,
                                  @PathVariable(name="cours") double cours,
                                  @PathVariable(name="td") double td,
                                  @PathVariable(name="tp") double tp,
                                  @PathVariable(name="name") String name,
                                  @PathVariable(name="last") String last,
                                  @PathVariable(name="email") String email) {

        Modules modules ;
        if(id>0){
            modules = new Modules(id,credit,coe,cours,td,tp,name,last,email);
        }else
            modules = new Modules(-1,credit,coe,cours,td,tp,name,last,email);
        service.save(modules);
        return modules;
    }
    @RequestMapping("/delete/{id}")
    public String deleteModule(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }
    @RequestMapping("/{id}")
    public Modules getModule(@PathVariable(name = "id") long id) {
        Modules modules = service.get(id);
        return modules;
    }
}
