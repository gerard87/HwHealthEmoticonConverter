package com.gerard.hwhealthemoticonconverter;

import android.os.Bundle;

import com.vdurmont.emoji.EmojiParser;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class NotificationCollect implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals("com.huawei.health")) {
            XposedHelpers.findAndHookMethod("com.huawei.bone.ui.setting.NotificationPushListener",
                    lpparam.classLoader, "onNotificationSubPosted",
                    Bundle.class, int.class, String.class, int.class, new XC_MethodHook() {
                @Override
                protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                    Bundle bundle = (Bundle) param.args[0];
                    if (bundle != null) {
                        String title = bundle.getString("data_extra_title");
                        String text = bundle.getString("data_extra_text");

                        if (title != null) {
                            String convertedTitle = EmojiParser.parseToAliases(title);
                            bundle.putString("data_extra_title", convertedTitle);
                        }
                        if (text != null) {
                            String convertedText = EmojiParser.parseToAliases(text);
                            bundle.putString("data_extra_text", convertedText);
                        }
                    }
                }
            });
        }
    }
}
