package com.example.savepassword.service;


import com.example.savepassword.config.SecurityConfig;
import com.example.savepassword.entity.SaveUser;
import com.example.savepassword.repository.SaveUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SaveUserService {

    //addsaveuser

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder; //password encode
    @Autowired
    private SaveUserRepository saveUserRepository;


//    public SaveUserService(SaveUserRepository saveUserRepository, SecurityConfig securityConfig) {
//        this.saveUserRepository = saveUserRepository;
//        this.securityConfig = securityConfig;
//    }

    public SaveUser addSaveUser(SaveUser saveUser) {
        // Ensure this is a create operation — ignore client-provided id
        saveUser.setId(null);

        String password = saveUser.getPassword();
        String hashed = bCryptPasswordEncoder.encode(password);
        saveUser.setPassword(hashed);
        return saveUserRepository.save(saveUser);
    }


    // aman 1234
    //
    //aman hkdhgkdh
    // aman hshdskhdk

}
