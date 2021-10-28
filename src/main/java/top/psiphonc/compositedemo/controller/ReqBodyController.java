package top.psiphonc.compositedemo.controller;

import org.springframework.web.bind.annotation.*;
import top.psiphonc.compositedemo.entity.Student;

@RestController
@RequestMapping("/reqbody")
public class ReqBodyController {
    @PostMapping("/stu")
    Student stuPost(@RequestBody Student stu) {
        System.out.println(stu);
        return stu;
    }
}
