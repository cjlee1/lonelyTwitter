/*
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;



import java.util.Date;

/**
 * Created by cjlee on 9/12/17.
 */


/**
 * * extends the mood class. 2nd subclass so mehmood
 *
 * @author cjlee
 * @version 1.5
 * @see Mood
 * @since 1.0
 **/
public class MehMood extends Mood{

    public MehMood(){

        super();
    }

    public MehMood( Date date) {
        super(date);
    }

    public String printMood(){
        return ":/ so bored"+getMood();

    }

}
