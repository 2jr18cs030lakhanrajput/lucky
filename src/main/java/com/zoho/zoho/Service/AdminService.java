package com.zoho.zoho.Service;

import com.zoho.zoho.Repository.AdminRepostory;
import com.zoho.zoho.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private AdminRepostory adminRepostory;


    public Admin saveDa(Admin admin) {
        Admin save = adminRepostory.save(admin);
       return save;

    }

    public Admin findbyid(long id) {
        Admin admin = adminRepostory.findById(id).get();
     return admin;
    }
}
