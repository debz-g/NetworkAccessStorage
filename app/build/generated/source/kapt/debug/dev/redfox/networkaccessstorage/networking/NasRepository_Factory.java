// Generated by Dagger (https://dagger.dev).
package dev.redfox.networkaccessstorage.networking;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NasRepository_Factory implements Factory<NasRepository> {
  private final Provider<NasApiInterface> nasApiInterfaceProvider;

  public NasRepository_Factory(Provider<NasApiInterface> nasApiInterfaceProvider) {
    this.nasApiInterfaceProvider = nasApiInterfaceProvider;
  }

  @Override
  public NasRepository get() {
    return newInstance(nasApiInterfaceProvider.get());
  }

  public static NasRepository_Factory create(Provider<NasApiInterface> nasApiInterfaceProvider) {
    return new NasRepository_Factory(nasApiInterfaceProvider);
  }

  public static NasRepository newInstance(NasApiInterface nasApiInterface) {
    return new NasRepository(nasApiInterface);
  }
}
