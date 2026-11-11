package com.pluralsight;

public class NameFormatter {

    private NameFormatter () {

    }

    public static String format(String firstName, String lastName) {

        String fullName = lastName + ", " + firstName;

        return fullName;
    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {

        String fullName = lastName + ", ";

        if (!prefix.isEmpty()) {

            fullName += prefix + " ";
        }

        fullName += firstName;

        if (!middleName.isEmpty()) {

            fullName +=  " " + middleName;
        }

        if (!suffix.isEmpty()) {

            fullName +=  ", " + suffix;
        }

        return fullName;
    }

    public static String format(String fullName) {

        String[] token = fullName.split(",");

        String namePart = token[0].trim();

        String suffix = "";
        if (token.length > 1) {

            suffix = token[1].trim();
        }



    }
}
