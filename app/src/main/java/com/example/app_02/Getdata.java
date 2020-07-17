package com.example.app_02;

import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Getdata extends AsyncTask<String, String, String> {
    HttpURLConnection urlConnection;
    @Override
    protected String doInBackground(String... strings) {

        StringBuilder result = new StringBuilder();

        try{
            URL url = new URL("https://api.myjson.com/bins/goout");
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader= new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line= reader.readLine())!= null)
                result.append(line);
            } catch (Exception e) {
            e.printStackTrace();

        } finally {
            urlConnection.disconnect();
        }
        return  result.toString();
        }
        @Override
        protected void onPostExecute(String result){}
        }
