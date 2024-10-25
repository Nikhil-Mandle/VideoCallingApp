package com.nikhilproject.videocallingapp.connect

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import com.nikhilproject.videocallingapp.VideoCallingApp

class ConnectViewModel(
    private val app: Application
) : AndroidViewModel(app) {

    var state by mutableStateOf(ConnectState())
        private set


    fun onAction(action: ConnectAction) {

        when (action) {
            ConnectAction.OnConnectClick -> {
                connectToRoom()
            }

            is ConnectAction.OnNameChange -> {
                state = state.copy(
                    name = action.name
                )

            }
        }
    }

    private fun connectToRoom() {
        state = state.copy(
            errorMessage = null
        )
        if (state.name.isEmpty()) {
            state = state.copy(
                errorMessage = "The name can't be empty"
            )
            return
        }

        (app as VideoCallingApp).initVideoClient(state.name)
        // Init Video Client
        state = state.copy(
            isConnected = true
        )
    }
}