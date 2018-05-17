package com.joanzapata.iconify.fonts;

import android.support.annotation.NonNull;

import com.joanzapata.iconify.Icon;
import com.joanzapata.iconify.IconFontDescriptor;

public class FABrandsModule implements IconFontDescriptor {

    @Override
    @NonNull
    public String ttfFileName() {
        return "iconify/fa-brands-400.ttf";
    }

    @Override
    @NonNull
    public Icon[] characters() {
        return FABrandsIcons.values();
    }
}