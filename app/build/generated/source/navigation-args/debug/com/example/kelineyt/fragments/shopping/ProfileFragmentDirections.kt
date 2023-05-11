package com.example.kelineyt.fragments.shopping

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class ProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionProfileFragmentToUserAccountFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_userAccountFragment)

    public fun actionProfileFragmentToOrdersFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_ordersFragment)

    public fun actionProfileFragmentToFeedbackFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_feedbackFragment)

    public fun actionProfileFragmentToRequestMedicine(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_requestMedicine)

    public fun actionProfileFragmentToSchedulingFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_schedulingFragment2)
  }
}
