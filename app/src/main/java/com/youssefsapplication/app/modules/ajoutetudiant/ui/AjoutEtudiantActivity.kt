package com.youssefsapplication.app.modules.ajoutetudiant.ui

import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityAjoutEtudiantBinding
import com.youssefsapplication.app.modules.ajoutetudiant.`data`.viewmodel.AjoutEtudiantVM
import kotlin.String
import kotlin.Unit

class AjoutEtudiantActivity :
    BaseActivity<ActivityAjoutEtudiantBinding>(R.layout.activity_ajout_etudiant) {
  private val viewModel: AjoutEtudiantVM by viewModels<AjoutEtudiantVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ajoutEtudiantVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AJOUT_ETUDIANT_ACTIVITY"

  }
}
