package ua.ucu.edu.apps.task1;


import java.time.LocalDate;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail(){
        return this.facebookUser.getEmail();
    }

    @Override
    public String getCountry(){
        return this.facebookUser.getCountry();

    }

    @Override
    public String getLastActiveDate(){
        this.facebookUser.getUserActiveTime().toLocalDate();

    }
}