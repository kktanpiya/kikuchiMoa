package com.example.msdhainizam.dashboardjava;

import java.util.List;
import java.util.Random;

/**
 * Created by MSD Hainizam on 12/22/2015.
 */
public class DashboardLanding {

    private static final Random RANDOM = new Random();

        public static int getRandomCheeseDrawable() {
                switch (RANDOM.nextInt(5)) {
                        default:
                        case 0:
                                return R.drawable.cheese_1;
                        case 1:
                                return R.drawable.cheese_2;
                        case 2:
                                return R.drawable.cheese_3;
                        case 3:
                                return R.drawable.cheese_4;
                        case 4:
                                return R.drawable.cheese_5;
                }
    }

    public static final String[] sCheeseStrings = {
            "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi"
    };



}
