package com.example.kelineyt.fragments.settings

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.kelineyt.R
import com.example.kelineyt.`data`.order.Order
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class AllOrdersFragmentDirections private constructor() {
  private data class ActionOrdersFragmentToOrderDetailFragment(
    public val order: Order
  ) : NavDirections {
    public override val actionId: Int = R.id.action_ordersFragment_to_orderDetailFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Order::class.java)) {
          result.putParcelable("order", this.order as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Order::class.java)) {
          result.putSerializable("order", this.order as Serializable)
        } else {
          throw UnsupportedOperationException(Order::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  public companion object {
    public fun actionOrdersFragmentToOrderDetailFragment(order: Order): NavDirections =
        ActionOrdersFragmentToOrderDetailFragment(order)
  }
}
