package com.example.kelineyt.fragments.shopping

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class FeedbackFragmentDirections private constructor() {
  public companion object {
    public fun actionFeedbackFragmentToFeedbackListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_feedbackFragment_to_feedbackListFragment)
  }
}
