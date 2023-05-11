package com.example.kelineyt.fragments.lognRegister

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class IntroductionFragmentDirections private constructor() {
  public companion object {
    public fun actionIntroductionFragmentToAccountOptionsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_introductionFragment_to_accountOptionsFragment)
  }
}
