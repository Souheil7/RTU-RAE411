package com.code.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("code-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
