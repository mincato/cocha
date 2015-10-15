package com.cocha.hotels.model.content.geo;

import java.io.Serializable;

import com.google.common.base.Objects;

public class RegionKey implements Serializable {

    private static final long serialVersionUID = 1583125273900651441L;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RegionKey) {
            final RegionKey other = (RegionKey) obj;
            return Objects.equal(id, other.id);
        } else {
            return false;
        }
    }
}
