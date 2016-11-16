package com.sparklit.adbutler;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ryuichis on 11/14/16.
 */

public class Placement {
    private int bannerId;
    private String redirectUrl;
    private String imageUrl;
    private int width;
    private int height;
    private String altText;
    private String target;
    private String trackingPixel;
    private String accupixelUrl;
    private String refreshUrl;
    private String refreshTime;
    private String body;

    public int getBannerId() {
        return bannerId;
    }

    public void setBannerId(int bannerId) {
        this.bannerId = bannerId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getTrackingPixel() {
        return trackingPixel;
    }

    public void setTrackingPixel(String trackingPixel) {
        this.trackingPixel = trackingPixel;
    }

    public String getAccupixelUrl() {
        return accupixelUrl;
    }

    public void setAccupixelUrl(String accupixelUrl) {
        this.accupixelUrl = accupixelUrl;
    }

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public String getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(String refreshTime) {
        this.refreshTime = refreshTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}

