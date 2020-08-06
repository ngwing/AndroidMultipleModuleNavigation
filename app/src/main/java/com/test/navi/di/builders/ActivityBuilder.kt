package com.test.navi.di.builders

import com.test.Test2Activity
import com.test.TestActivity
import com.test.navi.MainActivity
import com.test.navi.AboutActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity?

    @ContributesAndroidInjector
    abstract fun contributeAboutActivity(): AboutActivity?

    @ContributesAndroidInjector
    abstract fun contributeTestActivity(): TestActivity?

    @ContributesAndroidInjector
    abstract fun contributeTest2Activity(): Test2Activity?
}