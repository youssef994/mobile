package com.youssefsapplication.app.modules.ajoutclub.ui

import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityAjoutClubBinding
import com.youssefsapplication.app.modules.ajoutclub.`data`.viewmodel.AjoutClubVM
import kotlin.String
import kotlin.Unit

class AjoutClubActivity : BaseActivity<ActivityAjoutClubBinding>(R.layout.activity_ajout_club) {
  private val viewModel: AjoutClubVM by viewModels<AjoutClubVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ajoutClubVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AJOUT_CLUB_ACTIVITY"

  }
}
