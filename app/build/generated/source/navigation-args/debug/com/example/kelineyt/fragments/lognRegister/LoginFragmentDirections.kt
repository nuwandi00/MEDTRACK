package com.example.kelineyt.fragments.lognRegister

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.kelineyt.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment)
  }
}
