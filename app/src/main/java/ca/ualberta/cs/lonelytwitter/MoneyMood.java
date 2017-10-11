/*
 *Tweet
* version 1.0
* september 26,2017
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * * extends the mood class.
 *
 * @author cjlee
 * @version 1.5
 * @see Mood
 * @since 1.0
 **/
public class MoneyMood extends Mood {

    public MoneyMood() {

        super();
    }

    /**
     *
     * @param date take a date from the super
     */
    public MoneyMood(Date date) {
        super(date);
    }

    /**
     *
      * @return prints a statement from the MoneyMood class
     */
    public String printMood() {
        return "Moneeeey" + getMood();

    }
}
