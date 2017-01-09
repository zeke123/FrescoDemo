package com.zhoujian.fresco.activity;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.drawee.view.SimpleDraweeView;
import com.zhoujian.fresco.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity
{

    @BindView(R.id.fresco_imgeview)
    SimpleDraweeView mFrescoImgeview;

    @BindView(R.id.fresco_imgeview1)
    SimpleDraweeView mFrescoImgeview1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
        setImage();
    }

    private void setImage()
    {
        mFrescoImgeview.setImageURI("http://image.tianjimedia.com/uploadImages/2014/339/38/M7K1817T9KU1.jpg");
        mFrescoImgeview1.setImageURI("http://img5.imgtn.bdimg.com/it/u=3432186896,3159823243&fm=21&gp=0.jpg");
    }
}
