package com.ssb.app0705;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    //이벤트가 발생했을 때 호출되는 메소드
    @Override
    public void onReceive(Context context, Intent intent){
        //토스트 출력
        Toast.makeText(context,"event",Toast.LENGTH_LONG).show();
        //자신의 MainActivity를 화면에 출력하기
        Intent myIntent = new Intent(context,MainActivity.class);
        //MainActivity가 화면에 없을 경우를 대비해서 없으면 생성하도록 옵션 추가
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);


        context.startActivity(myIntent);
    }
}
