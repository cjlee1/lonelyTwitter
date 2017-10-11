package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/*
 *Tweet
* version 1.0
* september 26,2017
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

//#2

/**
 * * Represents a tweet.
 *
 * @author cjlee
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 **/

public abstract class Tweet {

    private String message; // string
    private Date date;
    private Mood mood;

    ArrayList<Mood> MoodList;


    /**
     *
     * @param message string message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();


    /**
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */


    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     *
     * @return message from tweet
     */
    public String getMessage(){
        return this.message;
    }

    /**
     *
     * @return return date of tweet
     */

    public Date getDate() {
        return date;
    }

    /**
     *
     * @param date set the date of the tweet
     */

    public void setDate(Date date) {
        this.date = date;
    }
}
