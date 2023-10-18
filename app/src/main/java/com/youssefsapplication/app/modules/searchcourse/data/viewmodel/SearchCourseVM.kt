package com.youssefsapplication.app.modules.searchcourse.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.youssefsapplication.app.modules.searchcourse.`data`.model.SearchCourseModel
import org.koin.core.KoinComponent

class SearchCourseVM : ViewModel(), KoinComponent {
  val searchCourseModel: MutableLiveData<SearchCourseModel> = MutableLiveData(SearchCourseModel())

  var navArguments: Bundle? = null
}
