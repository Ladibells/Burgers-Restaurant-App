package dev.ladibells.burgersrestaurantapp

import android.app.Application
import dev.ladibells.burgersrestaurantapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BurgersApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(androidContext = this@BurgersApplication)
            modules(appModule)
        }
    }
}