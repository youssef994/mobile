package com.youssefsapplication.app.modules.etudiant.`data`.model

import com.youssefsapplication.app.R
import com.youssefsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EtudiantModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSarahW: String? = MyApp.getInstance().resources.getString(R.string.lbl_sarah_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEtudiant: String? = MyApp.getInstance().resources.getString(R.string.lbl_etudiant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailProfil: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail_profil)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotes: String? = MyApp.getInstance().resources.getString(R.string.lbl_notes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReclamation: String? = MyApp.getInstance().resources.getString(R.string.lbl_reclamation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClub: String? = MyApp.getInstance().resources.getString(R.string.lbl_club)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailProfile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_detail_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)

)
