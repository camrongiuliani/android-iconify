package com.joanzapata.iconify.fonts;

import android.support.annotation.NonNull;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class FARegularModule implements IconFontDescriptor {

    @NonNull
    @Override
    public String ttfFileName() {
        return "iconify/fa-regular-400.ttf";
    }

    @Override
    @NonNull
    public Icon[] characters() {
        return FARegularIcons.values();
    }
}


// CEATE BRANDS MODULE
// CEATE LIGHT MODULE
// CEATE REGULAR MODULE