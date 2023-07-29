package com.example.lesson_95.util;

import com.example.lesson_95.config.security.CustomUserDetails;
import com.example.lesson_95.enums.ProfileRole;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SpringSecurityUtil {
    public static String getCurrentUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        return username;
    }
    public static UserDetails getUserDetails() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails)authentication.getPrincipal();
        return userDetails;
    }

    public static String getProfileId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails userDetails = (CustomUserDetails )authentication.getPrincipal();
        return userDetails.getProfileEntity().getId();
    }
    public static ProfileRole getProfileRole() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails userDetails = (CustomUserDetails )authentication.getPrincipal();
        return userDetails.getProfileEntity().getRole();
    }
}
