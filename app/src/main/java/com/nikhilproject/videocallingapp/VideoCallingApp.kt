package com.nikhilproject.videocallingapp

import android.app.Application
import com.nikhilproject.videocallingapp.di.appModule
import io.getstream.video.android.core.StreamVideo
import io.getstream.video.android.core.StreamVideoBuilder
import io.getstream.video.android.model.User
import io.getstream.video.android.model.UserType
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class VideoCallingApp : Application() {
    private var currentName: String? = null
    var client: StreamVideo? = null


    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@VideoCallingApp)
            modules(appModule)
        }
    }

    fun initVideoClient(userName: String) {
        if (client != null || userName != currentName) {
            StreamVideo.removeClient()
            currentName = userName

            client = StreamVideoBuilder(
                context = this,
                apiKey = "axw5bfdh55ya",
                user = User(id = userName, name = userName, type = UserType.Guest),
            ).build()
        }
    }
}