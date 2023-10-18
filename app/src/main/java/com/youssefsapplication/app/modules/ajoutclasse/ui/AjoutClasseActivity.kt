package com.youssefsapplication.app.modules.ajoutclasse.ui

import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityAjoutClasseBinding
import com.youssefsapplication.app.modules.ajoutclasse.`data`.viewmodel.AjoutClasseVM
import kotlin.String
import kotlin.Unit

class AjoutClasseActivity : BaseActivity<ActivityAjoutClasseBinding>(R.layout.activity_ajout_classe)
    {
  private val viewModel: AjoutClasseVM by viewModels<AjoutClasseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ajoutClasseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AJOUT_CLASSE_ACTIVITY"

  }
}
