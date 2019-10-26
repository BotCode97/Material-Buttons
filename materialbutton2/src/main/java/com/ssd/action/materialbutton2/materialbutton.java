package com.ssd.action.materialbutton2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class materialbutton extends LinearLayout {

    public materialbutton(Context context,  AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.material_button,this);
        TypedArray array = context.obtainStyledAttributes(attrs,R.styleable.materialbutton,0,0);
        Button button = findViewById(R.id.button);
        init(array,button,context);

    }

    private void init(TypedArray array , Button b,Context c){
        String text = array.getString(R.styleable.materialbutton_text);
        boolean out = array.getBoolean(R.styleable.materialbutton_Outlined,false);



        if (text == null){
            b.setText("");
        }else{
            b.setText(text);
        }
        if (out){
            b.setBackgroundResource(R.drawable.outlined_button_blue);
            b.setTextColor(Color.parseColor(String.valueOf(getResources().getColor(R.color.colorPrimary,null))));
        }else {
            b.setBackgroundResource(R.drawable.button_blue);
            b.setTextColor(Color.parseColor("#ffffff"));
        }


    }

}
