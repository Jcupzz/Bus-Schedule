package com.jcupzz.busschedule.viewmodels

import androidx.lifecycle.ViewModel
import com.jcupzz.busschedule.database.schedule.Schedule
import com.jcupzz.busschedule.database.schedule.ScheduleDao
import kotlinx.coroutines.flow.Flow

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {

    fun fullSchedule(): Flow<List<Schedule>> = scheduleDao.getAll()

    fun scheduleForStopName(name: String): Flow<List<Schedule>> = scheduleDao.getByStopName(name)
}