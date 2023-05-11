package com.example.kelineyt.fragments.shopping

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class SchedulingFragmentDirections private constructor() {
  public companion object {
    public fun actionSchedulingFragment2ToAddAvailabilityPageFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_schedulingFragment2_to_addAvailabilityPageFragment)

    public fun actionSchedulingFragment2ToAddAvailabilityListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_schedulingFragment2_to_addAvailabilityListFragment)

    public fun actionSchedulingFragment2ToRatingActivity(): NavDirections =
        ActionOnlyNavDirections(R.id.action_schedulingFragment2_to_ratingActivity)
  }
}
