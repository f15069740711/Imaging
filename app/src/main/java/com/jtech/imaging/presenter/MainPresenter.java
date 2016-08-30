package com.jtech.imaging.presenter;

import android.app.Activity;

import com.jtech.imaging.contract.MainContract;
import com.jtech.imaging.presenter.base.BasePresenter;

/**
 * 演示用逻辑处理实现类
 * Created by wuxubaiyang on 16/4/16.
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    public MainPresenter(Activity activity, MainContract.View view) {
        super(activity, view);
    }
}