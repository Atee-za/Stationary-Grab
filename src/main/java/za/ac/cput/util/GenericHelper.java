package za.ac.cput.util;

import java.util.UUID;

public class GenericHelper {

    public static String generateId(){
        return UUID.randomUUID().toString();
    }

    public static boolean isEmptyOrNull(String data){
        return data.isEmpty() || data == null || data.equalsIgnoreCase("null");
    }
}
