package com.application.nikita.application;

/**
 * Created by NIKITA on 19.05.2017.
 */

public interface FragmentSwich {

    void switchFragment(APP_FRAGMENTS arg);

    public static enum APP_FRAGMENTS
    {
        LOGIN_FRAGMENT, REGISTRATION_FRAGMENT, PROFILE_FRAGMENT, LIKE_FRAGMENT, HOME_FRAGMENT, ADDING_FRAGMENT, SEARCH_FRAGMENT,FORGOT_PASSWORD_FRAGMENT;
    }

    public static class  FRAGMENTS_TAG
    {
        public static final String HOME_FRAGMENT_TAG = "HOME_FRAGMENT_TAG";
        public static final String SEARCH_FRAGMENT_TAG = "SEARCH_FRAGMENT_TAG";
        public static final String ADD_FRAGMENT_TAG = "ADD_FRAGMENT_TAG";
        public static final String LIKE_FRAGMENT_TAG = "LIKE_FRAGMENT_TAG";
        public static final String PROFILE_FRAGMENT_TAG = "PROFILE_FRAGMENT_TAG";
        public static final String LOGIN_FRAGMENT_TAG = "LOGIN_FRAGMENT_TAG";
        public static final String REGISTRATION_FRAGMENT_TAG = "REGISTRATION_FRAGMENT_TAG";
        public static final String FORGOT_PASSWORD_TAG = "FORGOT_PASSWORD_TAG";
    }
}
