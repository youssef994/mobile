package com.youssefsapplication.app.modules.etudiant.ui

import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityEtudiantBinding
import com.youssefsapplication.app.modules.etudiant.`data`.viewmodel.EtudiantVM
import kotlin.String
import kotlin.Unit

class EtudiantActivity : BaseActivity<ActivityEtudiantBinding>(R.layout.activity_etudiant) {
  private val viewModel: EtudiantVM by viewModels<EtudiantVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.etudiantVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ETUDIANT_ACTIVITY"

  }
}
