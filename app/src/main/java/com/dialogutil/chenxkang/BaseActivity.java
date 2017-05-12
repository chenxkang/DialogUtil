package com.dialogutil.chenxkang;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import butterknife.ButterKnife;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  :
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getLayoutResID());
        ButterKnife.bind(this);
    }

    /**
     * 布局文件ID
     *
     * @return
     */
    protected abstract @LayoutRes int getLayoutResID();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
