package com.youssefsapplication.app.modules.authmain.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.appcomponents.googleauth.GoogleHelper
import com.youssefsapplication.app.databinding.ActivityAuthMainBinding
import com.youssefsapplication.app.modules.authmain.`data`.viewmodel.AuthMainVM
import com.youssefsapplication.app.modules.dashboardadmin.ui.DashboardAdminActivity
import kotlin.String
import kotlin.Unit

class AuthMainActivity : BaseActivity<ActivityAuthMainBinding>(R.layout.activity_auth_main) {
  private val viewModel: AuthMainVM by viewModels<AuthMainVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.authMainVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = DashboardAdminActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
      googleLogin = GoogleHelper(this,
      { accountInfo ->
        },{ error -> 

        })
      }

      override fun setUpClicks(): Unit {
        binding.btnSignInWithGoogle.setOnClickListener {
          googleLogin.login()
        }
      }

      companion object {
        const val TAG: String = "AUTH_MAIN_ACTIVITY"

      }
    }
