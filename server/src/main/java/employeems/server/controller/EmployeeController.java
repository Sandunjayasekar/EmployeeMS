package employeems.server.controller;

import employeems.server.dto.EmployeeDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @PostMapping(value = "/saveEmployee")
    public ResponseEntity saveemployee(@RequestBody EmployeeDTO employeeDTO){


    }
}
