package lyite9029.ftbultimine_more_keybinding.net;

import dev.architectury.networking.NetworkManager;
import dev.architectury.networking.simple.BaseC2SMessage;
import dev.architectury.networking.simple.MessageType;
import dev.ftb.mods.ftbultimine.FTBUltimine;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;

public class ModeSetPacket extends BaseC2SMessage {
    public final int shapeId;

    public ModeSetPacket(int i) {
        shapeId = i;
    }

    public ModeSetPacket(FriendlyByteBuf buf) {
        shapeId = buf.readInt();
    }

    public void write(FriendlyByteBuf buf) {
        buf.writeInt(shapeId);
    }

    @Override
    public MessageType getType() {
        return FTBUMKNet.MODE_SET;
    }

    @Override
    public void handle(NetworkManager.PacketContext context) {
        context.queue(() -> FTBUltimine.instance.modeSet((ServerPlayer) context.getPlayer(), shapeId));
    }
}
