package com.example.assignmentone; // 替换为你的实际包名

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail); // 需创建对应的布局文件

        // 获取传递的标识
        Intent intent = getIntent();
        int itemId = intent.getIntExtra("ITEM_ID", -1); // 默认为-1（无效标识）

        // 显示标识对应的内容（示例：通过TextView展示）
        TextView tvDetail = findViewById(R.id.tv_detail); // 需在布局中定义此控件
        switch (itemId) {
            case 0:
                tvDetail.setText("当前页面：Facilities（标识0）");
                break;
            case 1:
                tvDetail.setText("当前页面：Events（标识1）");
                break;
            case 2:
                tvDetail.setText("当前页面：Clubs（标识2）");
                break;
            case 3:
                tvDetail.setText("当前页面：Support（标识3）");
                break;
            default:
                tvDetail.setText("无效标识");
        }
    }
}