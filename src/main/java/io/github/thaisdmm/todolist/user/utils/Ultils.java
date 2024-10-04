package io.github.thaisdmm.todolist.user.utils;

import org.hibernate.type.descriptor.java.StringJavaType;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;


public class Ultils {

  public String[] getNullPropertyNames(Object source) {
    final BeanWrapper src = new BeanWrapperImpl (source);
    
    
  }
  
}
