package com.example.demo.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;

@Component
public class JwtTokenUtil {
	private static final String secreatekey="your-secret-key";
   private static final long expirationtime=864_000_000;
   
   public String generateToken(User user)
   {
	return null;
	   
   }
   
   public boolean validateToken(String token ,UserDetails userDetails)
   {
	return false;
	
	   
   }
   
   public String extractUsername(String token)
   {
	return token;
	
   }
   
   
   
   
   
   
   
}
