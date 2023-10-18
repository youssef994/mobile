package com.youssefsapplication.app.modules.ajoutenseignant.ui

import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityAjoutEnseignantBinding
import com.youssefsapplication.app.modules.ajoutenseignant.`data`.viewmodel.AjoutEnseignantVM
import kotlin.String
import kotlin.Unit

class AjoutEnseignantActivity :
    BaseActivity<ActivityAjoutEnseignantBinding>(R.layout.activity_ajout_enseignant) {
  private val viewModel: AjoutEnseignantVM by viewModels<AjoutEnseignantVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ajoutEnseignantVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AJOUT_ENSEIGNANT_ACTIVITY"

  }
}
