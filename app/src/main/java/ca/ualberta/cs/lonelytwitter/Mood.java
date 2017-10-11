/*
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;



import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * Created by cjlee on 9/12/17.
 */
/**
 * * Represents a mood.
 *
 * @author cjlee
 * @version 1.5
 * @see MehMood
 * @see MoneyMood
 * @since 1.0
 **/
public abstract class Mood {
    private String mood; // instance variable for mood

    private Date date; // instance variable for date of tweet


    public Mood(){
        this.date = new Date();
    }

    /**
     *
     * @param date date of mood class
     */
    public Mood(Date date) {
        this.date=date;
    }

    /**
     *
     * @return return mood of the app
     */
    public String getMood()
     {
         return  mood;
     }

    /**
     *
     * @return return the date of the created mood
     */
    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date set the date of the mood
     */
    public void setDate(Date date) {
        this.date = date;
    }


}
