package com.zimu21.zimu.view.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zimu21.zimu.R;
import com.zimu21.zimu.view.fragment.BaseFragment;
 /**
  * @author: an - bndroid
  * @function:
  * @date: 2017/3/8 10:50
  * 邮箱：13145202327@163.com
  */
public class SubscriptionFragment extends BaseFragment {
    private View mContentView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext = getActivity();
        mContentView = inflater.inflate(R.layout.fragment_subscription_layout, container, false);
        return mContentView;
    }
}