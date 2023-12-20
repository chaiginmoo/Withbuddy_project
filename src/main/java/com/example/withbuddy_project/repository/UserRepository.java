package com.example.withbuddy_project.repository;

import com.example.withbuddy_project.domain.dto.AddressUserDto;

import java.util.List;

public interface UserRepository {
    AddressUserDto findByAddressId(String addressName);

}