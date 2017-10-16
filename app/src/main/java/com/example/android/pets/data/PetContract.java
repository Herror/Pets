package com.example.android.pets.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by enach on 10/12/2017.
 */

public final class PetContract {

    //Create an entire content provider
    public static final String CONTENT_AUTHORITY = "com.example.android.pets";

    //add the content:// scheme to the CONTENT_AUTHORITY to create the BASE_CONTENT_URI
    //This will be used to access the content provider
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    //create a constant for the path of the pets table
    public static final String PATH_PETS = "pets";

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private PetContract(){}

    //Inner class that defines the table contents

    public static abstract class PetEntry implements BaseColumns{

        //Create the content URI to access the pet data in the provider

        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**The variables for the gender of the pet
         * 0 - Unknown
         * 1 - Male
         * 2 - Female
         */

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }

}
