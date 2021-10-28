package top.psiphonc.compositedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/pathvar")
public class PathVariableController {
    @GetMapping("/int/{i}")
    String intGet(@PathVariable("i") Integer i, HttpServletRequest request) {
        System.out.println(request);
        return String.format("<h1>%d %s</h>", i, i.getClass());
    }

    @GetMapping("/string/{s}")
    String strGet(@PathVariable("s") String s) {
        return String.format("<h1>%s %s</h>", s, s.getClass());
    }
}
