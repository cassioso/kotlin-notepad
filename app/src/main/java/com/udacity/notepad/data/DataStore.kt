package com.udacity.notepad.data

import android.content.Context

import java.util.concurrent.Executor
import java.util.concurrent.Executors

object DataStore {

    val EXEC: Executor = Executors.newSingleThreadExecutor()

    // https://kotlinlang.org/docs/reference/properties.html#late-initialized-properties-and-variables
    @JvmStatic
    lateinit var notes: NoteDatabase

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(runnable: Runnable) {
        EXEC.execute(runnable)
    }
}
