package ca.ualberta.cs.lonelytwitter;

/*
 *Tweet
* version 1.0
* september 26,2017
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */
import java.util.Date;

/**
 * * sub class of tweet to show if tweet is important
 *
 * @author cjlee
 * @version 1.5
 * @see Tweet
 * @since 1.0
 **/
public class ImportantTweet extends Tweet implements Tweetable {


    public ImportantTweet(String message){
        super(message);
    }

    /**
     *
     * @param message important tweet message
     * @param date important tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    /**
     *
     * @return since tweet is important we must return true
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}
