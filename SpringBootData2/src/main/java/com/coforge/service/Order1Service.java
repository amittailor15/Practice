package com.coforge.service;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;

import com.coforge.dao.Order1Repository;

import com.coforge.exception.Order1Exception;

import com.coforge.model.Order1;

@Service

public class Order1Service {

 @Autowired

 Order1Repository serviceRepository;

 public List<Order1> getAllOrder1s() throws Order1Exception{

 if(serviceRepository.findAll().isEmpty()) {

  throw new Order1Exception("Order1 list is empty");

 }else {

  return serviceRepository.findAll();

 }

 }

 public Order1 addOrder1(Order1 p) throws Order1Exception {

 Optional<Order1> findById = serviceRepository.findById(p.getOrderId());

 if(findById.isEmpty()) {

  serviceRepository.save(p);

  return p;

 }else {

  throw new Order1Exception("Order1 is already present");

 }

 }

 public Order1 removeOrder1(long id) throws Order1Exception {

 Optional<Order1> findById = serviceRepository.findById(id);

 if(findById.isEmpty()) {

  throw new Order1Exception("Order1 is not present");

 }else {

  serviceRepository.deleteById(id);

  return findById.get();

 }

 }

 public Order1 searchOrder1(long id) throws Order1Exception {

 Optional<Order1> findById = serviceRepository.findById(id);

 if(findById.isEmpty()) {

  throw new Order1Exception("Order1 is not present");

 }else {

  return findById.get();

 }

 }

 public Order1 updateOrder1(Order1 p) throws Order1Exception {

 Optional<Order1> findById = serviceRepository.findById(p.getOrderId());

 if(findById.isEmpty()) {

  throw new Order1Exception("Order1 is not updated");

 }else {

  serviceRepository.save(p);

  return p;

 }

 }

}


