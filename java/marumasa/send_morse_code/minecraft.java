package marumasa.send_morse_code;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod("send_morse_code")
public class minecraft {

    private static final Logger LOGGER = LogUtils.getLogger();

    public minecraft() {
        MinecraftForge.EVENT_BUS.register((new Events()));
    }
}
