package com.ypp.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "sssssss";
    RightFragment rightFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(this);
//        repleceFragment(new RightFragment());
        //Activity仅能对Fragment内方法进行调用
         //rightFragment=(RightFragment) getSupportFragmentManager().findFragmentById(R.id.Right_layout);
        //rightFragment.
       // Log.i(TAG, "onCreate: ");
    }
//    private void repleceFragment(Fragment fragment){
//        //获取Fragment管理器
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        //获取添加方法
//        FragmentTransaction transaction=fragmentManager.beginTransaction();
//        //设置添加位置，替换Right_layout所在位置
//        transaction.replace(R.id.Right_layout,fragment);
//        //设置将Fragment添加到返回栈当中
//        transaction.addToBackStack(null);
//        //执行操作
//        transaction.commit();
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
//                repleceFragment(new AnotherRightFragment());
                break;
                default:
                    break;
        }
    }
}
