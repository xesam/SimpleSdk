package dev.xesam.andriod.toolbox;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by xesamguo@gmail.com on 16-5-12.
 */
public class ResReflect {

    public static int getId(Context context, String name) {
        return getId(context.getResources(), name, context.getPackageName());
    }

    public static int getId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "id", pkgName);
    }

    public static int getLayoutId(Context context, String name) {
        return getLayoutId(context.getResources(), name, context.getPackageName());
    }

    public static int getLayoutId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "layout", pkgName);
    }

    public static int getStringId(Context context, String name) {
        return getStringId(context.getResources(), name, context.getPackageName());
    }

    public static int getStringId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "layout", pkgName);
    }

    public static int getDrawableId(Context context, String name) {
        return getDrawableId(context.getResources(), name, context.getPackageName());
    }

    public static int getDrawableId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "drawable", pkgName);
    }

    public static int getStyleId(Context context, String name) {
        return getStyleId(context.getResources(), name, context.getPackageName());
    }

    public static int getStyleId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "style", pkgName);
    }

    public static int getDimenId(Context context, String name) {
        return getDimenId(context.getResources(), name, context.getPackageName());
    }

    public static int getDimenId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "dimen", pkgName);
    }

    public static int getColorId(Context context, String name) {
        return getColorId(context.getResources(), name, context.getPackageName());
    }

    public static int getColorId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "color", pkgName);
    }

    public static int getMenuId(Context context, String name) {
        return getMenuId(context.getResources(), name, context.getPackageName());
    }

    public static int getMenuId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "menu", pkgName);
    }

    public static int getAnimId(Context context, String name) {
        return getAnimId(context.getResources(), name, context.getPackageName());
    }

    public static int getAnimId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "anim", pkgName);
    }

    public static int getIntegerId(Context context, String name) {
        return getIntegerId(context.getResources(), name, context.getPackageName());
    }

    public static int getIntegerId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "integer", pkgName);
    }

    public static int getBoolId(Context context, String name) {
        return getBoolId(context.getResources(), name, context.getPackageName());
    }

    public static int getBoolId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "bool", pkgName);
    }

    public static int getFractionId(Context context, String name) {
        return getFractionId(context.getResources(), name, context.getPackageName());
    }

    public static int getFractionId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "fraction", pkgName);
    }

    public static int getPluralsId(Context context, String name) {
        return getPluralsId(context.getResources(), name, context.getPackageName());
    }

    public static int getPluralsId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "plurals", pkgName);
    }

    public static int getArrayId(Context context, String name) {
        return getArrayId(context.getResources(), name, context.getPackageName());
    }

    public static int getArrayId(Resources res, String name, String pkgName) {
        return res.getIdentifier(name, "array", pkgName);
    }

    ////////////////////////////////////

    private Resources mRes;
    private String mPackageName;

    public ResReflect(Context context) {
        this(context.getResources(), context.getPackageName());
    }

    public ResReflect(Resources res, String packageName) {
        this.mRes = res;
        this.mPackageName = packageName;
    }

    public int getId(String name) {
        return getId(mRes, name, mPackageName);
    }

    public int getLayoutId(String name) {
        return getLayoutId(mRes, name, mPackageName);
    }

    public int getStringId(String name) {
        return getStringId(mRes, name, mPackageName);
    }

    public int getDrawableId(String name) {
        return getDrawableId(mRes, name, mPackageName);
    }

    public int getStyleId(String name) {
        return getStyleId(mRes, name, mPackageName);
    }

    public int getDimenId(String name) {
        return getDimenId(mRes, name, mPackageName);
    }

    public int getColorId(String name) {
        return getColorId(mRes, name, mPackageName);
    }

    public int getMenuId(String name) {
        return getMenuId(mRes, name, mPackageName);
    }

    public int getAnimId(String name) {
        return getAnimId(mRes, name, mPackageName);
    }

    public int getIntegerId(String name) {
        return getIntegerId(mRes, name, mPackageName);
    }

    public int getBoolId(String name) {
        return getBoolId(mRes, name, mPackageName);
    }

    public int getFractionId(String name) {
        return getFractionId(mRes, name, mPackageName);
    }

    public int getPluralsId(String name) {
        return getPluralsId(mRes, name, mPackageName);
    }

    public int getArrayId(String name) {
        return getArrayId(mRes, name, mPackageName);
    }

}
