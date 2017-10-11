package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/*
 * lonely twitter activity
* version 1.0
* september 26,2017
 * Copyright 2017 team X, Cmput 301, university of alberta. All rights reserved .
 * you may use distrbute or modify this code under terms with the code of student behavior at university of alberta.
 * you may find a copy of the license to this project. otherwise pease contact contact@ualberta.ca
 */


/**
 * *the Main activity of the app where the user will be greeted with a screen in
 * which the user can enter a tweet, clear the screen and also see a list of tweets entered by the user
 *
 * @author cjlee
 * @version 1.5
 * @see MehMood
 * @see MoneyMood
 * @since 1.0
 **/
public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav"; //
	private EditText bodyText;	// where the user will enter their input for a tweet
	private ListView oldTweetsList; // list of tweets
	
	/** Called when the activity is first created. */

	/**
	 *
	 * @param savedInstanceState  saved state of the activity
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main); // sets the content to the main activity xml

		bodyText = (EditText) findViewById(R.id.body); // find the view of the body text and the id
		Button saveButton = (Button) findViewById(R.id.save); // find the view of the save button
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList); // find the view of the listview

		// makes a listener for the save button where they will send the results to the list view to be preseneted
		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK); // setresult to okay
				String text = bodyText.getText().toString(); //  get the from the edit to be used

				NormalTweet newTweet = new NormalTweet("Hello"); // make a normal tweet saying hello will now be in list
				ImportantTweet newTweet2 = new ImportantTweet("hello", new Date()); // make a important tweet saying hello to be put in listview

				newTweet2.getDate(); // get date for new tweet2

				try {
					newTweet.setMessage("Goodbye"); // for exceptions to set the newtweet message to goodbye
				} catch (TweetTooLongException e){

				}
				Log.d("TWEET", newTweet.getMessage());// logs if their is a problem,


				ArrayList<Tweet> tweetList = new ArrayList<Tweet>(); //inits a new tweetlist
				tweetList.add(newTweet);// add newtweet in tweetlist
				tweetList.add(newTweet2); // add newtweet2 in tweetlist

				saveInFile(text, new Date(System.currentTimeMillis()));// save in file
				//finish();

			}
		});
	}


	@Override
	/**
	 * on start of app, set the adapter which will set the layout and style of the screen
	 */
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		String[] tweets = loadFromFile(); // load the adapter
		// create the adapter
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter); //set the adapter
	}

	/**
	 *  load from the file and take the input from to file to return it to tweet array
	 * @return turn info from file to stuff for tweet
	 */
	private String[] loadFromFile() {
		ArrayList<String> tweets = new ArrayList<String>(); // new array of strings
		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String line = in.readLine();
			while (line != null) {
				tweets.add(line); // add the line
				line = in.readLine(); // read the lines from the file
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tweets.toArray(new String[tweets.size()]);
	}

	/**
	 *
	 * @param text string text
	 * @param date date of file
	 */
	private void saveInFile(String text, Date date) {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_APPEND);
			fos.write(new String(date.toString() + " | " + text)
					.getBytes()); // write to file
			fos.close(); // close file 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}