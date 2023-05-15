package dev.redfox.networkaccessstorage.ui

import R
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class ViewFilesFragmentDirections private constructor() {
  public companion object {
    public fun actionViewFilesFragmentToUploadFileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_viewFilesFragment_to_uploadFileFragment)
  }
}
