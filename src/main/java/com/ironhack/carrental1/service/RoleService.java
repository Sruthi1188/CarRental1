package com.ironhack.carrental1.service;



import com.ironhack.carrental1.model.Role;

public interface RoleService {


    Role save(Role role);


    void addRoleToUser(String username, String roleName);
}