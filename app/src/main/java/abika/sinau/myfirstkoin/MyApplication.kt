package abika.sinau.myfirstkoin

import abika.sinau.myfirstkoin.di.networkModule
import abika.sinau.myfirstkoin.di.repositoryModule
import abika.sinau.myfirstkoin.di.viewModelModule
import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import org.koin.dsl.module


/**
 * @author by Abika Chairul Yusri on 5/26/2022
 */

// TODO 2: Create class myApplication, and add this to manifest
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // TODO 5: Add some module that we have created in here
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            // if just one
//            modules(networkModule)

            // if more than one
            module {
                listOf(
                    networkModule,
                    repositoryModule,
                    viewModelModule
                )
            }
        }
    }
}