package com.nestor87.swords

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.nestor87.swords.common.constants.routes.GameRoutes
import com.nestor87.swords.presentation.theme.AppTheme
import com.nestor87.swords.presentation.theme.SWordsComposeTheme
import com.nestor87.swords.presentation.ui.achievements.AchievementsScreen
import com.nestor87.swords.presentation.ui.bonuses.BonusesScreen
import com.nestor87.swords.presentation.ui.changeTheme.ChangeThemeScreen
import com.nestor87.swords.presentation.ui.game.GameScreen
import com.nestor87.swords.presentation.ui.messages.MessagesScreen
import com.nestor87.swords.presentation.ui.playersTop.PlayersTopScreen

@Suppress("DEPRECATION")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SWordsComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = AppTheme.colors.windowBackgroundColor
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = GameRoutes.GAME.route
                    ) {
                        composable(GameRoutes.GAME.route) {
                            GameScreen()
                        }
                        composable(GameRoutes.ACHIEVEMENTS.route) {
                            AchievementsScreen()
                        }
                        composable(GameRoutes.CHANGE_THEME.route) {
                            ChangeThemeScreen()
                        }
                        composable(GameRoutes.MESSAGES.route) {
                            MessagesScreen()
                        }
                        composable(GameRoutes.PLAYERS_TOP.route) {
                            PlayersTopScreen()
                        }
                        composable(GameRoutes.BONUSES.route) {
                            BonusesScreen()
                        }
                    }

                }
            }
        }
        hideSystemUI()
    }

    private fun hideSystemUI() {
        actionBar?.hide()
        WindowCompat.setDecorFitsSystemWindows(window, false)

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
            window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } else {
            window.insetsController?.apply {
                hide(WindowInsets.Type.statusBars())
                systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        }
    }

}