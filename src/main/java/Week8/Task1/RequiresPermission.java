<<<<<<< HEAD
package Week8.Task1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequiresPermission {
    PermissionLevel value();
}
=======
package Week8.Task1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface RequiresPermission {
    PermissionLevel value();
}
>>>>>>> ee7a3e2066b705edeaeb71e7cd683b7fb621652d
