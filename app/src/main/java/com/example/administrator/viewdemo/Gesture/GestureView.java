package com.example.administrator.viewdemo.Gesture;
import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Scroller;


/**
 * @description: this is GestureView
 * @author: lijingya
 * @email: lijingya@91118.com
 * @createDate: 2018/5/18
 * @company: 杭州天音
 */
@SuppressLint("AppCompatCustomView")
public class GestureView extends Button implements GestureDetector.OnGestureListener {

    private GestureDetector gestureDetector = new GestureDetector(this);
    private int startx;
    private int starty;
    private Scroller scroller;

    public GestureView(Context context) {
        super(context);
    }

    public GestureView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GestureView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        scroller = new Scroller(context);
    }


    @Override
    public boolean onDown(MotionEvent e) {
        Log.d("-->>44", "-->>44");
        int x = (int) e.getX();
        int y = (int) e.getX();
        int distanceX = x - startx;
        int distanceY = y - starty;
        startx = x;
        starty = y;
        scroller.startScroll(startx, starty, (int) distanceX, (int) distanceY, 1000);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d("-->>62", "-->>62");
        scroller.startScroll(getScrollX(), getScrollY(), (int) distanceX, (int) distanceY, 1000);
        invalidate();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean touchEvent = gestureDetector.onTouchEvent(event);
        return touchEvent;
    }

    @Override
    public void computeScroll() {
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }
}
