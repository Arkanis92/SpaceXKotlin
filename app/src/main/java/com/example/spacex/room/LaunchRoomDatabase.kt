package com.example.spacex.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.spacex.room.dao.LaunchDao
import com.example.spacex.room.entity.LaunchEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

@Database(entities = [LaunchEntity::class], version = 1, exportSchema = false)

abstract class LaunchRoomDatabase : RoomDatabase() {
    abstract fun launchDao(): LaunchDao

    companion object {
        @Volatile
        private var INSTANCE: LaunchRoomDatabase? = null
        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): LaunchRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LaunchRoomDatabase::class.java,
                    "launch_database"
                )
                    .addCallback(LaunchDatabaseCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class LaunchDatabaseCallback(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.launchDao())
                    }
                }
            }
        }

        suspend fun populateDatabase(launchDao: LaunchDao) {
            launchDao.deleteAll()

//            var launchData = LaunchEntity("Mission Name 1", "Rocket Name 1", "Launch Site Name 1", "01-01-01", "Placeholder Image 1")
//            launchDao.insertLaunchData(launchData)
//            launchData = LaunchEntity("Mission Name 2", "Rocket Name 2", "Launch Site Name 2", "02-02-02", "Placeholder Image 2")
//            launchDao.insertLaunchData(launchData)
        }
    }
}