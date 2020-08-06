package com.test.navi

import android.content.Context
import androidx.multidex.MultiDex
import com.test.navi.di.components.DaggerNaviComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

open class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication?> {
        return DaggerNaviComponent.builder().create(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}