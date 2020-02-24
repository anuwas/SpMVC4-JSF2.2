package com.ca.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

@Named("dtBasicView")
@ViewScoped
public class BusBasicView implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Bus> busses;
    
    @Autowired
    private BusService service;
 
    @PostConstruct
    public void init() {
    	busses = service.createBus(10);
    }
     
    public List<Bus> getCars() {
        return busses;
    }
 
    public void setService(BusService service) {
        this.service = service;
    }
}
