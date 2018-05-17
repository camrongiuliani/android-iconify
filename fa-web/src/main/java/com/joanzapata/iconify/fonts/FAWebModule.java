package com.joanzapata.iconify.fonts;

import android.support.annotation.NonNull;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class FAWebModule implements IconFontDescriptor {

    @Override
    @NonNull
    public String ttfFileName() {
        return "iconify/fa-webfont.ttf";
    }

    @Override
    @NonNull
    public Icon[] characters() {
        return FAWebIcons.values();
    }
}