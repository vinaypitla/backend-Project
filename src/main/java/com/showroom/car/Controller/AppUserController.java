package com.showroom.car.Controller;

import com.showroom.car.Entity.AppUser;
import com.showroom.car.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    // Register a new user
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody AppUser user) {
        try {
            AppUser savedUser = appUserService.registerUser(user);
            return ResponseEntity.ok(savedUser);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error registering user: " + e.getMessage());
        }
    }

    @RequestMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody AppUser user) {
        Optional<AppUser> authenticatedUser = appUserService.authenticate(user.getEmail(), user.getPassword());

        if (authenticatedUser.isPresent()) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}
