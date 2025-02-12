package com.typ.todo

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.typ.todo.data.MongoDB
import com.typ.todo.presentation.screen.home.HomeScreen
import com.typ.todo.presentation.screen.home.HomeViewModel
import com.typ.todo.presentation.screen.task.TaskViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.core.context.startKoin
import org.koin.dsl.module


@Composable
@Preview
fun App() {

    initializeKoin()
    Theme {
        Navigator(HomeScreen()) {
            SlideTransition(it)
        }
    }
}

val mongoModule = module {
    single { MongoDB() }
    factory { HomeViewModel(get()) }
    factory { TaskViewModel(get()) }
}

fun initializeKoin() {
    startKoin {
        modules(mongoModule)
    }
}