package com.nikhilproject.videocallingapp.video

sealed interface VideoCallAction {
    data object OnDisconnectClick : VideoCallAction
    data object JoinCall : VideoCallAction
}