package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * * Represents a tweet.
 *
 * @author cjlee
 * @version 1.5
 * @see Tweet
 * @since 1.0
 **/
public class NormalTweet extends Tweet {

    /**
     *
     * @param message message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     *
     * @param message normal tweet message
     * @param date  normal tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     *
     * @return returns to true or false as to which tweet is important
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
