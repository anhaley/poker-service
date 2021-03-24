package ahaley.pokerservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hand-solver")
public class HandSolverController {

    @PostMapping("/rank")
    public int handRanker(String cards) throws Exception {
        throw new Exception("not implemented");
    }

//    @PostMapping("/hands")
//    public Hand handSolver(Hand hands) {}

}