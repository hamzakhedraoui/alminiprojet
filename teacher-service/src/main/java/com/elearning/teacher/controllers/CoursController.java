package com.elearning.teacher.controllers;

import com.elearning.teacher.models.Teacher;
import com.elearning.teacher.models.TeacherList;
import com.elearning.teacher.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursController {


    private TeacherService service;
    @Autowired
    public CoursController(TeacherService service){
        this.service = service;
    }
    @RequestMapping("/")
    public TeacherList AllModules() {
        List<Teacher> listTeachers = service.listAll();
        TeacherList teacherList = new TeacherList();
        teacherList.setTeachersList(listTeachers);
        return teacherList;
    }
    @RequestMapping(value = "/save/{id}/{fname}/{lname}/{email}/{pass}")
    public Teacher saveTeacher(@PathVariable("id") int id,
                                   @PathVariable("fname") String fname,
                                   @PathVariable("lname") String lname,
                                   @PathVariable("email") String email,
                                   @PathVariable("pass") String pass) {
        Teacher teacher ;
        if(id>0){
            teacher = new Teacher(id,fname,lname,email,pass);
        }else
            teacher = new Teacher(-1,fname,lname,email,pass);
        service.save(teacher);
        return teacher;
    }
    @RequestMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "";
    }
    @RequestMapping("/{id}")
    public Teacher getTeacher(@PathVariable(name = "id") long id) {
        Teacher teacher = service.get(id);
        return teacher;
    }
}
