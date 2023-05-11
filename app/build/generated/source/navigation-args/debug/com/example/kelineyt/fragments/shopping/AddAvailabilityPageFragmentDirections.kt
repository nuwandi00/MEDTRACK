package com.example.kelineyt.fragments.shopping

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class AddAvailabilityPageFragmentDirections private constructor() {
  public companion object {
    public fun actionAddAvailabilityPageFragmentToAddAvailabilityListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addAvailabilityPageFragment_to_addAvailabilityListFragment)
  }
}
