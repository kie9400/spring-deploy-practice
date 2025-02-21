package com.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class DockerController {
    @GetMapping("/hello")
    public String getDocker(){
        return "Hello World";
    }

    @GetMapping("/member/{member-id}")
    public ResponseEntity getDocker2(@PathVariable("member-id") long memberId){
        Map<String, Object> members = new LinkedHashMap<>();
        members.put("sabun", memberId);
        members.put("name", "hong gildong");
        members.put("dept_cd", "CS001023004");
        members.put("dept_nm", "컨테이너 실습");
        members.put("role_cd", "EEF9852");
        members.put("role_nm", "STUDENT");

       return new ResponseEntity<>(members, HttpStatus.OK);
    }

    @GetMapping("/dept/{member-id}")
    public ResponseEntity getDocker3(@PathVariable("member-id") long deptId){
        Map<String, Object> members = new LinkedHashMap<>();
        members.put("id", deptId);
        members.put("dept_cd", "CS001023004");
        members.put("dept_nm", "컨테이너 실습");
        members.put("level", 3);
        members.put("rel_dept_cd", "CS0010230000");
        members.put("rel_dept_nm", "수강생대표팀");

        return new ResponseEntity<>(members, HttpStatus.OK);
    }
}
