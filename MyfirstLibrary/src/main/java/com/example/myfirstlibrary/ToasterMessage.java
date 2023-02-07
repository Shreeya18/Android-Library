package com.example.myfirstlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void makeText(Context c, String message){

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }

}
