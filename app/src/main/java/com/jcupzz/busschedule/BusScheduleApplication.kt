package com.jcupzz.busschedule

import android.app.Application
import com.jcupzz.busschedule.database.schedule.AppDatabase

class BusScheduleApplication : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}