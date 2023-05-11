package com.example.kelineyt;

import com.example.kelineyt.activities.LoginRegisterActivity_GeneratedInjector;
import com.example.kelineyt.activities.ShoppingActivity_GeneratedInjector;
import com.example.kelineyt.di.AppModule;
import com.example.kelineyt.fragments.categories.CareFragment_GeneratedInjector;
import com.example.kelineyt.fragments.categories.MainCategoryFragment_GeneratedInjector;
import com.example.kelineyt.fragments.categories.MedDevicesFragment_GeneratedInjector;
import com.example.kelineyt.fragments.categories.MedicineFragment_GeneratedInjector;
import com.example.kelineyt.fragments.categories.NutritionFragment_GeneratedInjector;
import com.example.kelineyt.fragments.categories.OtherFragment_GeneratedInjector;
import com.example.kelineyt.fragments.lognRegister.IntroductionFragment_GeneratedInjector;
import com.example.kelineyt.fragments.lognRegister.LoginFragment_GeneratedInjector;
import com.example.kelineyt.fragments.lognRegister.RegisterFragment_GeneratedInjector;
import com.example.kelineyt.fragments.settings.AllOrdersFragment_GeneratedInjector;
import com.example.kelineyt.fragments.settings.UserAccountFragment_GeneratedInjector;
import com.example.kelineyt.fragments.shopping.AddressFragment_GeneratedInjector;
import com.example.kelineyt.fragments.shopping.BillingFragment_GeneratedInjector;
import com.example.kelineyt.fragments.shopping.ProductDetailsFragment_GeneratedInjector;
import com.example.kelineyt.fragments.shopping.ProfileFragment_GeneratedInjector;
import com.example.kelineyt.viewmodel.AddressViewModel_HiltModules;
import com.example.kelineyt.viewmodel.AllOrdersViewModel_HiltModules;
import com.example.kelineyt.viewmodel.BillingViewModel_HiltModules;
import com.example.kelineyt.viewmodel.CartViewModel_HiltModules;
import com.example.kelineyt.viewmodel.DetailsViewModel_HiltModules;
import com.example.kelineyt.viewmodel.IntroductionViewModel_HiltModules;
import com.example.kelineyt.viewmodel.LoginViewModel_HiltModules;
import com.example.kelineyt.viewmodel.MainCategoryViewModel_HiltModules;
import com.example.kelineyt.viewmodel.OrderViewModel_HiltModules;
import com.example.kelineyt.viewmodel.ProfileViewModel_HiltModules;
import com.example.kelineyt.viewmodel.RegisterViewModel_HiltModules;
import com.example.kelineyt.viewmodel.UserAccountViewModel_HiltModules;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class KelineApplication_HiltComponents {
  private KelineApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AppModule.class,
          ApplicationContextModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements KelineApplication_GeneratedInjector,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddressViewModel_HiltModules.KeyModule.class,
          AllOrdersViewModel_HiltModules.KeyModule.class,
          BillingViewModel_HiltModules.KeyModule.class,
          CartViewModel_HiltModules.KeyModule.class,
          DetailsViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          IntroductionViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          LoginViewModel_HiltModules.KeyModule.class,
          MainCategoryViewModel_HiltModules.KeyModule.class,
          OrderViewModel_HiltModules.KeyModule.class,
          ProfileViewModel_HiltModules.KeyModule.class,
          RegisterViewModel_HiltModules.KeyModule.class,
          UserAccountViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements LoginRegisterActivity_GeneratedInjector,
      ShoppingActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          AddressViewModel_HiltModules.BindsModule.class,
          AllOrdersViewModel_HiltModules.BindsModule.class,
          BillingViewModel_HiltModules.BindsModule.class,
          CartViewModel_HiltModules.BindsModule.class,
          DetailsViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          IntroductionViewModel_HiltModules.BindsModule.class,
          LoginViewModel_HiltModules.BindsModule.class,
          MainCategoryViewModel_HiltModules.BindsModule.class,
          OrderViewModel_HiltModules.BindsModule.class,
          ProfileViewModel_HiltModules.BindsModule.class,
          RegisterViewModel_HiltModules.BindsModule.class,
          UserAccountViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements CareFragment_GeneratedInjector,
      MainCategoryFragment_GeneratedInjector,
      MedDevicesFragment_GeneratedInjector,
      MedicineFragment_GeneratedInjector,
      NutritionFragment_GeneratedInjector,
      OtherFragment_GeneratedInjector,
      IntroductionFragment_GeneratedInjector,
      LoginFragment_GeneratedInjector,
      RegisterFragment_GeneratedInjector,
      AllOrdersFragment_GeneratedInjector,
      UserAccountFragment_GeneratedInjector,
      AddressFragment_GeneratedInjector,
      BillingFragment_GeneratedInjector,
      ProductDetailsFragment_GeneratedInjector,
      ProfileFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
