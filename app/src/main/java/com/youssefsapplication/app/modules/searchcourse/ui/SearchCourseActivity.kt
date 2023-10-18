package com.youssefsapplication.app.modules.searchcourse.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.base.BaseActivity
import com.youssefsapplication.app.databinding.ActivitySearchCourseBinding
import com.youssefsapplication.app.modules.searchcourse.`data`.viewmodel.SearchCourseVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchCourseActivity :
    BaseActivity<ActivitySearchCourseBinding>(R.layout.activity_search_course) {
  private val viewModel: SearchCourseVM by viewModels<SearchCourseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchCourseVM = viewModel
    setUpSearchViewBaseFormInpListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  private fun setUpSearchViewBaseFormInpListener(): Unit {
    binding.searchViewBaseFormInp.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_COURSE_ACTIVITY"

    }
  }
