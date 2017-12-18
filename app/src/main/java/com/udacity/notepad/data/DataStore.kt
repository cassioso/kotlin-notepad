package com.udacity.notepad.data

import android.content.Context
import org.jetbrains.anko.doAsync

object DataStore {

    // https://kotlinlang.org/docs/reference/properties.html#late-initialized-properties-and-variables
    @JvmStatic
    lateinit var notes: NoteDatabase

    fun init(context: Context) {
        notes = NoteDatabase(context)
    }

    fun execute(fn: () -> Unit) {
        doAsync { fn() }
    }
}
