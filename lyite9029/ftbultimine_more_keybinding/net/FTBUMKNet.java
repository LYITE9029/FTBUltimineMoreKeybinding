package lyite9029.ftbultimine_more_keybinding.net;

import dev.architectury.networking.simple.MessageType;
import dev.architectury.networking.simple.SimpleNetworkManager;
import lyite9029.ftbultimine_more_keybinding.FTBUltimineMoreKeybinding;

public interface FTBUMKNet {
    SimpleNetworkManager NET = SimpleNetworkManager.create(FTBUltimineMoreKeybinding.MOD_ID);

    MessageType SEND_USE_SET_PACKET = NET.registerS2C("send_use_set_packet", SendUseSetPacket::new);
    MessageType MODE_SET = NET.registerC2S("mode_set", ModeSetPacket::new);

    static void init(){
    }
}
