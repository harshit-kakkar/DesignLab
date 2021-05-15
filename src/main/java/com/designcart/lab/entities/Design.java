package com.designcart.lab.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Design {

    @Id
    @GeneratedValue
    private Integer id;
    private String style;
    private String baseColor;
    private Integer overlaySize;
    private String overlayColor;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getBaseColor() {
        return baseColor;
    }

    public void setBaseColor(String baseColor) {
        this.baseColor = baseColor;
    }

    public Integer getOverlaySize() {
        return overlaySize;
    }

    public void setOverlaySize(Integer overlaySize) {
        this.overlaySize = overlaySize;
    }

    public String getOverlayColor() {
        return overlayColor;
    }

    public void setOverlayColor(String overlayColor) {
        this.overlayColor = overlayColor;
    }


}
