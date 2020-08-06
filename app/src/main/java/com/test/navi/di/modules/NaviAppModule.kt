package com.test.navi.di.modules

import android.content.Context
import com.test.navi.App
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NaviAppModule {
    @Singleton
    @Provides
    fun provideContext(app: App): Context {
        return app
    }

}