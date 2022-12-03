package mdep840;

import io.dropwizard.auth.AuthValueFactoryProvider;
import java.security.Principal;

class Example {
  public void invokeBinder() {
     new AuthValueFactoryProvider.Binder(Principal.class);
  }
}
