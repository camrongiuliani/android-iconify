package com.joanzapata.iconify.fonts;

import android.support.annotation.NonNull;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class FALightModule implements IconFontDescriptor {

    @Override
    @NonNull
    public String ttfFileName() {
        return "iconify/fa-light-300.ttf";
    }

    @Override
    @NonNull
    public Icon[] characters() {
        return FALightIcons.values();
    }
}