package org.fasttrackit;

import java.security.PrivateKey;

public class Activity {


        String name;

       private Activity activity;

    public Activity(Activity activity) {
        this.activity = activity;
    }


    public Activity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
