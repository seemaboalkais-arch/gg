package com.sarmad.keyboard;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

public class LatinKeyboardView extends KeyboardView {

    static final int KEYCODE_AI_MAGIC = -100; // كود مخصص للزر السحري

    public LatinKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LatinKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected boolean onLongPress(Keyboard.Key key) {
        if (key.codes[0] == Keyboard.KEYCODE_CANCEL) {
            getOnKeyboardActionListener().onKey(KEYCODE_AI_MAGIC, null);
            return true;
        } else {
            return super.onLongPress(key);
        }
    }
}
