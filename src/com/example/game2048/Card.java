package com.example.game2048;

import android.content.Context;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Card extends FrameLayout {
	private int num=0;
	private TextView label;

	public Card(Context context) {
		super(context);
		label=new TextView(getContext());
		label.setTextSize(32);
		label.setGravity(Gravity.CENTER);    //card里的字放在中间
		label.setBackgroundColor(0x33ffffff);  //0x半透明，33ffffff白色
		LayoutParams lp=new LayoutParams(-1,-1);
		lp.setMargins(10, 10, 0, 0);    //间隔right,top,left,bottom
		addView(label,lp);

		setNum(num);
	}
	public int getNum(){
		return num;
	}
	public void setNum(int num){

		this.num=num;
		if(num<=0){
			label.setText("");
		}else{
			label.setText(num+"");
		}
	}
	public boolean equals(Card o){
		return getNum()==o.getNum();

	}
}
