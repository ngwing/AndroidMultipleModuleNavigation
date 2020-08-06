package com.test.navi.di.components

import com.test.navi.App
import com.test.navi.di.builders.ActivityBuilder
import com.test.navi.di.modules.NaviAppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class,
    NaviAppModule::class,
    ActivityBuilder::class])
interface NaviComponent : AndroidInjector<App?> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App?>()
}