package com.konifar.sample.hello_world;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * Show Hello World Action.
 */
public class HelloWorldAction extends AnAction {
    public void actionPerformed(AnActionEvent e) {
        Notifications.Bus.notify(new Notification("group",
                "Hello World",
                "Hello World Content",
                NotificationType.INFORMATION));
    }
}
