package com.example.darionevistic.alias.ui.settings.mvp

import com.example.darionevistic.alias.database.entity.SettingsData
import com.jakewharton.rxbinding2.InitialValueObservable
import com.jakewharton.rxbinding2.widget.SeekBarChangeEvent
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import rx.Subscription

/**
 * Created by dario.nevistic on 08/03/2018.
 */
interface SettingsContract {

    interface View {

        fun changeFinalWordSettings(state: Boolean)

        fun showPointsForVictortValue(value: String)

        fun showNumberOfWordsPerRoundValue(value: String)

        fun showTotalRoundsValue(value: String)

        fun showRoundTimeValue(value: String)

        fun showFinalWordWorthValue(value: String)

        fun goBackOnPreviousActivity()

        fun setMessage(message: String)

        fun observePointsForVictory()

        fun getSettings(): SettingsData

//        fun observeNumberOfWordsPerRound()
//
//        fun observeTotalRounds()
//
//        fun observeRoundTimeInSeconds()
//
//        fun observeMissedWordPenalty()
//
//        fun observeCommonFinalWord()
//
//        fun observeFinalWordPointsWorth()

        fun observeBackBtn(): Observable<Any>
    }

    interface Presenter {

        fun saveSettings(settingsData: SettingsData)

        //        fun onNumberOfWordsPerRoundChange()
//
//        fun onRoundsTotalChange()
//
//        fun onRoundTimeSecondsPerRoundChange()
//
//        fun onMissedWordPenaltyChange()
//
//        fun onCommonFinalWordChange()
//
//        fun onFinalWordPointsWorthChange()
//
        fun onBackPressed(): Disposable
    }
}