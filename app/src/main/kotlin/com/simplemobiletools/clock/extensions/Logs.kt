package com.simplemobiletools.clock.extensions

import android.util.Log

fun <A> A.log(tag: String)                = apply { if (com.simplemobiletools.clock.BuildConfig.DEBUG) Log.wtf(tag, this.toString()) }
fun <A> A.log(first: String, tag: String) = apply { if (com.simplemobiletools.clock.BuildConfig.DEBUG) Log.wtf(tag, first) }
