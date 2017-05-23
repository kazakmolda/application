package com.application.nikita.application.forgotPassword;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.nikita.application.FragmentSwich;
import com.application.nikita.application.R;

/**
 * Created by NIKITA on 24.05.2017.
 */

public class ForgotPasswordFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onResume() {
        super.onResume();
        Activity activity  = getActivity();
        activity.findViewById(R.id.send_new_email_button).setOnClickListener(this);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.forgot_password_layout,container,false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.send_new_email_button:
            {
                FragmentSwich swither = (FragmentSwich) getActivity();
                swither.switchFragment(FragmentSwich.APP_FRAGMENTS.LOGIN_FRAGMENT);
                break;
            }
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Activity activity  = getActivity();
        activity.findViewById(R.id.send_new_email_button).setOnClickListener(null);
    }
}
