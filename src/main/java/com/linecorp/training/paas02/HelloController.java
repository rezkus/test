
package com.linecorp.training.paas02;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/")
public class HelloController
{
    @GetMapping(value="/hello")
    public ResponseEntity<String> hello(@RequestParam(value="name", required=false) String aName)
    {
        // compose head
        final String head="<head><title>Spring Hello</title></head>";

        // compose body
        final String body="<body>Hello " + aName + "!</body>";

        // compose html
        final String html="<html>"+head+body+"</html>";

        return new ResponseEntity<String>(html, HttpStatus.OK);
    }
};
