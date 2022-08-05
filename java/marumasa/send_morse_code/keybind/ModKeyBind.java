package marumasa.send_morse_code.keybind;

import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.settings.KeyBindingMap;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.awt.event.KeyEvent;

@OnlyIn(Dist.CLIENT)
public class ModKeyBind {
    public static KeyMapping[] ModKeys;

    public static void register(final FMLClientSetupEvent event) {
        ModKeys = new KeyMapping[1];
        ModKeys[0] = crate("toggle", KeyEvent.VK_M);
        new KeyBindingMap();

        for (KeyMapping modKey : ModKeys) {
            ClientRegistry.registerKeyBinding(modKey);
        }
    }

    private static KeyMapping crate(String name, int key) {
        return new KeyMapping("key.send_morse_code." + name, key, "key.category.send_morse_code");
    }

}