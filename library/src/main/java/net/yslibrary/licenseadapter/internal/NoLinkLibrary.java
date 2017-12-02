package net.yslibrary.licenseadapter.internal;

import android.support.annotation.NonNull;
import net.yslibrary.licenseadapter.BaseLibrary;
import net.yslibrary.licenseadapter.License;

/**
 * Library without license url
 */
public final class NoLinkLibrary extends BaseLibrary {
  public NoLinkLibrary(@NonNull String name, @NonNull String author,
      @NonNull License license) {
    super(name, author, license);
  }

  @Override
  public boolean isLoaded() {
    return true;
  }

  @Override
  public void doLoad() {
    // There's no link to load
  }

  @Override
  public boolean hasContent() {
    return false;
  }
}
