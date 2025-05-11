package lyite9029.ftbultimine_more_keybinding.net;

import dev.architectury.networking.NetworkManager;
import dev.architectury.networking.simple.BaseS2CMessage;
import dev.architectury.networking.simple.MessageType;
import dev.ftb.mods.ftbultimine.FTBUltimine;
import net.minecraft.network.FriendlyByteBuf;

public class SendUseSetPacket extends BaseS2CMessage {
    public final boolean canUseSetPacket;

    public SendUseSetPacket(boolean canUseSetPacket) {
        this.canUseSetPacket = canUseSetPacket;
    }

    public SendUseSetPacket(FriendlyByteBuf buf) {
        canUseSetPacket = buf.readBoolean();
    }

    public void write(FriendlyByteBuf buf) {
        buf.writeBoolean(canUseSetPacket);
    }

    @Override
    public MessageType getType() {
        return FTBUMKNet.SEND_USE_SET_PACKET;
    }

    @Override
    public void handle(NetworkManager.PacketContext context) {
        context.queue(() -> FTBUltimine.instance.proxy.setCanUseSetPacket(canUseSetPacket));
    }
}
