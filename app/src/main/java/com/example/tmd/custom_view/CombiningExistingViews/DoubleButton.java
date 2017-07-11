package com.example.tmd.custom_view.CombiningExistingViews;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.tmd.custom_view.R;

/**
 * Created by tmd on 11/07/2017.
 */

public class DoubleButton extends LinearLayout implements View.OnClickListener {

    private Context mContext;
    private View mRootView;
    private TextView mTxtValue;
    private int mCurrentValue;

    public DoubleButton(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public DoubleButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    private void init() {
        mRootView = inflate(mContext, R.layout.double_button, this);
        mRootView.findViewById(R.id.button_decrease).setOnClickListener(this);
        mRootView.findViewById(R.id.button_increase).setOnClickListener(this);
        mTxtValue = (TextView) mRootView.findViewById(R.id.text_view_value);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_decrease:
                mCurrentValue--;
                mTxtValue.setText(mCurrentValue + "");
                break;
            case R.id.button_increase:
                mCurrentValue++;
                mTxtValue.setText(mCurrentValue + "");
                break;
            default:
                break;
        }
    }
}
