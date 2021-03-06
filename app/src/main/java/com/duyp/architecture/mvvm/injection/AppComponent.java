package com.duyp.architecture.mvvm.injection;

import android.app.Application;

import com.duyp.architecture.mvvm.App;
import com.duyp.architecture.mvvm.injection.ui_modules.BuildersModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Duy Pham on 4/30/17.
 * Component in application scope (singleton)
 */

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AndroidInjectionModule.class,
                AppModule.class,
                NetworkModule.class,
                DataModule.class,
                BuildersModule.class
        }
)
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance Builder application(Application application);

        AppComponent build();
    }

    void inject(App application);
}
