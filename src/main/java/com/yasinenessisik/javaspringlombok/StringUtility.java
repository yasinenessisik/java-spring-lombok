package com.yasinenessisik.javaspringlombok;

import lombok.experimental.UtilityClass;
// Final ve statiğe gerek yok
@UtilityClass
public final class StringUtility {
    public static String trim(String string){
        return string.trim();
    }
}
