package com.application.nikita.application.login;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.application.nikita.application.FragmentSwich;
import com.application.nikita.application.R;

/**
 * Created by NIKITA on 19.05.2017.
 */

public class LoginFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onResume() {
        super.onResume();
        Activity activity = getActivity();
        activity.findViewById(R.id.login_button).setOnClickListener(this);
        activity.findViewById(R.id.forgot_passwd_button).setOnClickListener(this);
        activity.findViewById(R.id.registration_button).setOnClickListener(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.signin_layout, container, false);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.login_button:
            {
                FragmentSwich switcFragment = (FragmentSwich) this.getActivity();
                switcFragment.switchFragment(FragmentSwich.APP_FRAGMENTS.HOME_FRAGMENT);
                break;
            }
            case R.id.forgot_passwd_button:
            {/*
                FragmentSwich switcFragment = (FragmentSwich) this.getActivity();
                switcFragment.switchFragment(FragmentSwich.APP_FRAGMENTS.HOME_FRAGMENT);*/
                break;
            }
            case R.id.registration_button:
            {
                FragmentSwich switcFragment = (FragmentSwich) this.getActivity();
                switcFragment.switchFragment(FragmentSwich.APP_FRAGMENTS.REGISTRATION_FRAGMENT);
                break;
            }
        }
    }
}
