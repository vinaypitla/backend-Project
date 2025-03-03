package com.showroom.car.Service;

import com.showroom.car.Entity.AppUser;
import com.showroom.car.Repo.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository userRepository;

    public AppUser registerUser(AppUser user) {
        if (userRepository.existsById(user.getEmail())) {
            throw new RuntimeException("Email already registered!");
        }
        return userRepository.save(user);
    }

    public Optional<AppUser> authenticate(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }

	public AppUser getProfile(String email) {
		// TODO Auto-generated method stub
		return userRepository.findById(email).orElse(new AppUser());
	}
}
