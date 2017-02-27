/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itk.chaabouni.dto;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mchaabouni
 */
@Named(value = "classifiedAd")
@ViewScoped
public class ClassifiedAd implements Serializable {
    @NotNull
    String creator; //should be Employee
    Date creationDate; 
    @NotNull @Size(min=0, max=50)
    String title;
    @Size(min=10, max=255)
    String description; 

     /**
     * Creates a new instance of ClassifiedAd
     */
    public ClassifiedAd() {
    }

    public ClassifiedAd(String creator, Date creationDate, String title, String description) {
        this.creator = creator;
        this.creationDate = creationDate;
        this.title = title;
        this.description = description;
    }
    
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   
}
