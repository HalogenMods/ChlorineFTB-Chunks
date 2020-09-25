package dev.hanetzer.chlorineftbchunks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(ChlorineFTBChunks.modID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChlorineFTBChunks {
    public static final String modID = "chlorineftbchunks";

    public ChlorineFTBChunks() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
