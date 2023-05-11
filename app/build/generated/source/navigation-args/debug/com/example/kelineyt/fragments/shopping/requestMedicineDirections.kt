package com.example.kelineyt.fragments.shopping

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class requestMedicineDirections private constructor() {
  public companion object {
    public fun actionRequestMedicineToRequestMedicineListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_requestMedicine_to_requestMedicineListFragment)
  }
}
