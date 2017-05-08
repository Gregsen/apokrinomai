package io.github.gregsen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/")
public class ApiController {

    @RequestMapping(value = "/*", method = GET)
    ResponseEntity<?> fetch(@PathVariable String path){

        return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
    }

}
