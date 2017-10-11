/*
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by cjlee on 10/10/17.
 */

public class TweetList {


    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    private ArrayList<Tweet> tweetsCopy = new ArrayList<Tweet>();

    // add tweet to a list of tweets
    public void addTweet(Tweet tweet) throws IllegalArgumentException {

        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException("Duplicate tweet was added");
        } else {
            tweets.add(tweet);
        }

        tweets.add(tweet);


    }

    public int getCount() {
        return tweets.size();
    }

    //delete tweet from list
    public void deleteTweet(Tweet tweet) {
        tweets.remove(tweet);
    }

    //check if a list of tweets has the specifed tweet if it doesnt reutrn true else false
    public boolean hasTweet(Tweet tweet) {
        for (int i = 0; i < tweets.size(); i++) {
            if (tweet.getDate().equals(tweets.get(i).getDate())&&tweet.getMessage().equals(tweets.get(i).getMessage()) ) {
                return Boolean.TRUE;
            }

        }
        return Boolean.FALSE;

    }

    //get tweet from list
    public Tweet getTweet(int index) {

        return tweets.get(index);

    }

    public ArrayList<Tweet> getTweets() {
        tweetsCopy = tweets;
        Collections.sort(tweetsCopy, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
                return lhs.getDate().compareTo(rhs.getDate());
            }
        });
        return tweetsCopy;
    }
}
