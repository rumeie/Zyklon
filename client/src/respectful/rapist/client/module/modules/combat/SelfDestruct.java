package respectful.rapist.client.module.modules.combat;

import respectful.rapist.client.module.Module;
import respectful.rapist.client.util.ClassLoader;

public class SelfDestruct extends Module {

    public SelfDestruct() {
        super(211, "Self Destruct", "000000");
    }

    @Override
    public void enable() {
        try {
            ClassLoader.findClass("respectful.rapist.loader.Main").getDeclaredMethod("destroy").invoke(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
