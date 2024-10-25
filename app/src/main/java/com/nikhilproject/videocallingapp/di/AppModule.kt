package com.nikhilproject.videocallingapp.di

import com.nikhilproject.videocallingapp.VideoCallingApp
import com.nikhilproject.videocallingapp.connect.ConnectViewModel
import com.nikhilproject.videocallingapp.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {

    factory {
        val app = androidContext().applicationContext as VideoCallingApp
        app.client
    }

    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}