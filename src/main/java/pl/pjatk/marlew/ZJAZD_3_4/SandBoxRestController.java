package pl.pjatk.marlew.ZJAZD_3_4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandBoxRestController {

    @GetMapping("/exception")
    public ResponseEntity<String> exception() {
        throw new RuntimeException("ćwiczenie 1 - 1");
    }
}
