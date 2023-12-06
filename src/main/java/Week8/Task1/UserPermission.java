package Week8.Task1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UserPermission {
    PermissionLevel value();
}
