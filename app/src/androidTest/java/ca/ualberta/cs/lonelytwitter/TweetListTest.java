/*
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by cjlee on 10/10/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }
    public void testAddTweet(){
        TweetList tweets = new TweetList() ;
        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));

        Boolean errorThrow = Boolean.FALSE;

        try{
            tweets.addTweet(myTweet);
        }
        catch (Exception e){
                errorThrow = Boolean.TRUE;
                        }
        assertTrue(errorThrow);
    }
    public void testDeleteTweet(){

        TweetList tweets = new TweetList() ;
        Tweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        tweets.deleteTweet(myTweet);
        assertFalse(tweets.hasTweet(myTweet));
    }
    public void testHasTweet(){
        TweetList tweets = new TweetList() ;
        Tweet myTweet = new NormalTweet("my tweet");
        assertFalse(tweets.hasTweet(myTweet));
        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }
    public void testGetTweet(){
        //get tweet method will take an index and will return the tweet at that index

        //HINT: tweets.getTweet(index) will return a tweet
        //Hint: to check if the two tweets are the same, check if their message is the same and check if their dates are the same
        TweetList tweets = new TweetList();
        NormalTweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);
        NormalTweet myTweet2 = new NormalTweet("my tweet2");
        tweets.addTweet(myTweet2);

        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(),myTweet.getMessage() );
        assertEquals(returnedTweet.getDate(),myTweet.getDate());

    }
    public void testGetTweets(){
        TweetList tweets = new TweetList();
        NormalTweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);
        NormalTweet myTweet2 = new NormalTweet("my tweet2");
        tweets.addTweet(myTweet2);

        tweets.getTweets();
        assertTrue(tweets.getTweet(0).getDate().before(tweets.getTweet(1).getDate()));

    }

    public void testGetCount(){

        int count = 0;
        TweetList tweets = new TweetList();

       assertEquals(tweets.getCount(),count);

        /**for ( int i=0; i<10; i++){
            NormalTweet myTweet = new NormalTweet("message "+count);
            tweets.addTweet(myTweet);
            assertEquals(tweets.getCount(),i);
        }**/

        NormalTweet myTweet = new NormalTweet("message 1" );
        count++;
        tweets.addTweet(myTweet);
        assertEquals(tweets.getCount(),count);


    }
}
