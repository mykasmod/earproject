package com.asmod.earproject;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SomeSessionBean
 */
@Stateless
@LocalBean
public class SomeSessionBean {

    /**
     * Default constructor. 
     */
    public SomeSessionBean() {
    }
    public String someSessionBeanMethod(){
    	return "someSessionBeanMethod executed";
    }
}
