package com.zoho.zoho.controller;

import com.zoho.zoho.Repository.AdminRepostory;
import com.zoho.zoho.Service.AdminService;
import com.zoho.zoho.Service.UserService;
import com.zoho.zoho.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdminController {
    @Autowired
  private AdminService adminService;



    @PostMapping("/save")
    public ResponseEntity<Admin> savedata(@RequestBody Admin admin){
        Admin admin1 = adminService.saveDa(admin);
        return new ResponseEntity<>(admin1, HttpStatus.OK);

    }

    @GetMapping("/byid/{id}")
    public ResponseEntity<Admin> findid(@PathVariable("id") long id){
        Admin findbyid = adminService.findbyid(id);
        return new ResponseEntity<>(findbyid, HttpStatus.OK);

    }

}
