package com.dialogtool.chenxkang.CustomAlertDialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dialogtool.chenxkang.R;

import static android.text.TextUtils.isEmpty;

/**
 * author: chenxkang
 * time  : 17/5/12
 * desc  : Dialog的视图
 */

public class DialogView extends RelativeLayout implements IDialogView {

    private TextView mTitleTv,mContentTv;
    private View mLine01,mLine02;
    private Button mButton01,mButton02,mButton03;

    public DialogView(Context context) {
        super(context);
    }

    public DialogView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        mTitleTv = (TextView) findViewById(R.id.dialog_title_tv);
        mContentTv = (TextView) findViewById(R.id.dialog_content_tv);

        mLine01 = findViewById(R.id.dialog_line_01);
        mLine02 = findViewById(R.id.dialog_line_02);

        mButton01 = (Button) findViewById(R.id.dialog_button_01);
        mButton02 = (Button) findViewById(R.id.dialog_button_02);
        mButton03 = (Button) findViewById(R.id.dialog_button_03);

        super.onFinishInflate();
    }

    @Override
    public void setTitle(CharSequence message) {
        if (isEmpty(message)){
            mTitleTv.setVisibility(GONE);
            return;
        }

        mTitleTv.setVisibility(VISIBLE);
        mTitleTv.setText(message);

    }

    @Override
    public void setMessage(CharSequence message) {
        if (isEmpty(message)){
            return;
        }

        mContentTv.setText(message);
    }

    @Override
    public Button getButton01() {
        return mButton01;
    }

    @Override
    public void setButton01(CharSequence message) {
        if (isEmpty(message)){
            return;
        }

        mButton01.setText(message);
    }

    @Override
    public Button getButton02() {
        return mButton02;
    }

    @Override
    public void setButton02(CharSequence message) {
        if (isEmpty(message)){
            mLine01.setVisibility(GONE);
            mButton02.setVisibility(GONE);
            return;
        }

        mLine01.setVisibility(VISIBLE);
        mButton02.setVisibility(VISIBLE);
        mButton02.setText(message);
    }

    @Override
    public Button getButton03() {
        return mButton03;
    }

    @Override
    public void setButton03(CharSequence message) {
        if (isEmpty(message)){
            mLine02.setVisibility(GONE);
            mButton03.setVisibility(GONE);
            return;
        }

        mLine02.setVisibility(VISIBLE);
        mButton03.setVisibility(VISIBLE);
        mButton03.setText(message);
    }
}
