package com.project.lumina.client.util

import android.app.Activity
import android.content.Context
import android.net.Uri

class SessionManager(private val context: Context) {

    companion object {
        private const val SESSION_DURATION_HOURS = 4
        private const val SESSION_DURATION_MS = SESSION_DURATION_HOURS * 60 * 60 * 1000L
        // Добавим заглушку для домена, если её ищут другие файлы
        const val YOUR_DOMAIN = "http://localhost"
    }

    fun checkSession(activity: Activity): Boolean {
        return true
    }

    fun validateAndSaveSession(key: String, req: String): Boolean {
        return true
    }

    fun hasValidSession(): Boolean {
        return true
    }

    fun saveSession() {
    }

    fun getStoredReqCode(): String? {
        return null
    }

    fun clearSession() {
    }

    fun getRemainingSessionTime(): Long {
        return SESSION_DURATION_MS
    }
}