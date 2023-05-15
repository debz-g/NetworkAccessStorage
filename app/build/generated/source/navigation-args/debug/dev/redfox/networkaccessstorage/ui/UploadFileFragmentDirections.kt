package dev.redfox.networkaccessstorage.ui

import R
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class UploadFileFragmentDirections private constructor() {
  public companion object {
    public fun actionUploadFileFragmentToViewFilesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_uploadFileFragment_to_viewFilesFragment)
  }
}
