package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    // khai báo biến
    TextView txtbaitoan,txtketqua ;
    ImageButton imageright, imagewrong;
    int msothu1,msothu2,mketqua,mpheptinh;
    Random mrandom;
    boolean mrandomketqua =false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2: Ánh xạ
        txtbaitoan = findViewById(R.id.textviewbaitoan);
        txtketqua= findViewById(R.id.textviewketqua);
        imageright = findViewById(R.id.imageright);
        imagewrong = findViewById(R.id.imagewrong);

        //Task
        //3: 1/ random biểu thức
        //3: 2/ random kết quả
        //3: 3/ kiểm tra kết quả

        //random cho giá trị
        msothu1=msothu2=mketqua=mpheptinh = 0;
        mrandom = new Random();

        msothu1 = mrandom.nextInt(10)+1;
        msothu2 = mrandom.nextInt(10)+1;
       /* Log.d("AAAAAA" , "sothu1: " +msothu1);
        Log.d("AAAAAA" , "sothu2: " +msothu2);*/

       mpheptinh = mrandom.nextInt(4)+1;

       mrandomketqua = mrandom.nextBoolean();
       //1: cộng , 2: trừ , 3: nhân ,4: chia


       // txtbaitoan.setText(3+4);

        switch (mpheptinh)
        {
            case 0 :
                mketqua = msothu1 + msothu2;
                txtbaitoan.setText(msothu1 + "+" +msothu2);
                break;

            case 1:
                mketqua = msothu1 - msothu2;
                txtbaitoan.setText(msothu1 + "-" +msothu2);
                break;
            case 3:
                mketqua = msothu1 * msothu2;
                txtbaitoan.setText(msothu1 + "*" +msothu2);
                break;
            case 4:
                mketqua = msothu1 / msothu2;
                txtbaitoan.setText(msothu1 + "/" +msothu2);
                break;
        }

        if(mrandomketqua == false)
        {
            mketqua +=mrandom.nextInt(5)+1;
        }
       /* else
        {
            mketqua +=mrandom.nextInt(10)+1;
        }*/
        txtketqua.setText(" = "+mketqua);




        //tìm hiểu su kiện click của imagebutton


       /* imageright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mrandomketqua==false) //git config --global user.email "you@example.com"

                {
                    Toast.makeText(MainActivity.this, "Đúng rồi", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Sai rồi", Toast.LENGTH_SHORT).show();
                }

            }
        });*/











      /*  int a = 10;
        String value = String.valueOf(a);
        Log.d("BBB","value");*/


    /*  int a = (int) 1.5f;
      int result = Math.round(a);

      Log.d("BBBB",String.valueOf(result));*/

    //random trong khoảng từ 0-5


    /*double result5 = Math.round(Math.random()*5);
    Log.d("BBBB", String.valueOf(result5));*/


    //phương thức khởi tạo random
      /*  Random random = new Random();
        int result5 = random.nextInt();
        Log.d("BBB",String.valueOf(result5));*/


      //cho giá trị random chạy từ 5-10
      /*  Random random = new Random();
        int result6 = random.nextInt(10-5+1)+5;
        Log.d("BBB",String.valueOf(result6));*/









    }
}
