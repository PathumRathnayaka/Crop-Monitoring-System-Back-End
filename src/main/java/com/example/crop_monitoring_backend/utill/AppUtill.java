package com.example.crop_monitoring_backend.utill;

import java.util.UUID;

public class AppUtill {
    public static String generateCropCode(){
        return "CROP-"+ UUID.randomUUID();
    }

}
