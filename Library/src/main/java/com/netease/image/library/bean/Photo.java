package com.netease.image.library.bean;

import java.io.Serializable;

public class Photo implements Serializable {

    /**
     * 图片原始路径
     */
    private String originalPath;
    /**
     * 是否压缩过
     */
    private boolean compressed;
    /**
     * 压缩后路径
     */
    private String compressPath;
    /**
     * 图片类型
     */
    private int type;

    public Photo(String originalPath) {
        this.originalPath = originalPath;
    }

    public Photo(String originalPath, int type) {
        this.originalPath = originalPath;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOriginalPath() {
        return originalPath;
    }

    public void setOriginalPath(String originalPath) {
        this.originalPath = originalPath;
    }

    public String getCompressPath() {
        return compressPath;
    }

    public void setCompressPath(String compressPath) {
        this.compressPath = compressPath;
    }

    public boolean isCompressed() {
        return compressed;
    }

    public void setCompressed(boolean compressed) {
        this.compressed = compressed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Photo) {
            Photo photo = (Photo) o;
            return originalPath.equals(photo.originalPath);
        }
        return super.equals(o);
    }

}
