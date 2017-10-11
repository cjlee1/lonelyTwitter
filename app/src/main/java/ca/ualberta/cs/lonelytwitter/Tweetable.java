/*
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/12/17.
 */

/**
 * get the message and date of a tweet
 */

/**
 * * get the message and date of a tweet
 *
 * @author cjlee
 * @version 1.5
 * @see MehMood
 * @see MoneyMood
 * @since 1.0
 **/
public interface Tweetable {
    String getMessage(); // calls the getMessage method from Tweet class
    Date getDate(); // call the getdate method from tweet class
}
