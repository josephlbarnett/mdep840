package mdep840

import io.dropwizard.auth.AuthValueFactoryProvider
import java.security.Principal

class Example {
  fun invokeBinder() : Unit {
     AuthValueFactoryProvider.Binder(Principal::class.java)
  }
}
