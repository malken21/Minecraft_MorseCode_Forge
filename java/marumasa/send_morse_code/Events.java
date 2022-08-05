package marumasa.send_morse_code;

import marumasa.send_morse_code.keybind.ModKeyBind;
import marumasa.send_morse_code.util.MorceCode;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {

    private static final Minecraft mc = Minecraft.getInstance();

    private static boolean toggle = false;

    @SubscribeEvent
    public void onChat(ClientChatEvent event) {
        String text = event.getMessage();
        final String code = MorceCode.toCode(text);
        if (code == null || !toggle) return;
        if (mc.player == null) return;
        event.setMessage(code);
    }

    @SubscribeEvent
    public void KeyInputEvent(InputEvent.KeyInputEvent event) {
        if (ModKeyBind.ModKeys[0].isDown()) {
            ChatComponent chat = Minecraft.getInstance().gui.getChat();
            if (toggle) {
                toggle = false;
                chat.addMessage(new TranslatableComponent("toggle.send_morse_code.off"));
            } else {
                toggle = true;
                chat.addMessage(new TranslatableComponent("toggle.send_morse_code.on"));
            }
        }
    }
}
