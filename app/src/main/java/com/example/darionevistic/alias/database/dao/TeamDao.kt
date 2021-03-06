package com.example.darionevistic.alias.database.dao

import android.arch.persistence.room.*
import com.example.darionevistic.alias.database.entity.Team
import io.reactivex.Single

/**
 * Created by dario.nevistic on 18/03/2018.
 */
@Dao
interface TeamDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTeams(teams: MutableList<Team>)

    @Delete
    fun deleteTeams(teams: MutableList<Team>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTeam(team: Team)

    @Query("SELECT * FROM team")
    fun getAllTeams(): Single<MutableList<Team>>
}