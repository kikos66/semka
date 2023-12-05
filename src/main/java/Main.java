import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7070);

        app.post("/Register.html", ctx -> { users.add(new User(users.size() - 1,
                ctx.formParam("email"), ctx.formParam("username"), ctx.formParam("password")));
            ctx.redirect("/Login.html");
        });

    }
}


