// Generated by Dagger (https://dagger.dev).
package com.example.kelineyt;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.example.kelineyt.activities.LoginRegisterActivity;
import com.example.kelineyt.activities.ShoppingActivity;
import com.example.kelineyt.di.AppModule;
import com.example.kelineyt.di.AppModule_ProvideFirebaseAuthFactory;
import com.example.kelineyt.di.AppModule_ProvideFirebaseCommonFactory;
import com.example.kelineyt.di.AppModule_ProvideFirebaseFirestoreDatabaseFactory;
import com.example.kelineyt.di.AppModule_ProvideIntroductionSPFactory;
import com.example.kelineyt.di.AppModule_ProvideStorageFactory;
import com.example.kelineyt.firebase.FirebaseCommon;
import com.example.kelineyt.fragments.categories.CareFragment;
import com.example.kelineyt.fragments.categories.CareFragment_MembersInjector;
import com.example.kelineyt.fragments.categories.MainCategoryFragment;
import com.example.kelineyt.fragments.categories.MedDevicesFragment;
import com.example.kelineyt.fragments.categories.MedDevicesFragment_MembersInjector;
import com.example.kelineyt.fragments.categories.MedicineFragment;
import com.example.kelineyt.fragments.categories.MedicineFragment_MembersInjector;
import com.example.kelineyt.fragments.categories.NutritionFragment;
import com.example.kelineyt.fragments.categories.NutritionFragment_MembersInjector;
import com.example.kelineyt.fragments.categories.OtherFragment;
import com.example.kelineyt.fragments.categories.OtherFragment_MembersInjector;
import com.example.kelineyt.fragments.lognRegister.IntroductionFragment;
import com.example.kelineyt.fragments.lognRegister.LoginFragment;
import com.example.kelineyt.fragments.lognRegister.RegisterFragment;
import com.example.kelineyt.fragments.settings.AllOrdersFragment;
import com.example.kelineyt.fragments.settings.UserAccountFragment;
import com.example.kelineyt.fragments.shopping.AddressFragment;
import com.example.kelineyt.fragments.shopping.BillingFragment;
import com.example.kelineyt.fragments.shopping.ProductDetailsFragment;
import com.example.kelineyt.fragments.shopping.ProfileFragment;
import com.example.kelineyt.viewmodel.AddressViewModel;
import com.example.kelineyt.viewmodel.AddressViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.AllOrdersViewModel;
import com.example.kelineyt.viewmodel.AllOrdersViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.BillingViewModel;
import com.example.kelineyt.viewmodel.BillingViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.CartViewModel;
import com.example.kelineyt.viewmodel.CartViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.DetailsViewModel;
import com.example.kelineyt.viewmodel.DetailsViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.IntroductionViewModel;
import com.example.kelineyt.viewmodel.IntroductionViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.LoginViewModel;
import com.example.kelineyt.viewmodel.LoginViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.MainCategoryViewModel;
import com.example.kelineyt.viewmodel.MainCategoryViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.OrderViewModel;
import com.example.kelineyt.viewmodel.OrderViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.ProfileViewModel;
import com.example.kelineyt.viewmodel.ProfileViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.RegisterViewModel;
import com.example.kelineyt.viewmodel.RegisterViewModel_HiltModules_KeyModule_ProvideFactory;
import com.example.kelineyt.viewmodel.UserAccountViewModel;
import com.example.kelineyt.viewmodel.UserAccountViewModel_HiltModules_KeyModule_ProvideFactory;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.StorageReference;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerKelineApplication_HiltComponents_SingletonC extends KelineApplication_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private final DaggerKelineApplication_HiltComponents_SingletonC singletonC = this;

  private Provider<FirebaseFirestore> provideFirebaseFirestoreDatabaseProvider;

  private Provider<FirebaseAuth> provideFirebaseAuthProvider;

  private Provider<FirebaseCommon> provideFirebaseCommonProvider;

  private Provider<StorageReference> provideStorageProvider;

  private DaggerKelineApplication_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    initialize(applicationContextModuleParam);

  }

  public static Builder builder() {
    return new Builder();
  }

  private SharedPreferences sharedPreferences() {
    return AppModule_ProvideIntroductionSPFactory.provideIntroductionSP(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
  }

  @SuppressWarnings("unchecked")
  private void initialize(final ApplicationContextModule applicationContextModuleParam) {
    this.provideFirebaseFirestoreDatabaseProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseFirestore>(singletonC, 0));
    this.provideFirebaseAuthProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseAuth>(singletonC, 1));
    this.provideFirebaseCommonProvider = DoubleCheck.provider(new SwitchingProvider<FirebaseCommon>(singletonC, 2));
    this.provideStorageProvider = DoubleCheck.provider(new SwitchingProvider<StorageReference>(singletonC, 3));
  }

  @Override
  public void injectKelineApplication(KelineApplication arg0) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder(singletonC);
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder(singletonC);
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public KelineApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerKelineApplication_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements KelineApplication_HiltComponents.ActivityRetainedC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private ActivityRetainedCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public KelineApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl(singletonC);
    }
  }

  private static final class ActivityCBuilder implements KelineApplication_HiltComponents.ActivityC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public KelineApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonC, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements KelineApplication_HiltComponents.FragmentC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public KelineApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements KelineApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public KelineApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements KelineApplication_HiltComponents.ViewC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public KelineApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonC, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements KelineApplication_HiltComponents.ViewModelC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public KelineApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      return new ViewModelCImpl(singletonC, activityRetainedCImpl, savedStateHandle);
    }
  }

  private static final class ServiceCBuilder implements KelineApplication_HiltComponents.ServiceC.Builder {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private Service service;

    private ServiceCBuilder(DaggerKelineApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public KelineApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonC, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends KelineApplication_HiltComponents.ViewWithFragmentC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    private ViewWithFragmentCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends KelineApplication_HiltComponents.FragmentC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    private FragmentCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        Fragment fragmentParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public void injectCareFragment(CareFragment arg0) {
      injectCareFragment2(arg0);
    }

    @Override
    public void injectMainCategoryFragment(MainCategoryFragment arg0) {
    }

    @Override
    public void injectMedDevicesFragment(MedDevicesFragment arg0) {
      injectMedDevicesFragment2(arg0);
    }

    @Override
    public void injectMedicineFragment(MedicineFragment arg0) {
      injectMedicineFragment2(arg0);
    }

    @Override
    public void injectNutritionFragment(NutritionFragment arg0) {
      injectNutritionFragment2(arg0);
    }

    @Override
    public void injectOtherFragment(OtherFragment arg0) {
      injectOtherFragment2(arg0);
    }

    @Override
    public void injectIntroductionFragment(IntroductionFragment arg0) {
    }

    @Override
    public void injectLoginFragment(LoginFragment arg0) {
    }

    @Override
    public void injectRegisterFragment(RegisterFragment arg0) {
    }

    @Override
    public void injectAllOrdersFragment(AllOrdersFragment arg0) {
    }

    @Override
    public void injectUserAccountFragment(UserAccountFragment arg0) {
    }

    @Override
    public void injectAddressFragment(AddressFragment arg0) {
    }

    @Override
    public void injectBillingFragment(BillingFragment arg0) {
    }

    @Override
    public void injectProductDetailsFragment(ProductDetailsFragment arg0) {
    }

    @Override
    public void injectProfileFragment(ProfileFragment arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }

    @CanIgnoreReturnValue
    private CareFragment injectCareFragment2(CareFragment instance) {
      CareFragment_MembersInjector.injectFirestore(instance, singletonC.provideFirebaseFirestoreDatabaseProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MedDevicesFragment injectMedDevicesFragment2(MedDevicesFragment instance) {
      MedDevicesFragment_MembersInjector.injectFirestore(instance, singletonC.provideFirebaseFirestoreDatabaseProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private MedicineFragment injectMedicineFragment2(MedicineFragment instance) {
      MedicineFragment_MembersInjector.injectFirestore(instance, singletonC.provideFirebaseFirestoreDatabaseProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private NutritionFragment injectNutritionFragment2(NutritionFragment instance) {
      NutritionFragment_MembersInjector.injectFirestore(instance, singletonC.provideFirebaseFirestoreDatabaseProvider.get());
      return instance;
    }

    @CanIgnoreReturnValue
    private OtherFragment injectOtherFragment2(OtherFragment instance) {
      OtherFragment_MembersInjector.injectFirestore(instance, singletonC.provideFirebaseFirestoreDatabaseProvider.get());
      return instance;
    }
  }

  private static final class ViewCImpl extends KelineApplication_HiltComponents.ViewC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    private ViewCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl, View viewParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends KelineApplication_HiltComponents.ActivityC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    private ActivityCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, Activity activityParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectLoginRegisterActivity(LoginRegisterActivity arg0) {
    }

    @Override
    public void injectShoppingActivity(ShoppingActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder(singletonC, activityRetainedCImpl));
    }

    @Override
    public Set<String> getViewModelKeys() {
      return ImmutableSet.<String>of(AddressViewModel_HiltModules_KeyModule_ProvideFactory.provide(), AllOrdersViewModel_HiltModules_KeyModule_ProvideFactory.provide(), BillingViewModel_HiltModules_KeyModule_ProvideFactory.provide(), CartViewModel_HiltModules_KeyModule_ProvideFactory.provide(), DetailsViewModel_HiltModules_KeyModule_ProvideFactory.provide(), IntroductionViewModel_HiltModules_KeyModule_ProvideFactory.provide(), LoginViewModel_HiltModules_KeyModule_ProvideFactory.provide(), MainCategoryViewModel_HiltModules_KeyModule_ProvideFactory.provide(), OrderViewModel_HiltModules_KeyModule_ProvideFactory.provide(), ProfileViewModel_HiltModules_KeyModule_ProvideFactory.provide(), RegisterViewModel_HiltModules_KeyModule_ProvideFactory.provide(), UserAccountViewModel_HiltModules_KeyModule_ProvideFactory.provide());
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonC, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends KelineApplication_HiltComponents.ViewModelC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    private Provider<AddressViewModel> addressViewModelProvider;

    private Provider<AllOrdersViewModel> allOrdersViewModelProvider;

    private Provider<BillingViewModel> billingViewModelProvider;

    private Provider<CartViewModel> cartViewModelProvider;

    private Provider<DetailsViewModel> detailsViewModelProvider;

    private Provider<IntroductionViewModel> introductionViewModelProvider;

    private Provider<LoginViewModel> loginViewModelProvider;

    private Provider<MainCategoryViewModel> mainCategoryViewModelProvider;

    private Provider<OrderViewModel> orderViewModelProvider;

    private Provider<ProfileViewModel> profileViewModelProvider;

    private Provider<RegisterViewModel> registerViewModelProvider;

    private Provider<UserAccountViewModel> userAccountViewModelProvider;

    private ViewModelCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        ActivityRetainedCImpl activityRetainedCImpl, SavedStateHandle savedStateHandleParam) {
      this.singletonC = singletonC;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam) {
      this.addressViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 0);
      this.allOrdersViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 1);
      this.billingViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 2);
      this.cartViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 3);
      this.detailsViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 4);
      this.introductionViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 5);
      this.loginViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 6);
      this.mainCategoryViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 7);
      this.orderViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 8);
      this.profileViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 9);
      this.registerViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 10);
      this.userAccountViewModelProvider = new SwitchingProvider<>(singletonC, activityRetainedCImpl, viewModelCImpl, 11);
    }

    @Override
    public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
      return ImmutableMap.<String, Provider<ViewModel>>builderWithExpectedSize(12).put("com.example.kelineyt.viewmodel.AddressViewModel", (Provider) addressViewModelProvider).put("com.example.kelineyt.viewmodel.AllOrdersViewModel", (Provider) allOrdersViewModelProvider).put("com.example.kelineyt.viewmodel.BillingViewModel", (Provider) billingViewModelProvider).put("com.example.kelineyt.viewmodel.CartViewModel", (Provider) cartViewModelProvider).put("com.example.kelineyt.viewmodel.DetailsViewModel", (Provider) detailsViewModelProvider).put("com.example.kelineyt.viewmodel.IntroductionViewModel", (Provider) introductionViewModelProvider).put("com.example.kelineyt.viewmodel.LoginViewModel", (Provider) loginViewModelProvider).put("com.example.kelineyt.viewmodel.MainCategoryViewModel", (Provider) mainCategoryViewModelProvider).put("com.example.kelineyt.viewmodel.OrderViewModel", (Provider) orderViewModelProvider).put("com.example.kelineyt.viewmodel.ProfileViewModel", (Provider) profileViewModelProvider).put("com.example.kelineyt.viewmodel.RegisterViewModel", (Provider) registerViewModelProvider).put("com.example.kelineyt.viewmodel.UserAccountViewModel", (Provider) userAccountViewModelProvider).build();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, ViewModelCImpl viewModelCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // com.example.kelineyt.viewmodel.AddressViewModel 
          return (T) new AddressViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get());

          case 1: // com.example.kelineyt.viewmodel.AllOrdersViewModel 
          return (T) new AllOrdersViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get());

          case 2: // com.example.kelineyt.viewmodel.BillingViewModel 
          return (T) new BillingViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get());

          case 3: // com.example.kelineyt.viewmodel.CartViewModel 
          return (T) new CartViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get(), singletonC.provideFirebaseCommonProvider.get());

          case 4: // com.example.kelineyt.viewmodel.DetailsViewModel 
          return (T) new DetailsViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get(), singletonC.provideFirebaseCommonProvider.get());

          case 5: // com.example.kelineyt.viewmodel.IntroductionViewModel 
          return (T) new IntroductionViewModel(singletonC.sharedPreferences(), singletonC.provideFirebaseAuthProvider.get());

          case 6: // com.example.kelineyt.viewmodel.LoginViewModel 
          return (T) new LoginViewModel(singletonC.provideFirebaseAuthProvider.get());

          case 7: // com.example.kelineyt.viewmodel.MainCategoryViewModel 
          return (T) new MainCategoryViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get());

          case 8: // com.example.kelineyt.viewmodel.OrderViewModel 
          return (T) new OrderViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get());

          case 9: // com.example.kelineyt.viewmodel.ProfileViewModel 
          return (T) new ProfileViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get());

          case 10: // com.example.kelineyt.viewmodel.RegisterViewModel 
          return (T) new RegisterViewModel(singletonC.provideFirebaseAuthProvider.get(), singletonC.provideFirebaseFirestoreDatabaseProvider.get());

          case 11: // com.example.kelineyt.viewmodel.UserAccountViewModel 
          return (T) new UserAccountViewModel(singletonC.provideFirebaseFirestoreDatabaseProvider.get(), singletonC.provideFirebaseAuthProvider.get(), singletonC.provideStorageProvider.get(), ApplicationContextModule_ProvideApplicationFactory.provideApplication(singletonC.applicationContextModule));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends KelineApplication_HiltComponents.ActivityRetainedC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    @SuppressWarnings("rawtypes")
    private Provider lifecycleProvider;

    private ActivityRetainedCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC) {
      this.singletonC = singletonC;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider<Object>(singletonC, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonC, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
          ActivityRetainedCImpl activityRetainedCImpl, int id) {
        this.singletonC = singletonC;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.Lifecycle 
          return (T) ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends KelineApplication_HiltComponents.ServiceC {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final ServiceCImpl serviceCImpl = this;

    private ServiceCImpl(DaggerKelineApplication_HiltComponents_SingletonC singletonC,
        Service serviceParam) {
      this.singletonC = singletonC;


    }
  }

  private static final class SwitchingProvider<T> implements Provider<T> {
    private final DaggerKelineApplication_HiltComponents_SingletonC singletonC;

    private final int id;

    SwitchingProvider(DaggerKelineApplication_HiltComponents_SingletonC singletonC, int id) {
      this.singletonC = singletonC;
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.google.firebase.firestore.FirebaseFirestore 
        return (T) AppModule_ProvideFirebaseFirestoreDatabaseFactory.provideFirebaseFirestoreDatabase();

        case 1: // com.google.firebase.auth.FirebaseAuth 
        return (T) AppModule_ProvideFirebaseAuthFactory.provideFirebaseAuth();

        case 2: // com.example.kelineyt.firebase.FirebaseCommon 
        return (T) AppModule_ProvideFirebaseCommonFactory.provideFirebaseCommon(singletonC.provideFirebaseAuthProvider.get(), singletonC.provideFirebaseFirestoreDatabaseProvider.get());

        case 3: // com.google.firebase.storage.StorageReference 
        return (T) AppModule_ProvideStorageFactory.provideStorage();

        default: throw new AssertionError(id);
      }
    }
  }
}
