package com.team4.share_books.login.view;

import android.app.Activity;

/**
 * Created by john on 2017/1/7.
 */

public interface BaseView {
    Activity getActivity();
    void onError(String error);
}
