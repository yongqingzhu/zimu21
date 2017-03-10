package com.zimu21.zimu.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.zimu21.zimu.R;
import com.zimu21.zimu.activity.base.BaseActivity;
import com.zimu21.zimu.view.fragment.home.CourseFragment;
import com.zimu21.zimu.view.fragment.home.FindFragment;
import com.zimu21.zimu.view.fragment.home.HomeFragment;
import com.zimu21.zimu.view.fragment.home.MineFragment;
import com.zimu21.zimu.view.fragment.home.SubscriptionFragment;
 /**
  * @author: an - bndroid
  * @function:
  * @date: 2017/3/7 18:05
  * 邮箱：13145202327@163.com
  */
public class HomeActivity extends BaseActivity implements View.OnClickListener {
    private FragmentManager fm;
    private HomeFragment mHomeFragment;
    private Fragment mCommonFragmentOne;
    private CourseFragment mCourseFragment;
    private FindFragment mFindFragment;
    private MineFragment mMineFragment;
    private SubscriptionFragment mSubscriptionFragment;
    private Fragment mCurrent;

    private RelativeLayout mHomeLayout;
    private RelativeLayout mCourseLayout;
    private RelativeLayout mFindLayout;
    private RelativeLayout mMineLayout;
    private RelativeLayout mSubscriptionLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_layout);

        initview();
        mHomeFragment = new HomeFragment();
        fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.content_layout, mHomeFragment);
        fragmentTransaction.commit();

    }

    private void initview() {
        mHomeLayout = (RelativeLayout) findViewById(R.id.home_layout_view);
        mHomeLayout.setOnClickListener(this);

        mCourseLayout = (RelativeLayout) findViewById(R.id.course_layout_view);
        mCourseLayout.setOnClickListener(this);

        mFindLayout = (RelativeLayout) findViewById(R.id.find_layout_view);
        mFindLayout.setOnClickListener(this);

        mMineLayout = (RelativeLayout) findViewById(R.id.mine_layout_view);
        mMineLayout.setOnClickListener(this);

        mSubscriptionLayout = (RelativeLayout) findViewById(R.id.subscription_layout_view);
        mSubscriptionLayout.setOnClickListener(this);

    }

    private void hideFragment(Fragment fragment, FragmentTransaction ft) {
        if (fragment != null) {
            ft.hide(fragment);
        }
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        switch (v.getId()) {
            case R.id.home_layout_view:
                hideFragment(mCommonFragmentOne, fragmentTransaction);
                hideFragment(mCourseFragment, fragmentTransaction);
                hideFragment(mFindFragment, fragmentTransaction);
                hideFragment(mMineFragment, fragmentTransaction);
                hideFragment(mSubscriptionFragment, fragmentTransaction);
                if (mHomeFragment == null) {
                    mHomeFragment = new HomeFragment();
                    fragmentTransaction.add(R.id.content_layout, mHomeFragment);
                } else {
                    mCurrent = mHomeFragment;
                    fragmentTransaction.show(mHomeFragment);
                }
                break;
            case R.id.course_layout_view:
                hideFragment(mCommonFragmentOne, fragmentTransaction);
                hideFragment(mHomeFragment, fragmentTransaction);
                hideFragment(mFindFragment, fragmentTransaction);
                hideFragment(mMineFragment, fragmentTransaction);
                hideFragment(mSubscriptionFragment, fragmentTransaction);
                if (mCourseFragment == null) {
                    mCourseFragment = new CourseFragment();
                    fragmentTransaction.add(R.id.content_layout, mCourseFragment);
                } else {
                    mCurrent = mCourseFragment;
                    fragmentTransaction.show(mCourseFragment);
                }
                break;
            case R.id.find_layout_view:
                hideFragment(mCommonFragmentOne, fragmentTransaction);
                hideFragment(mCourseFragment, fragmentTransaction);
                hideFragment(mHomeFragment, fragmentTransaction);
                hideFragment(mMineFragment, fragmentTransaction);
                hideFragment(mSubscriptionFragment, fragmentTransaction);
                if (mFindFragment == null) {
                    mFindFragment = new FindFragment();
                    fragmentTransaction.add(R.id.content_layout, mFindFragment);
                } else {
                    mCurrent = mFindFragment;
                    fragmentTransaction.show(mFindFragment);
                }
                break;

            case R.id.mine_layout_view:
                hideFragment(mCommonFragmentOne, fragmentTransaction);
                hideFragment(mCourseFragment, fragmentTransaction);
                hideFragment(mFindFragment, fragmentTransaction);
                hideFragment(mHomeFragment, fragmentTransaction);
                hideFragment(mSubscriptionFragment, fragmentTransaction);
                if (mMineFragment == null) {
                    mMineFragment = new MineFragment();
                    fragmentTransaction.add(R.id.content_layout, mMineFragment);
                } else {
                    mCurrent = mMineFragment;
                    fragmentTransaction.show(mMineFragment);
                }
                break;

            case R.id.subscription_layout_view:
                hideFragment(mCommonFragmentOne, fragmentTransaction);
                hideFragment(mCourseFragment, fragmentTransaction);
                hideFragment(mFindFragment, fragmentTransaction);
                hideFragment(mMineFragment, fragmentTransaction);
                hideFragment(mHomeFragment, fragmentTransaction);
                if (mSubscriptionFragment == null) {
                    mSubscriptionFragment = new SubscriptionFragment();
                    fragmentTransaction.add(R.id.content_layout, mSubscriptionFragment);
                } else {
                    mCurrent = mSubscriptionFragment;
                    fragmentTransaction.show(mSubscriptionFragment);
                }
                break;
        }
        fragmentTransaction.commit();
    }
}
