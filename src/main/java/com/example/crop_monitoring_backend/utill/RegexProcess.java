package com.example.crop_monitoring_backend.utill;

import java.util.regex.Pattern;

public class RegexProcess {
    public static boolean cropIdMatcher(String cropId) {
        String regexForUserID = "^Crop-[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";
        Pattern regexPattern = Pattern.compile(regexForUserID);
        return regexPattern.matcher(cropId).matches();
    }
    public static boolean fieldIdMatcher(String fieldId) {
        String regexForUserID = "^Field-[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";
        Pattern regexPattern = Pattern.compile(regexForUserID);
        return regexPattern.matcher(fieldId).matches();
    }
    public static boolean staffIdMatcher(String staffId) {
        String regexForStaffId = "^Staff-[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";
        Pattern regexPattern = Pattern.compile(regexForStaffId);
        return regexPattern.matcher(staffId).matches();
    }

    public static boolean vehicleIdMatcher(String vehicleId) {
        String regexForVehicleId = "^Vehicle-[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";
        Pattern regexPattern = Pattern.compile(regexForVehicleId);
        return regexPattern.matcher(vehicleId).matches();
    }

    public static boolean equipmentIdMatcher(String equipmentId) {
        String regexForEquipmentId = "^Equipment-[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$";
        Pattern regexPattern = Pattern.compile(regexForEquipmentId);
        return regexPattern.matcher(equipmentId).matches();
    }
}
