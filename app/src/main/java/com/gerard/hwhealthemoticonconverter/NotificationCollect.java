package com.gerard.hwhealthemoticonconverter;

import android.os.Bundle;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class NotificationCollect implements IXposedHookLoadPackage {

    private boolean titleTextParser = false;
    private boolean textTextParser = true;

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
                        if (titleTextParser) {
                            String title = bundle.getString("data_extra_title");
                            if (title != null) {
                                title = StringUtils.emoticonToTextParser(title);
                                bundle.putString("data_extra_title", title);
                            }
                        }
                        if (textTextParser) {
                            String text = bundle.getString("data_extra_text");
                            if (text != null) {
                                text = StringUtils.emoticonToTextParser(text);
                                bundle.putString("data_extra_text", text);
                            }
                        }
                    }
                }
            });
        }
    }
}
