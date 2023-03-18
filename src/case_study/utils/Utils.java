package case_study.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    private static final String REGEX_SERVICE_HOUSE="^(SVHO-)[0-9]{4}$";
    private static final String REGEX_SERVICE_Villa="^(SVVL-)[0-9]{4}$";
    private static final String REGEX_SERVICE_Room="^(SVRO-)[0-9]{4}$";
    public static boolean checkValidateHouse(String serviceID) {
        Pattern pattern= Pattern.compile(REGEX_SERVICE_HOUSE);
        Matcher matcher= pattern.matcher(serviceID);
        return matcher.matches();
    }
    public static boolean checkValidateVilla(String serviceID) {
        Pattern pattern= Pattern.compile(REGEX_SERVICE_Villa);
        Matcher matcher= pattern.matcher(serviceID);
        return matcher.matches();
    }
    public static boolean checkValidateRoom(String serviceID) {
        Pattern pattern= Pattern.compile(REGEX_SERVICE_Room);
        Matcher matcher= pattern.matcher(serviceID);
        return matcher.matches();
    }
}
