package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    /* renamed from: androidx.core.app.CoreComponentFactory$θ  reason: contains not printable characters */
    public interface AbstractC0056 {
        /* renamed from: θ  reason: contains not printable characters */
        Object m251();
    }

    @Override // android.app.AppComponentFactory
    public Activity instantiateActivity(ClassLoader cl, String className, Intent intent) {
        return (Activity) m250(super.instantiateActivity(cl, className, intent));
    }

    @Override // android.app.AppComponentFactory
    public Application instantiateApplication(ClassLoader cl, String className) {
        return (Application) m250(super.instantiateApplication(cl, className));
    }

    @Override // android.app.AppComponentFactory
    public BroadcastReceiver instantiateReceiver(ClassLoader cl, String className, Intent intent) {
        return (BroadcastReceiver) m250(super.instantiateReceiver(cl, className, intent));
    }

    @Override // android.app.AppComponentFactory
    public ContentProvider instantiateProvider(ClassLoader cl, String className) {
        return (ContentProvider) m250(super.instantiateProvider(cl, className));
    }

    @Override // android.app.AppComponentFactory
    public Service instantiateService(ClassLoader cl, String className, Intent intent) {
        return (Service) m250(super.instantiateService(cl, className, intent));
    }

    /* renamed from: θ  reason: contains not printable characters */
    public static <T> T m250(T obj) {
        T wrapper;
        if (!(obj instanceof AbstractC0056) || (wrapper = (T) obj.m251()) == null) {
            return obj;
        }
        return wrapper;
    }
}
