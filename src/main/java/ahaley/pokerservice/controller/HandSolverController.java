package ahaley.pokerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hand-solver")
public class HandSolverController {

    @GetMapping("/")
    public ResponseEntity<String> health() {return new ResponseEntity<String>("OK", HttpStatus.OK);}

}