package com.example.todolistwebapp.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
   USER;

   @Override
   public String getAuthority() {
      return name();
   }
}
