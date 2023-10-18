package com.youssefsapplication.app.modules.authorprofile.ui

import androidx.activity.viewModels
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivityAuthorProfileBinding
import com.youssefsapplication.app.modules.authorprofile.`data`.viewmodel.AuthorProfileVM
import kotlin.String
import kotlin.Unit

class AuthorProfileActivity :
    BaseActivity<ActivityAuthorProfileBinding>(R.layout.activity_author_profile) {
  private val viewModel: AuthorProfileVM by viewModels<AuthorProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.authorProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AUTHOR_PROFILE_ACTIVITY"

  }
}
