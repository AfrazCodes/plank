//
// Image.java
// Autogenerated by plank
//
// DO NOT EDIT - EDITS WILL BE OVERWRITTEN
// @generated
//

package com.pinterest.models;

import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Image {

    @SerializedName("height") private @Nullable Integer height;
    @SerializedName("url") private @Nullable String url;
    @SerializedName("width") private @Nullable Integer width;
    
    static final private int HEIGHT_SET = 1 << 0;
    static final private int URL_SET = 1 << 1;
    static final private int WIDTH_SET = 1 << 2;
    
    private int _bits = 0;
    
    private Image(
        @Nullable Integer height
        @Nullable String url
        @Nullable Integer width
        int _bits
    ) {
        this.height = height;
        this.url = url;
        this.width = width;
        this._bits = _bits;
    }
    public static Image.Builder builder() {
        return new Image.Builder();
    }
    public Image.Builder toBuilder() {
        return new Image.Builder(this);
    }
    public Image mergeFrom(Image model) {
        Image.Builder builder = this.toBuilder();
        builder.mergeFrom(model);
        return builder.build();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image that = (Image) o;
        return Objects.equals(this.height, that.height) &&
        Objects.equals(this.url, that.url) &&
        Objects.equals(this.width, that.width);
    }
    @Override
    public int hashCode() {
        return Objects.hash(height,
        url,
        width);
    }
    public @Nullable Integer getHeight() {
        return this.height;
    }
    public @Nullable String getUrl() {
        return this.url;
    }
    public @Nullable Integer getWidth() {
        return this.width;
    }
    public boolean getHeightIsSet() {
        return (this._bits & HEIGHT_SET) == HEIGHT_SET;
    }
    public boolean getUrlIsSet() {
        return (this._bits & URL_SET) == URL_SET;
    }
    public boolean getWidthIsSet() {
        return (this._bits & WIDTH_SET) == WIDTH_SET;
    }
    public static class Builder {
    
        @SerializedName("height") private @Nullable Integer height;
        @SerializedName("url") private @Nullable String url;
        @SerializedName("width") private @Nullable Integer width;
        
        private int _bits = 0;
        
        private Builder() {
        
        }
        private Builder(@NonNull Image model) {
            this.height = model.height;
            this.url = model.url;
            this.width = model.width;
            this._bits = model._bits;
        }
        public Builder setHeight(@Nullable Integer value) {
            this.height = value;
            this._bits |= HEIGHT_SET;
            return this;
        }
        public Builder setUrl(@Nullable String value) {
            this.url = value;
            this._bits |= URL_SET;
            return this;
        }
        public Builder setWidth(@Nullable Integer value) {
            this.width = value;
            this._bits |= WIDTH_SET;
            return this;
        }
        public @Nullable Integer getHeight() {
            return this.height;
        }
        public @Nullable String getUrl() {
            return this.url;
        }
        public @Nullable Integer getWidth() {
            return this.width;
        }
        public Image build() {
            return new Image(
            this.height,
            this.url,
            this.width,
            this._bits
            );
        }
        public void mergeFrom(Image model) {
            if (model.getHeightIsSet()) {
                this.height = model.height;
            }
            if (model.getUrlIsSet()) {
                this.url = model.url;
            }
            if (model.getWidthIsSet()) {
                this.width = model.width;
            }
        }
    
    }
}
