package com.example.security_demo.config;

import com.example.security_demo.entity.UserInfo;
import com.example.security_demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserInfoRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserInfo> userInfo = repository.findByName(username);
            return userInfo.map(CustomUserDetails::new)
                    .orElseThrow(()-> new UsernameNotFoundException("User Nahi Mila Bhai"));

//        if(user==null) throw new UsernameNotFoundException("User Nahi Mila Bhai");
//        else
            //return new CustomUserDetails(user);
    }
}
