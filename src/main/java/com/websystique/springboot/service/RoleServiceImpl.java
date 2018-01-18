package com.websystique.springboot.service;

import com.websystique.springboot.model.Role;

import java.util.List;

import java.util.List;

import com.websystique.springboot.model.User;
import com.websystique.springboot.repositories.RoleRepository;
import com.websystique.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    public Role findById(Long id) {
        return roleRepository.findOne(id);
    }

    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }

    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public void updateRole(Role role){
        saveRole(role);
    }

    public void deleteRoleById(Long id){
        roleRepository.delete(id);
    }

    public void deleteAllRoles(){
        roleRepository.deleteAll();
    }

    public List<Role> findAllRoles(){
        return roleRepository.findAll();
    }

    public boolean isRoleExist(Role role) {
        return findByName(role.getRoleTitle()) != null;
    }

}